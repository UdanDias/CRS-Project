/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.crs.dao.custom;

import edu.ijse.crs.dao.CrudDAO;
import edu.ijse.crs.entity.EnrollmentEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
//public interface EnrollmentDAO extends CrudDAO<EnrollmentEntity,Integer>{
//    
//}
public interface EnrollmentDAO extends CrudDAO<EnrollmentEntity, Integer> {

    ArrayList<EnrollmentEntity> getEnrollmentsByStudentId(int studentId) throws Exception;

    int getStudentIdbyUserId(int userId) throws Exception;

    boolean dropCourse(int enrollmentId) throws Exception;

    boolean assignGrade(EnrollmentEntity enrollmentEntity) throws Exception;

    int getUniqueStudentCount(int enrollmentId) throws Exception;

    ArrayList<EnrollmentEntity> getAllEnrollmentByCourseId(int courseId) throws Exception;

    boolean isStudentEnrolled(int studentId, int courseId) throws Exception;

    List<Integer> getEnrolledCoursesByStudent(int studentId) throws Exception;

    boolean deleteEnrollmentsByStudent(int studentId) throws Exception;

}
