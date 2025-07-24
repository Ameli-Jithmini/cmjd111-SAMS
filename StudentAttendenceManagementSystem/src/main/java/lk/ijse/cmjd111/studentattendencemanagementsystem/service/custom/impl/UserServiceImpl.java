package lk.ijse.cmjd111.studentattendencemanagementsystem.service.custom.impl;

import lk.ijse.cmjd111.studentattendencemanagementsystem.dao.DaoFactory;
import lk.ijse.cmjd111.studentattendencemanagementsystem.dao.custom.UserDao;
import lk.ijse.cmjd111.studentattendencemanagementsystem.dto.UserDto;
import lk.ijse.cmjd111.studentattendencemanagementsystem.entity.UserEntity;
import lk.ijse.cmjd111.studentattendencemanagementsystem.service.custom.UserService;

public class UserServiceImpl implements UserService {

    private final UserDao userDao = (UserDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.USER);

    @Override
    public UserDto getUserByUsername(String username) throws Exception {
        UserEntity entity = userDao.findByUsername(username);
        if (entity != null) {
            return new UserDto(entity.getUsername(), entity.getPassword(), entity.getRole());
        }
        return null;
    }
}