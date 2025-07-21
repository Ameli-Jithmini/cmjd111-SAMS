package lk.ijse.cmjd111.studentattendencemanagementsystem.controller;

import lk.ijse.cmjd111.studentattendencemanagementsystem.dto.UserDto;
import lk.ijse.cmjd111.studentattendencemanagementsystem.service.ServiceFactory;
import lk.ijse.cmjd111.studentattendencemanagementsystem.service.custom.UserService;

public class LoginController {

    private final UserService userService = (UserService) ServiceFactory
            .getInstance()
            .getService(ServiceFactory.ServiceTypes.USER);

    public String login(String username, String password) throws Exception {
        UserDto user = userService.getUserByUsername(username);

        if (user != null && user.getPassword().equals(password)) {
            return user.getRole(); // "ADMIN", "LECTURER", etc.
        } else {
            return null; // or throw custom LoginFailedException
        }
    }
}
