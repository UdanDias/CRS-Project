/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.crs.service.custom.impl;

import edu.ijse.crs.dao.DAOFactory;
import edu.ijse.crs.dao.custom.CourseDAO;
import edu.ijse.crs.dao.custom.EnrollmentDAO;
import edu.ijse.crs.db.DBConnection;
import edu.ijse.crs.dto.EnrollmentDTO;
import edu.ijse.crs.entity.EnrollmentEntity;
import edu.ijse.crs.service.custom.EnrollmentService;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class EnrollmentServiceImpl implements EnrollmentService {

    private EnrollmentDAO enrollmentDAO = (EnrollmentDAO) DAOFactory.getInstance().getDao(DAOFactory.DAOTypes.ENROLLMENT);
    private CourseDAO courseDAO = (CourseDAO) DAOFactory.getInstance().getDao(DAOFactory.DAOTypes.COURSE);

    @Override

    public String enrollStudent(EnrollmentDTO enrollment) throws Exception {
        try {
            
            
            DBConnection.getInstance().getConnection().setAutoCommit(false);

            int studentId = enrollment.getStudentId();
            int courseId = enrollment.getCourseId();

            
            
            if (enrollmentDAO.isStudentEnrolled(studentId, courseId)) {
                DBConnection.getInstance().getConnection().rollback();
                return "Student is already enrolled in this course.";
            }

            
            
            int availableSeats = courseDAO.getAvailableSeats(courseId);
            if (availableSeats <= 0) {
                DBConnection.getInstance().getConnection().rollback();
                return "No available seats for this course.";
            }

            
            
            EnrollmentEntity enrollmentEntity = new EnrollmentEntity(
                    studentId, courseId, enrollment.getSemester(), enrollment.getGrade()
            );

            boolean isEnrolled = enrollmentDAO.add(enrollmentEntity);
            if (!isEnrolled) {
                DBConnection.getInstance().getConnection().rollback();
                return "Failed to enroll the student.";
            }

            
            
            boolean isUpdated = courseDAO.updateAvailableSeats(courseId, availableSeats - 1);
            if (!isUpdated) {
                DBConnection.getInstance().getConnection().rollback();
                return "Failed to update available seats.";
            }

            
            
            DBConnection.getInstance().getConnection().commit();
            return "Successfully Added Enrollment";

        } catch (Exception e) {
            DBConnection.getInstance().getConnection().rollback();
            throw e;
        } finally {
            DBConnection.getInstance().getConnection().setAutoCommit(true);
        }
    }

    @Override
    public String dropCourse(int enrollmentId) throws Exception {
        try {
            
            
            DBConnection.getInstance().getConnection().setAutoCommit(false);

            
            
            EnrollmentEntity enrollment = enrollmentDAO.get(enrollmentId);
            if (enrollment == null) {
                DBConnection.getInstance().getConnection().rollback();
                return "Enrollment record not found.";
            }

            int courseId = enrollment.getCourseId();

            
            
            boolean isDropped = enrollmentDAO.dropCourse(enrollmentId);
            if (!isDropped) {
                DBConnection.getInstance().getConnection().rollback();
                return "Failed to drop the course.";
            }

            
            
            int availableSeats = courseDAO.getAvailableSeats(courseId);
            boolean isUpdated = courseDAO.updateAvailableSeats(courseId, availableSeats + 1);
            if (!isUpdated) {
                DBConnection.getInstance().getConnection().rollback();
                return "Failed to update available seats.";
            }

            
            
            DBConnection.getInstance().getConnection().commit();
            return "Successfully Dropped Course";

        } catch (Exception e) {
            DBConnection.getInstance().getConnection().rollback();
            throw e;
        } finally {
            DBConnection.getInstance().getConnection().setAutoCommit(true);
        }
    }

    @Override
    public ArrayList<EnrollmentDTO> getEnrollmentsByStudent(int studentId) throws Exception {
        ArrayList<EnrollmentEntity> enrollmentEntities = enrollmentDAO.getEnrollmentsByStudentId(studentId);
        ArrayList<EnrollmentDTO> enrollmentDtos = new ArrayList<>();
        if (enrollmentEntities != null) {
            for (EnrollmentEntity enrollmentEntity : enrollmentEntities) {
                EnrollmentDTO dto = new EnrollmentDTO(enrollmentEntity.getEnrollmentId(),
                        enrollmentEntity.getStudentId(),
                        enrollmentEntity.getCourseId(),
                        enrollmentEntity.getSemester(),
                        enrollmentEntity.getGrade()
                );
                enrollmentDtos.add(dto);
            }
        }

        return enrollmentDtos;
    }

    @Override
    public int getStudentIdbyUserId(int userId) throws Exception {
        int loggedStudentId = enrollmentDAO.getStudentIdbyUserId(userId);
        return loggedStudentId;
    }

    @Override
    public String assignGrade(EnrollmentDTO enrollmentDTO) throws Exception {
        EnrollmentEntity enrollmentEntity = new EnrollmentEntity(
                enrollmentDTO.getEnrollmentId(),
                enrollmentDTO.getGrade());
        boolean isAssignedGrade = enrollmentDAO.assignGrade(enrollmentEntity);
        return isAssignedGrade ? "Successfully Assigned Grade" : "Faild to Assign Grade";

    }

    @Override
    public ArrayList<EnrollmentDTO> getAllEnrollments() throws Exception {

        ArrayList<EnrollmentEntity> enrollmentEntities = enrollmentDAO.getAll();
        ArrayList<EnrollmentDTO> enrollmentDtos = new ArrayList<>();
        if (enrollmentEntities != null) {
            for (EnrollmentEntity enrollmentEntity : enrollmentEntities) {
                EnrollmentDTO dto = new EnrollmentDTO(enrollmentEntity.getEnrollmentId(),
                        enrollmentEntity.getStudentId(),
                        enrollmentEntity.getCourseId(),
                        enrollmentEntity.getSemester(),
                        enrollmentEntity.getGrade()
                );
                enrollmentDtos.add(dto);
            }
        }

        return enrollmentDtos;
    }

    @Override
    public EnrollmentDTO getEnrollment(int enrollmentId) throws Exception {
        EnrollmentEntity enrollmentEntity = enrollmentDAO.get(enrollmentId);
        if (enrollmentEntity != null) {
            return new EnrollmentDTO(enrollmentEntity.getEnrollmentId(),
                    enrollmentEntity.getStudentId(),
                    enrollmentEntity.getCourseId(),
                    enrollmentEntity.getSemester(),
                    enrollmentEntity.getGrade()
            );
        }
        return null;
    }

    @Override
    public int getUniqueStudentCount(int courseId) throws Exception {
        return enrollmentDAO.getUniqueStudentCount(courseId);

    }

    @Override
    public ArrayList<EnrollmentDTO> getAllEnrollmentByCourseId(int courseId) throws Exception {

        ArrayList<EnrollmentEntity> enrollmentEntities = enrollmentDAO.getAllEnrollmentByCourseId(courseId);
        ArrayList<EnrollmentDTO> enrollmentDtos = new ArrayList<>();
        if (enrollmentEntities != null) {
            for (EnrollmentEntity enrollmentEntity : enrollmentEntities) {
                EnrollmentDTO dto = new EnrollmentDTO(enrollmentEntity.getEnrollmentId(),
                        enrollmentEntity.getStudentId(),
                        enrollmentEntity.getCourseId(),
                        enrollmentEntity.getSemester(),
                        enrollmentEntity.getGrade()
                );
                enrollmentDtos.add(dto);
            }
        }

        return enrollmentDtos;
    }

}
