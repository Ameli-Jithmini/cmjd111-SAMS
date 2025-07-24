package lk.ijse.cmjd111.studentattendencemanagementsystem.service.custom;

import lk.ijse.cmjd111.studentattendencemanagementsystem.dto.CourseDto;
import lk.ijse.cmjd111.studentattendencemanagementsystem.service.SuperService;


public interface CourseService extends SuperService{
    public String placeCourse(CourseDto courseDto) throws Exception;
}