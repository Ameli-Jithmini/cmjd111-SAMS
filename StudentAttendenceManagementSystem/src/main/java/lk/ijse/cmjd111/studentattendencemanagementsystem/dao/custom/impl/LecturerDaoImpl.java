package lk.ijse.cmjd111.studentattendencemanagementsystem.dao.custom.impl;

import lk.ijse.cmjd111.studentattendencemanagementsystem.dao.CrudUtil;
import lk.ijse.cmjd111.studentattendencemanagementsystem.dao.custom.LecturerDao;
import lk.ijse.cmjd111.studentattendencemanagementsystem.entity.LecturerEntity;
import java.util.ArrayList;
import java.sql.ResultSet;


public class LecturerDaoImpl implements LecturerDao{

    @Override
    public boolean save(LecturerEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Lecturer VALUES(?,?,?,?,?)",
                t.getLecId(),
                t.getLecName(),
                t.getDob(),
                t.getAddress(),
                t.getCourse());
    }

    @Override
    public boolean update(LecturerEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE Lecturer SET LecName = ?, DOB= ?,"
                        + "Address= ?, Course= ?, WHERE"
                        + "LecID = ?",
                t.getLecName(),
                t.getDob(),
                t.getAddress(),
                t.getCourse(),
                t.getLecId());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE from Lecturer WHERE LecID=?", id);
    }

    @Override
    public LecturerEntity search(String id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Lecturer WHERE LecID = ?", id);
        if(rst.next()){
            return new LecturerEntity(
                    rst.getString("LecId"),
                    rst.getString("LecName"),
                    rst.getString("DOB"),
                    rst.getString("Address"),
                    rst.getString("Course"));
        }
        return null;
    }

    @Override
    public ArrayList<LecturerEntity> getAll() throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Lecturer");
        ArrayList<LecturerEntity> LecturerEntities = new ArrayList<>();

        while (rst.next()) {
            LecturerEntities.add(new LecturerEntity(
                    rst.getString("LecId"),
                    rst.getString("LecName"),
                    rst.getString("DOB"),
                    rst.getString("Address"),
                    rst.getString("Course")));
        }
        return LecturerEntities;
    }

}
