package lk.ijse.cmjd111.studentattendencemanagementsystem.service;

import lk.ijse.cmjd111.studentattendencemanagementsystem.service.custom.impl.StudentServiceImpl;
import lk.ijse.cmjd111.studentattendencemanagementsystem.service.custom.impl.LecturerServiceImpl;
import lk.ijse.cmjd111.studentattendencemanagementsystem.service.custom.impl.CourseServiceImpl;
import lk.ijse.cmjd111.studentattendencemanagementsystem.service.custom.impl.UserServiceImpl;
import lk.ijse.cmjd111.studentattendencemanagementsystem.service.custom.UserService;

public class ServiceFactory {

    private static ServiceFactory serviceFactory;

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance() {
        if (serviceFactory == null) {
            serviceFactory = new ServiceFactory();
        }
        return serviceFactory;
    }

    public SuperService getService(ServiceTypes type) {
        switch (type) {
            case STUDENT:
                return new StudentServiceImpl();
            case LECTURER:
                return new LecturerServiceImpl();
            case COURSE:
                return new CourseServiceImpl();
            case USER:
                return new UserServiceImpl();
            default:
                throw new AssertionError("Unknown service type: " + type);
        }
    }

    public enum ServiceTypes {
        STUDENT, LECTURER, COURSE, USER
    }
}
