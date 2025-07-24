package lk.ijse.cmjd111.studentattendencemanagementsystem.dto;

import java.util.ArrayList;


public class CourseDto {
    private String courseId;
    private String date;
    private String stId;

    private ArrayList<CourseDetailDto> courseDetailDtos;

    public CourseDto() {
    }

    public CourseDto(String courseId, String date, String stId, ArrayList<CourseDetailDto> courseDetailDtos) {
        this.courseId = courseId;
        this.date = date;
        this.stId = stId;
        this.courseDetailDtos = courseDetailDtos;
    }

    /**
     * @return the courseId
     */
    public String getCourseId() {
        return courseId;
    }

    /**
     * @param courseId the orderId to set
     */
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the stId
     */
    public String getStId() {
        return stId;
    }

    /**
     * @param stId the stId to set
     */
    public void setStId(String stId) {
        this.stId = stId;
    }

    /**
     * @return the courseDetailDtos
     */
    public ArrayList<CourseDetailDto> getCourseDetailDtos() {
        return courseDetailDtos;
    }

    /**
     * @param CourseDetailDtos the courseDetailDtos to set
     */
    public void setCourseDetailDtos(ArrayList<CourseDetailDto> CourseDetailDtos) {
        this.courseDetailDtos = courseDetailDtos;
    }

    @Override
    public String toString() {
        return "CourseDto{" + "courseId=" + courseId + ", date=" + date + ", stId=" + stId + ", courseDetailDtos=" + courseDetailDtos + '}';
    }


}