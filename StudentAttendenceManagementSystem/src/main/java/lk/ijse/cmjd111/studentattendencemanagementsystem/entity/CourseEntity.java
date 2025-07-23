package lk.ijse.cmjd111.studentattendencemanagementsystem.entity;


public class CourseEntity {
    private String courseId;
    private String date;
    private String stId;


    public CourseEntity() {
    }

    public CourseEntity(String courseId, String date, String stId) {
        this.courseId = courseId;
        this.date = date;
        this.stId = stId;
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



    @Override
    public String toString() {
        return "CourseEntity{" + "courseId=" + courseId + ", date=" + date + ", stId=" + stId + '}';
    }


}