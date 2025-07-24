package lk.ijse.cmjd111.studentattendencemanagementsystem.entity;

public class StudentEntity {

    private String stId;
    private String stName;
    private String dob;
    private String address;
    private String course;

    public StudentEntity() {
    }

    public StudentEntity(String stId, String stName, String dob, String address, String course) {
        this.stId = stId;
        this.stName = stName;
        this.dob = dob;
        this.address = address;
        this.course = course;
    }

    /**
     * @return the id
     */
    public String getStId() {
        return stId;
    }

    /**
     * @param stId the id to set
     */
    public void setStId(String stId) {
        this.stId = stId;
    }

    /**
     * @return the name
     */
    public String getStName() {
        return stName;
    }

    /**
     * @param stName the name to set
     */
    public void setStName(String stName) {
        this.stName = stName;
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
        return "StudentEntity{" + "id=" + stId + ", name=" + stName + ", dob=" + dob + ", address=" + address + ", course=" + course + '}';
    }
}

