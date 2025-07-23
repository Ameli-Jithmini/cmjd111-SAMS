package lk.ijse.cmjd111.studentattendencemanagementsystem.entity;

public class LecturerEntity {

    private String id;
    private String name;
    private String dob;
    private String address;
    private String course;

    public LecturerEntity() {
    }

    public LecturerEntity(String id, String name, String dob, String address, String course) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.course = course;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
        return "LecturerEntity{" + "id=" + id + ", name=" + name + ", dob=" + dob + ", address=" + address + ", course=" + course + '}';
    }
}

