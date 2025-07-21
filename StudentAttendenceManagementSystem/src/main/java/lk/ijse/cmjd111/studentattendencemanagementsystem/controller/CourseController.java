package lk.ijse.cmjd111.studentattendencemanagementsystem.controller;

import lk.ijse.cmjd111.studentattendencemanagementsystem.dto.CourseDto;
import lk.ijse.cmjd111.studentattendencemanagementsystem.service.ServiceFactory;
import lk.ijse.cmjd111.studentattendencemanagementsystem.service.custom.CourseService;


public class CourseController {

    private CourseService courseService = (CourseService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceTypes.COURSE);

    public String placeCourse(CourseDto courseDto) throws Exception{
        return courseService.placeCourse(courseDto);
    }
}
