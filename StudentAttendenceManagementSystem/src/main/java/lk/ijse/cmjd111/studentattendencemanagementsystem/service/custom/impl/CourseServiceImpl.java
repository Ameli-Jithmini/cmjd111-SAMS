package lk.ijse.cmjd111.studentattendencemanagementsystem.service.custom.impl;

import lk.ijse.cmjd111.studentattendencemanagementsystem.dao.DaoFactory;
import lk.ijse.cmjd111.studentattendencemanagementsystem.dao.custom.LecturerDao;
import lk.ijse.cmjd111.studentattendencemanagementsystem.dao.custom.CourseDao;
import lk.ijse.cmjd111.studentattendencemanagementsystem.dao.custom.CourseDetailDao;
import lk.ijse.cmjd111.studentattendencemanagementsystem.db.DBConnection;
import lk.ijse.cmjd111.studentattendencemanagementsystem.dto.CourseDetailDto;
import lk.ijse.cmjd111.studentattendencemanagementsystem.dto.CourseDto;
import lk.ijse.cmjd111.studentattendencemanagementsystem.entity.LecturerEntity;
import lk.ijse.cmjd111.studentattendencemanagementsystem.entity.CourseDetailEntity;
import lk.ijse.cmjd111.studentattendencemanagementsystem.entity.CourseEntity;
import lk.ijse.cmjd111.studentattendencemanagementsystem.service.custom.CourseService;

import java.sql.Connection;

public class CourseServiceImpl implements CourseService {

    private CourseDao courseDao = (CourseDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.COURSE);
    private CourseDetailDao courseDetailDao = (CourseDetailDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.COURSE_DETAIL);
    private LecturerDao lecturerDao = (LecturerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.LECTURER);

    @Override
    public String placeCourse(CourseDto courseDto) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        try {
            connection.setAutoCommit(false);

            // Create CourseEntity and save
            CourseEntity courseEntity = new CourseEntity(
                    courseDto.getCourseId(),
                    courseDto.getDate(),
                    courseDto.getStId()
            );

            if (courseDao.save(courseEntity)) {
                boolean isCourseDetailSaved = true;

                // Save each CourseDetail
                for (CourseDetailDto detailDto : courseDto.getCourseDetailDtos()) {
                    CourseDetailEntity detailEntity = new CourseDetailEntity(
                            courseDto.getCourseId(),   // course ID
                            detailDto.getLecName()     // lecturer name
                    );

                    if (!courseDetailDao.save(detailEntity)) {
                        isCourseDetailSaved = false;
                        break;
                    }
                }

                if (isCourseDetailSaved) {
                    boolean isLecturerUpdated = true;

                    for (CourseDetailDto detailDto : courseDto.getCourseDetailDtos()) {
                        LecturerEntity lecturerEntity = lecturerDao.search(detailDto.getCourse());

                        if (lecturerEntity != null) {
                            // Assign the course to the lecturer
                            lecturerEntity.setCourse(detailDto.getCourse());

                            if (!lecturerDao.update(lecturerEntity)) {
                                isLecturerUpdated = false;
                                break;
                            }
                        }
                    }

                    if (isLecturerUpdated) {
                        connection.commit();
                        return "Success";
                    } else {
                        connection.rollback();
                        return "Lecturer Update Error";
                    }
                } else {
                    connection.rollback();
                    return "Course Detail Save Error";
                }
            } else {
                connection.rollback();
                return "Course Save Error";
            }

        } catch (Exception e) {
            connection.rollback();
            e.printStackTrace();
            return "Fail";
        } finally {
            connection.setAutoCommit(true);
        }
    }
}
