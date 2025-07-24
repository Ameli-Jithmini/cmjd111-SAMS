package lk.ijse.cmjd111.studentattendencemanagementsystem.dao.custom.impl;

import lk.ijse.cmjd111.studentattendencemanagementsystem.dao.custom.UserDao;
import lk.ijse.cmjd111.studentattendencemanagementsystem.db.DBConnection;
import lk.ijse.cmjd111.studentattendencemanagementsystem.entity.UserEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDaoImpl implements UserDao {

    @Override
    public UserEntity findByUsername(String username) throws Exception {
        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM users WHERE username = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, username);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            return new UserEntity(
                    rs.getString("username"),
                    rs.getString("password"),
                    rs.getString("role")
            );
        }
        return null;
    }
}