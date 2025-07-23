package lk.ijse.cmjd111.studentattendencemanagementsystem.dto;

public class CourseDetailDto {
    private String course;
    private String lecName;

    public CourseDetailDto() {
    }

    public CourseDetailDto(String course, String lecName) {
        this.course = course;
        this.lecName = lecName;
    }

    /**
     * @return the course
     */
    public String getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(String course) {
        this.course = course;
    }

    /**
     * @return the lecName
     */
    public String getLecName() {
        return lecName;
    }

    /**
     * @param lecName the lecName to set
     */
    public void setLecName(String lecName) {
        this.lecName = lecName;
    }

    @Override
    public String toString() {
        return "CourseDetailDto{course=" + course + ", lecName=" + lecName + '}';
    }


}