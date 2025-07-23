package lk.ijse.cmjd111.studentattendencemanagementsystem.dao.custom.impl;

import lk.ijse.cmjd111.studentattendencemanagementsystem.dao.CrudUtil;
import lk.ijse.cmjd111.studentattendencemanagementsystem.dao.custom.CourseDao;
import lk.ijse.cmjd111.studentattendencemanagementsystem.entity.CourseEntity;
import java.util.ArrayList;


public class CourseDaoImpl implements CourseDao{

    @Override
    public boolean save(CourseEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Courses VALUES(?,?,?)",
                t.getCourseId(), t.getDate(), t.getStId());
    }

    @Override
    public boolean update(CourseEntity t) throws Exception {
        return true;
    }

    @Override
    public boolean delete(String id) throws Exception {
        return true;
    }

    @Override
    public CourseEntity search(String id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<CourseEntity> getAll() throws Exception {
        return null;
    }

}