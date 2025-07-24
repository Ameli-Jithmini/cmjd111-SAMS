package lk.ijse.cmjd111.studentattendencemanagementsystem.service.custom.impl;

import lk.ijse.cmjd111.studentattendencemanagementsystem.dao.DaoFactory;
import lk.ijse.cmjd111.studentattendencemanagementsystem.dao.custom.StudentDao;
import lk.ijse.cmjd111.studentattendencemanagementsystem.dto.StudentDto;
import lk.ijse.cmjd111.studentattendencemanagementsystem.entity.StudentEntity;
import lk.ijse.cmjd111.studentattendencemanagementsystem.service.custom.StudentService;
import java.util.ArrayList;


public class StudentServiceImpl implements StudentService{
    private StudentDao studentDao = (StudentDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.STUDENT);

    @Override
    public String saveStudent(StudentDto studentDto) throws Exception {
        StudentEntity entity = new StudentEntity(
                studentDto.getStId(),
                studentDto.getStName(),studentDto.getDob(),
                studentDto.getAddress(),
                studentDto.getCourse());

        return studentDao.save(entity)? "Success" : "Fail";

    }

    @Override
    public String updateStudent(StudentDto studentDto) throws Exception {
        StudentEntity entity = new StudentEntity(
                studentDto.getStId(),
                studentDto.getStName(),studentDto.getDob(),
                studentDto.getAddress(),
                studentDto.getCourse());

        return studentDao.update(entity)? "Success" : "Fail";
    }

    @Override
    public String deleteStudent(String code) throws Exception {
        return studentDao.delete(code) ? "Success": "Fail";
    }

    @Override
    public StudentDto searchStudent(String code) throws Exception {
        StudentEntity entity = studentDao.search(code);
        if(entity != null) {
            return new StudentDto(entity.getStId(),
                    entity.getStName(), entity.getDob(), entity.getAddress(),
                    entity.getCourse());
        }
        return null;
    }

    @Override
    public ArrayList<StudentDto> getAllStudent() throws Exception {
        ArrayList<StudentDto> studentDtos = new ArrayList<>();

        ArrayList<StudentEntity> studentEntities = studentDao.getAll();
        studentEntities.forEach(entity-> {
            studentDtos.add(new StudentDto(entity.getStId(),
                    entity.getStName(), entity.getDob(), entity.getAddress(),
                    entity.getCourse()));
        });

        return studentDtos;
    }
}
