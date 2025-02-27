/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.crs.dao.custom.impl;

import edu.ijse.crs.dao.CrudUtil;
import edu.ijse.crs.dao.custom.EnrollmentDAO;
import edu.ijse.crs.entity.EnrollmentEntity;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class EnrollmentDAOImpl implements EnrollmentDAO {

    @Override
    public boolean add(EnrollmentEntity enrollment) throws Exception {

        return CrudUtil.executeUpdate("INSERT INTO enrollment (student_id, course_id, semester, grade) VALUES (?, ?, ?, ?)",
                enrollment.getStudentId(),
                enrollment.getCourseId(),
                enrollment.getSemester(),
                enrollment.getGrade()
        );
    }

    @Override
    public boolean update(EnrollmentEntity enrollment) throws Exception {

        return CrudUtil.executeUpdate("UPDATE enrollment SET semester=?, grade=? WHERE enrollment_id=?",
                enrollment.getSemester(),
                enrollment.getGrade(),
                enrollment.getEnrollmentId()
        );
    }

    @Override
    public boolean delete(Integer enrollmentId) throws Exception {

        return CrudUtil.executeUpdate("DELETE FROM enrollment WHERE enrollment_id=?", enrollmentId);
    }

    @Override
    public EnrollmentEntity get(Integer enrollmentId) throws Exception {

        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM enrollment WHERE enrollment_id=?", enrollmentId);
        if (rst.next()) {
            return new EnrollmentEntity(
                    rst.getInt("enrollment_id"),
                    rst.getInt("student_id"),
                    rst.getInt("course_id"),
                    rst.getString("semester"),
                    rst.getString("grade")
            );
        }
        return null;
    }

    @Override
    public ArrayList<EnrollmentEntity> getAll() throws Exception {

        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM enrollment");
        ArrayList<EnrollmentEntity> enrollmentEntities = new ArrayList<>();
        while (rst.next()) {
            enrollmentEntities.add(new EnrollmentEntity(
                    rst.getInt("enrollment_id"),
                    rst.getInt("student_id"),
                    rst.getInt("course_id"),
                    rst.getString("semester"),
                    rst.getString("grade")
            ));
        }
        return enrollmentEntities;
    }

    @Override
    public ArrayList<EnrollmentEntity> getEnrollmentsByStudentId(int studentId) throws Exception {

        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM enrollment WHERE student_id=?", studentId);
        ArrayList<EnrollmentEntity> enrollmentEntities = new ArrayList<>();
        while (rst.next()) {
            enrollmentEntities.add(new EnrollmentEntity(
                    rst.getInt("enrollment_id"),
                    rst.getInt("student_id"),
                    rst.getInt("course_id"),
                    rst.getString("semester"),
                    rst.getString("grade")
            ));
        }
        return enrollmentEntities;
    }

//    
    @Override
    public int getStudentIdbyUserId(int userId) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT student_id FROM student WHERE user_id = ?;", userId);
        if (rst.next()) {  // Ensure there's a result before accessing it
            int studentId = rst.getInt("student_id");
            return studentId;
        }

        return -1;
    }

    @Override
    public boolean dropCourse(int enrollmentId) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM enrollment WHERE enrollment_id=?", enrollmentId);
    }

    @Override
    public boolean assignGrade(EnrollmentEntity enrollmentEntity) throws Exception {
        return CrudUtil.executeUpdate("UPDATE enrollment SET grade=? WHERE enrollment_id=?",
                enrollmentEntity.getGrade(),
                enrollmentEntity.getEnrollmentId()
        );
    }

    @Override
    public int getUniqueStudentCount(int courseId) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT COUNT(DISTINCT student_id) AS unique_students FROM enrollment WHERE course_id=?", courseId);
        if (rst.next()) {
            return rst.getInt("unique_students");
        }
        return 0;
    }

    @Override
    public ArrayList<EnrollmentEntity> getAllEnrollmentByCourseId(int courseId) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM enrollment WHERE course_id=?", courseId);
        ArrayList<EnrollmentEntity> enrollmentEntities = new ArrayList<>();
        while (rst.next()) {
            enrollmentEntities.add(new EnrollmentEntity(
                    rst.getInt("enrollment_id"),
                    rst.getInt("student_id"),
                    rst.getInt("course_id"),
                    rst.getString("semester"),
                    rst.getString("grade")
            ));
        }
        return enrollmentEntities;
    }

    @Override
    public boolean isStudentEnrolled(int studentId, int courseId) throws Exception {
        ResultSet rst = CrudUtil.executeQuery(
                "SELECT COUNT(*) FROM enrollment WHERE student_id = ? AND course_id = ?",
                studentId, courseId
        );
        if (rst.next()) {
            return rst.getInt(1) > 0;
        }
        return false;
    }

    @Override
    public List<Integer> getEnrolledCoursesByStudent(int studentId) throws Exception {
        List<Integer> courseIds = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT course_id FROM enrollment WHERE student_id=?", studentId);

        while (rst.next()) {
            courseIds.add(rst.getInt("course_id"));
        }
        return courseIds;
    }

    @Override
    public boolean deleteEnrollmentsByStudent(int studentId) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM enrollment WHERE student_id=?", studentId);
    }

}
