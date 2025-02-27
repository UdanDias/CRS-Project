/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.crs.service.custom;

import edu.ijse.crs.dto.EnrollmentDTO;
import edu.ijse.crs.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public interface EnrollmentService extends SuperService{
    String enrollStudent(EnrollmentDTO enrollment)throws Exception;
    String dropCourse(int enrollment)throws Exception;
    ArrayList<EnrollmentDTO> getEnrollmentsByStudent(int studentId)throws Exception;
    int getStudentIdbyUserId(int userId) throws Exception;
    String assignGrade(EnrollmentDTO enrollmentDTO)throws Exception;
    ArrayList<EnrollmentDTO>getAllEnrollments()throws Exception;
    EnrollmentDTO getEnrollment(int EnrollmentId)throws Exception;
    int getUniqueStudentCount(int courseId)throws Exception;
    ArrayList<EnrollmentDTO>getAllEnrollmentByCourseId(int courseId)throws Exception;
}
