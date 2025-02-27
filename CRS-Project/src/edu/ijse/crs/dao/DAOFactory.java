/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.crs.dao;

import edu.ijse.crs.dao.custom.impl.AdminDAOImpl;
import edu.ijse.crs.dao.custom.impl.CourseDAOImpl;
import edu.ijse.crs.dao.custom.impl.EnrollmentDAOImpl;
import edu.ijse.crs.dao.custom.impl.FacultyDAOImpl;
import edu.ijse.crs.dao.custom.impl.StudentDAOImpl;
import edu.ijse.crs.dao.custom.impl.UserDAOImpl;

/**
 *
 * @author USER
 */
public class DAOFactory {

    private static DAOFactory daoFactory;

    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }

    public SuperDAO getDao(DAOTypes type) {
        switch (type) {
            case STUDENT:

                return new StudentDAOImpl();
            case COURSE:

                return new CourseDAOImpl();
            case ENROLLMENT:

                return new EnrollmentDAOImpl();
            case USER:

                return new UserDAOImpl();
            case ADMIN:

                return new AdminDAOImpl();
            case FACULTY:

                return new FacultyDAOImpl();
            default:
                return null;
        }
    }

    public enum DAOTypes {
        STUDENT, COURSE, ENROLLMENT, USER, ADMIN, FACULTY
    }

}
