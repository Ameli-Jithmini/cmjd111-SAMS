package lk.ijse.cmjd111.studentattendencemanagementsystem.service.custom;

import lk.ijse.cmjd111.studentattendencemanagementsystem.dto.StudentDto;
import lk.ijse.cmjd111.studentattendencemanagementsystem.service.SuperService;
import java.util.ArrayList;


public interface StudentService extends SuperService{
    public String saveStudent(StudentDto studentDto) throws Exception;
    public String updateStudent(StudentDto studentDto) throws Exception;
    public String deleteStudent(String code) throws Exception;
    public StudentDto searchStudent(String code) throws Exception;
    public ArrayList<StudentDto> getAllStudent() throws Exception;
}