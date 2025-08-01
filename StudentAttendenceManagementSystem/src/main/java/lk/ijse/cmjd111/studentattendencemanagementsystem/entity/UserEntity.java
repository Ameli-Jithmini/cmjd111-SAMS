package lk.ijse.cmjd111.studentattendencemanagementsystem.entity;

public class UserEntity {
    private String username;
    private String password;
    private String role;

    public UserEntity() {}

    public UserEntity(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getRole() { return role; }

    public void setUsername(String username) { this.username = username; }
    public void setPassword(String password) { this.password = password; }
    public void setRole(String role) { this.role = role; }
}