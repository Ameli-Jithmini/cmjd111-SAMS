package lk.ijse.cmjd111.studentattendencemanagementsystem.dao.custom;

import lk.ijse.cmjd111.studentattendencemanagementsystem.dao.SuperDao;
import lk.ijse.cmjd111.studentattendencemanagementsystem.entity.UserEntity;

public interface UserDao extends SuperDao {
    UserEntity findByUsername(String username) throws Exception;
}
