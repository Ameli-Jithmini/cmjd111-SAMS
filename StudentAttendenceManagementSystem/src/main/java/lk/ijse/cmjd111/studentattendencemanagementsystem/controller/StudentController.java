package lk.ijse.cmjd111.studentattendencemanagementsystem.controller;

import lk.ijse.cmjd111.studentattendencemanagementsystem.dto.StudentDto;
import lk.ijse.cmjd111.studentattendencemanagementsystem.service.ServiceFactory;
import lk.ijse.cmjd111.studentattendencemanagementsystem.service.custom.StudentService;
import java.util.ArrayList;


public class StudentController {

    private StudentService studentService = (StudentService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceTypes.STUDENT);

    public String saveStudent(StudentDto studentDto) throws Exception{
        return studentService.saveStudent(studentDto);
    }
    public String updateStudent(StudentDto studentDto) throws Exception{
        return studentService.updateStudent(studentDto);
    }

    public String deleteStudent(String id) throws Exception{
        return studentService.deleteStudent(id);
    }

    public StudentDto searchStudent(String id) throws Exception{
        return studentService.searchStudent(id);
    }

    public ArrayList<StudentDto> getAllStudent() throws Exception{
        return studentService.getAllStudent();
    }
}