/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.crs.dao.custom.impl;

import java.sql.Connection;
import edu.ijse.crs.dao.CrudUtil;
import edu.ijse.crs.dao.custom.CourseDAO;
import edu.ijse.crs.db.DBConnection;
import edu.ijse.crs.entity.CourseEntity;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class CourseDAOImpl implements CourseDAO {

    @Override
    public boolean add(CourseEntity course) throws Exception {

        return CrudUtil.executeUpdate("INSERT INTO course (title, credit_hours, department, max_enrollment,available_seats) VALUES (?, ?, ?, ?,?)",
                course.getTitle(),
                course.getCreditHours(),
                course.getDepartment(),
                course.getMaxEnrollment(),
                course.getAvailableSeats()
        );
    }

    @Override
    public boolean update(CourseEntity course) throws Exception {

        return CrudUtil.executeUpdate("UPDATE course SET title=?, credit_hours=?, department=?, max_enrollment=?,available_seats=? WHERE course_id=?",
                course.getTitle(),
                course.getCreditHours(),
                course.getDepartment(),
                course.getMaxEnrollment(),
                course.getAvailableSeats(),
                course.getCourseId()
        );
    }

    @Override
    public boolean delete(Integer courseId) throws Exception {
        Connection connection = null;
        boolean isDeleted = false;

        try {
            
            connection = DBConnection.getInstance().getConnection();

            
            connection.setAutoCommit(false);

            
            boolean enrollmentsDeleted = CrudUtil.executeUpdate(
                    "DELETE FROM enrollment WHERE course_id = ?", courseId
            );

            
            if (enrollmentsDeleted) {
                isDeleted = CrudUtil.executeUpdate(
                        "DELETE FROM course WHERE course_id = ?", courseId
                );
            }

            
            if (isDeleted) {
                connection.commit();
            } else {
                connection.rollback();  
            }
        } catch (Exception e) {
            if (connection != null) {
                connection.rollback();  
            }
            throw e;  
        } finally {
            if (connection != null) {
                connection.setAutoCommit(true);  
            }
        }

        return isDeleted;
    }

    @Override
    public CourseEntity get(Integer courseId) throws Exception {

        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM course WHERE course_id=?", courseId);
        if (rst.next()) {
            return new CourseEntity(
                    rst.getInt("course_id"),
                    rst.getString("title"),
                    rst.getInt("credit_hours"),
                    rst.getString("department"),
                    rst.getInt("max_enrollment"),
                    rst.getInt("available_seats")
            );
        }
        return null;
    }

    @Override
    public ArrayList<CourseEntity> getAll() throws Exception {

        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM course");
        ArrayList<CourseEntity> courseEntities = new ArrayList<>();
        while (rst.next()) {
            courseEntities.add(new CourseEntity(
                    rst.getInt("course_id"),
                    rst.getString("title"),
                    rst.getInt("credit_hours"),
                    rst.getString("department"),
                    rst.getInt("max_enrollment"),
                    rst.getInt("available_seats")
            ));
        }
        return courseEntities;
    }

    @Override
    public int getCourseIdByCourseName(String title) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT course_id FROM course WHERE title=?", title);
        if (rst.next()) {
            int courseId = rst.getInt("course_id");
            return courseId;
        }
        return -1;
    }

    @Override
    public CourseEntity getCourseByCourseTitle(String title) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM course WHERE title=?", title);
        if (rst.next()) {
            return new CourseEntity(
                    rst.getInt("course_id"),
                    rst.getString("title"),
                    rst.getInt("credit_hours"),
                    rst.getString("department"),
                    rst.getInt("max_enrollment"),
                    rst.getInt("available_seats")
            );

        }
        return null;
    }

    @Override
    public int getAvailableSeats(int courseId) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT max_enrollment - (SELECT COUNT(DISTINCT student_id) FROM enrollment WHERE course_id = ?) AS available_seats FROM course WHERE course_id = ?", courseId, courseId);
        if (rst.next()) {
            return rst.getInt("available_seats");
        }
        return 0;
    }

    @Override
    public boolean updateAvailableSeats(int courseId, int newSeats) throws Exception {
        return CrudUtil.executeUpdate("UPDATE course SET available_seats = ? WHERE course_id = ?", newSeats, courseId);
    }

    @Override
    public boolean incrementAvailableSeats(int courseId) throws Exception {
        return CrudUtil.executeUpdate("UPDATE course SET available_seats = available_seats + 1 WHERE course_id=?", courseId);
    }

}
