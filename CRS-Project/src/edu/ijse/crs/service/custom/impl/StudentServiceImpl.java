/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.crs.service.custom.impl;

import java.sql.Connection;
import edu.ijse.crs.dao.DAOFactory;
import edu.ijse.crs.dao.custom.CourseDAO;
import edu.ijse.crs.dao.custom.EnrollmentDAO;
import edu.ijse.crs.dao.custom.StudentDAO;
import edu.ijse.crs.dao.custom.UserDAO;
import edu.ijse.crs.db.DBConnection;
import edu.ijse.crs.dto.StudentDTO;
import edu.ijse.crs.entity.StudentEntity;
import edu.ijse.crs.service.custom.StudentService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class StudentServiceImpl implements StudentService {

    private StudentDAO studentDAO = (StudentDAO) DAOFactory.getInstance().getDao(DAOFactory.DAOTypes.STUDENT);

    @Override
    public String addStudent(StudentDTO student) throws Exception {
        StudentEntity studentEntity = new StudentEntity(student.getName(),
                student.getDob(),
                student.getProgram(),
                student.getYear(),
                student.getContact(),
                student.getUserId());

        boolean isSaved = studentDAO.add(studentEntity);
        return isSaved ? "Successfully Added Student" : "Failed to Add Student";
    }

    @Override
    public String updateStudent(StudentDTO student) throws Exception {
        StudentEntity studentEntity = new StudentEntity(student.getStudentId(),
                student.getName(),
                student.getDob(),
                student.getProgram(),
                student.getYear(),
                student.getContact(),
                student.getUserId());

        boolean isUpdated = studentDAO.update(studentEntity);
        return isUpdated ? "Successfully Updated Student" : "Failed to Update Student";
    }

    @Override
    public String deleteStudent(int studentId) throws Exception {
        Connection connection = null;
        try {
            
            
            connection = DBConnection.getInstance().getConnection();
            connection.setAutoCommit(false);

            
            
            StudentEntity studentEntity = studentDAO.get(studentId);
            if (studentEntity == null) {
                return "Student not found!";
            }
            int userId = studentEntity.getUserId();

            
            
            EnrollmentDAO enrollmentDAO = (EnrollmentDAO) DAOFactory.getInstance().getDao(DAOFactory.DAOTypes.ENROLLMENT);
            CourseDAO courseDAO = (CourseDAO) DAOFactory.getInstance().getDao(DAOFactory.DAOTypes.COURSE);
            List<Integer> enrolledCourseIds = enrollmentDAO.getEnrolledCoursesByStudent(studentId);

            
            
            boolean enrollmentsDeleted = enrollmentDAO.deleteEnrollmentsByStudent(studentId);
            if (!enrollmentsDeleted) {
                connection.rollback();
                return "Failed to delete enrollments!";
            }

            
            for (Integer courseId : enrolledCourseIds) {
                boolean seatsUpdated = courseDAO.incrementAvailableSeats(courseId);
                if (!seatsUpdated) {
                    connection.rollback();
                    return "Failed to update course seats!";
                }
            }

            
            boolean isStudentDeleted = studentDAO.delete(studentId);
            if (!isStudentDeleted) {
                connection.rollback();
                return "Failed to delete student!";
            }

            
            UserDAO userDAO = (UserDAO) DAOFactory.getInstance().getDao(DAOFactory.DAOTypes.USER);
            boolean isUserDeleted = userDAO.delete(userId);
            if (!isUserDeleted) {
                connection.rollback();
                return "Student deleted, but failed to delete associated user.";
            }

            
            connection.commit();
            return "Student, enrollments, and user deleted successfully!";

        } catch (Exception e) {
            if (connection != null) {
                connection.rollback(); 
            }
            e.printStackTrace();
            return "Error occurred while deleting student!";
        } finally {
            if (connection != null) {
                connection.setAutoCommit(true); 
            }
        }
    }

    @Override
    public StudentDTO getStudent(int studentId) throws Exception {
        StudentEntity studentEntity = studentDAO.get(studentId);
        if (studentEntity != null) {
            return new StudentDTO(
                    studentEntity.getName(),
                    studentEntity.getDob(),
                    studentEntity.getProgram(),
                    studentEntity.getYear(),
                    studentEntity.getContact(),
                    studentEntity.getUserId());
        }
        return null;
    }

    @Override
    public ArrayList<StudentDTO> getAllStudents() throws Exception {
        ArrayList<StudentEntity> studentEntities = studentDAO.getAll();
        ArrayList<StudentDTO> studentDtos = new ArrayList<>();
        if (studentEntities != null) {
            for (StudentEntity studentEntity : studentEntities) {
                StudentDTO dto = new StudentDTO(studentEntity.getStudentId(),
                        studentEntity.getName(),
                        studentEntity.getDob(),
                        studentEntity.getProgram(),
                        studentEntity.getYear(),
                        studentEntity.getContact(),
                        studentEntity.getUserId());
                studentDtos.add(dto);
            }
        }

        return studentDtos;
    }

    @Override
    public StudentDTO getStudentByStudentName(String studentName) throws Exception {
        StudentEntity studentEntity = studentDAO.getStudentByStudentName(studentName);
        if (studentEntity != null) {
            return new StudentDTO(
                    studentEntity.getStudentId(),
                    studentEntity.getName(),
                    studentEntity.getDob(),
                    studentEntity.getProgram(),
                    studentEntity.getYear(),
                    studentEntity.getContact(),
                    studentEntity.getUserId());
        }
        return null;
    }
}
