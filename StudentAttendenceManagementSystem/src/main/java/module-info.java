module lk.ijse.cmjd111.studentattendencemanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens lk.ijse.cmjd111.studentattendencemanagementsystem to javafx.fxml;
    exports lk.ijse.cmjd111.studentattendencemanagementsystem;
}