package lk.ijse.cmjd111.studentattendencemanagementsystem.entity;

public class LecturerEntity {

    private String lecId;
    private String lecName;
    private String dob;
    private String address;
    private String course;

    public LecturerEntity() {
    }

    public LecturerEntity(String lecId, String lecName, String dob, String address, String course) {
        this.lecId = lecId;
        this.lecName = lecName;
        this.dob = dob;
        this.address = address;
        this.course = course;
    }

    /**
     * @return the id
     */
    public String getLecId() {
        return lecId;
    }

    /**
     * @param lecId the id to set
     */
    public void setLecId(String lecId) {
        this.lecId = lecId;
    }

    /**
     * @return the name
     */
    public String getLecName() {
        return lecName;
    }

    /**
     * @param lecName the name to set
     */
    public void setLecName(String lecName) {
        this.lecName = lecName;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the course
     */
    public String getCourse() {
        return course;
    }

    /**
     * @param course the city to set
     */
    public void setCourse(String course) {
        this.course = course;
    }


    @Override
    public String toString() {
        return "LecturerEntity{" + "id=" + lecId + ", name=" + lecName + ", dob=" + dob + ", address=" + address + ", course=" + course + '}';
    }
}

