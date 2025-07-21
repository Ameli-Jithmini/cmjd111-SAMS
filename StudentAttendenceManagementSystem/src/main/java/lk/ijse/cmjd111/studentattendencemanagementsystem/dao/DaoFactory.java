package lk.ijse.cmjd111.studentattendencemanagementsystem.dao;

import lk.ijse.cmjd111.studentattendencemanagementsystem.dao.custom.impl.StudentDaoImpl;
import lk.ijse.cmjd111.studentattendencemanagementsystem.custom.impl.CourseDaoImpl;
import lk.ijse.cmjd111.studentattendencemanagementsystem.dao.custom.impl.LecturerDaoImpl;
import lk.ijse.cmjd111.studentattendencemanagementsystem.dao.custom.impl.CourseDetailImpl;


public class DaoFactory {

    private static DaoFactory daoFactory;

    private DaoFactory(){}

    public static DaoFactory getInstance(){
        if(daoFactory == null){
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }

    public SuperDao getDao(DaoTypes type){
        switch (type) {
            case STUDENT:
                return new StudentDaoImpl();
            case LECTURER:
                return new LecturerDaoImpl();
            case COURSE:
                return new CourseDaoImpl();
            case COURSE_DETAIL:
                return new CourseDetailImpl();
            default:
                return null;
        }
    }

    public enum DaoTypes{
        STUDENT, LECTURER, COURSE, COURSE_DETAIL
    }

}