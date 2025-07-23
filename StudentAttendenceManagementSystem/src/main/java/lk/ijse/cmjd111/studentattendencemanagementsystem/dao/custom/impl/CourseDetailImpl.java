package lk.ijse.cmjd111.studentattendencemanagementsystem.dao.custom.impl;

import lk.ijse.cmjd111.studentattendencemanagementsystem.dao.CrudUtil;
import lk.ijse.cmjd111.studentattendencemanagementsystem.dao.custom.CourseDetailDao;
import lk.ijse.cmjd111.studentattendencemanagementsystem.entity.CourseDetailEntity;
import java.util.ArrayList;


public class CourseDetailImpl implements CourseDetailDao{

    @Override
    public boolean save(CourseDetailEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Coursedetail VALUES(?,?)",
                t.getCourse(), t.getLecName());
    }

    @Override
    public boolean update(CourseDetailEntity t) throws Exception {
        return true;
    }

    @Override
    public boolean delete(Object id) throws Exception {
        return true;
    }

    @Override
    public CourseDetailEntity search(Object id) throws Exception {
        return null;
    }

    @Override
    public ArrayList<CourseDetailEntity> getAll() throws Exception {
        return null;
    }

}