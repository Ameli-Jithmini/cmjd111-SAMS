package lk.ijse.cmjd111.studentattendencemanagementsystem.service.custom;

import lk.ijse.cmjd111.studentattendencemanagementsystem.dto.UserDto;
import lk.ijse.cmjd111.studentattendencemanagementsystem.service.SuperService;

public interface UserService extends SuperService {
    UserDto getUserByUsername(String username) throws Exception;
}