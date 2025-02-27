/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.crs.service;

import edu.ijse.crs.service.custom.impl.AdminServiceImpl;
import edu.ijse.crs.service.custom.impl.CourseServiceImpl;
import edu.ijse.crs.service.custom.impl.EnrollmentServiceImpl;
import edu.ijse.crs.service.custom.impl.FacultyServiceImpl;
import edu.ijse.crs.service.custom.impl.StudentServiceImpl;
import edu.ijse.crs.service.custom.impl.UserServiceImpl;

/**
 *
 * @author USER
 */
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

    public SuperService getService(ServiceType type) {
        switch (type) {
            case STUDENT:

                return new StudentServiceImpl();
            case COURSE:

                return new CourseServiceImpl();
            case ENROLLMENT:

                return new EnrollmentServiceImpl();
            case USER:

                return new UserServiceImpl();
            case ADMIN:

                return new AdminServiceImpl();
            case FACULTY:

                return new FacultyServiceImpl();
            default:
                return null;
        }

    }

    public enum ServiceType {
        STUDENT, COURSE, ENROLLMENT, USER, ADMIN, FACULTY
    }

}
