package lk.ijse.cmjd111.studentattendencemanagementsystem.dao.custom.impl;

import lk.ijse.cmjd111.studentattendencemanagementsystem.dao.CrudUtil;
import lk.ijse.cmjd111.studentattendencemanagementsystem.dao.custom.StudentDao;
import lk.ijse.cmjd111.studentattendencemanagementsystem.entity.StudentEntity;
import java.util.ArrayList;
import java.sql.ResultSet;


public class StudentDaoImpl implements StudentDao{

    @Override
    public boolean save(StudentEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Student VALUES(?,?,?,?,?)",
                t.getStId(),
                t.getStName(),
                t.getDob(),
                t.getAddress(),
                t.getCourse());
    }

    @Override
    public boolean update(StudentEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE Student SET StName = ?, DOB= ?,"
                        + "Address= ?, Course= ?, WHERE"
                        + "StID = ?",
                t.getStName(),
                t.getDob(),
                t.getAddress(),
                t.getCourse(),
                t.getStId());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE from Student WHERE StID=?", id);
    }

    @Override
    public StudentEntity search(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Student WHERE StID = ?", id);
        if(rst.next()){
            return new StudentEntity(
                    rst.getString("StId"),
                    rst.getString("StName"),
                    rst.getString("DOB"),
                    rst.getString("Address"),
                    rst.getString("Course"));
        }
        return null;
    }

    @Override
    public ArrayList<StudentEntity> getAll() throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Student");
        ArrayList<StudentEntity> studentEntities = new ArrayList<>();

        while (rst.next()) {
            studentEntities.add(new StudentEntity(
                    rst.getString("StId"),
                    rst.getString("StName"),
                    rst.getString("DOB"),
                    rst.getString("StAddress"),
                    rst.getString("Course")));
        }
        return studentEntities;
    }

}