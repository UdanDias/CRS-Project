/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.crs.controller;

import edu.ijse.crs.dto.EnrollmentDTO;
import edu.ijse.crs.service.ServiceFactory;
import edu.ijse.crs.service.custom.EnrollmentService;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class EnrollmentController {

    private EnrollmentService enrollmentService = (EnrollmentService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ENROLLMENT);
    
    public String enrollStudent(EnrollmentDTO enrollmentDTO) throws Exception {
        return enrollmentService.enrollStudent(enrollmentDTO);
    }
    
    public String dropCourse(int enrollmentId) throws Exception {
        return enrollmentService.dropCourse(enrollmentId);
    }

    public ArrayList<EnrollmentDTO> getEnrollmentsByStudent(int studentId) throws Exception {
        return enrollmentService.getEnrollmentsByStudent(studentId);
    }
    public int getStudentIdbyUserId(int userId)throws Exception{
        return enrollmentService.getStudentIdbyUserId(userId);
    }
    public String assignGrade(EnrollmentDTO enrollmentDTO)throws Exception{
        return enrollmentService.assignGrade(enrollmentDTO);
    }
    public ArrayList<EnrollmentDTO> getAllEnrollments() throws Exception {
        return enrollmentService.getAllEnrollments();
    }
    public EnrollmentDTO getEnrollment(int enrollmentId) throws Exception {
        return enrollmentService.getEnrollment(enrollmentId);
    }
    public int getUniqueStudentCount(int courseId)throws Exception{
        return enrollmentService.getUniqueStudentCount(courseId);
    }
    public ArrayList<EnrollmentDTO>getAllEnrollmentByCourseId(int courseId)throws Exception{
        return enrollmentService.getAllEnrollmentByCourseId(courseId);
    }
}
