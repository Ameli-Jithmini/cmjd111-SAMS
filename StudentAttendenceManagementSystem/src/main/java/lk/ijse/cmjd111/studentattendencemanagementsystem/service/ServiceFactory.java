package lk.ijse.cmjd111.studentattendencemanagementsystem.service;

import lk.ijse.cmjd111.studentattendencemanagementsystem.service.custom.impl.CustomerServiceImpl;
import lk.ijse.cmjd111.studentattendencemanagementsystem.service.custom.impl.ItemServiceImpl;
import lk.ijse.cmjd111.studentattendencemanagementsystem.service.custom.impl.OrderServiceImpl;


public class ServiceFactory {
    private static ServiceFactory serviceFactory;

    private ServiceFactory() {
    }

    public static ServiceFactory getInstance(){
        if(serviceFactory == null){
            serviceFactory = new ServiceFactory();
        }
        return serviceFactory;
    }

    public SuperService getService(ServiceTypes type){
        switch (type) {
            case STUDENT:
                return new StudentServiceImpl();
            case LECTURER:
                return new LecturerServiceImpl();
            case COURSE:
                return new CourseServiceImpl();
            default:
                throw new AssertionError();
        }
    }

    public enum ServiceTypes{
        STUDENT, LECTURER, COURSE
    }
}
