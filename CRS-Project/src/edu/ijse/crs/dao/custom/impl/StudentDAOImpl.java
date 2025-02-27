/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.crs.dao.custom.impl;

import edu.ijse.crs.dao.CrudUtil;
import edu.ijse.crs.dao.custom.StudentDAO;
import edu.ijse.crs.entity.StudentEntity;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class StudentDAOImpl implements StudentDAO {
    
    @Override
    public boolean add(StudentEntity student) throws Exception {
        
        return CrudUtil.executeUpdate("INSERT INTO student (name, dob, program, year, contact,user_id) VALUES (?, ?, ?, ?, ?,?)",
                student.getName(),
                Date.valueOf(student.getDob()),
                student.getProgram(),
                student.getYear(),
                student.getContact(),
                student.getUserId()
        );
        
    }
    
    @Override
    public boolean update(StudentEntity student) throws Exception {

        return CrudUtil.executeUpdate("UPDATE student SET name=?, dob=?, program=?, year=?, contact=? WHERE student_id=?",
                student.getName(),
                Date.valueOf(student.getDob()),
                student.getProgram(),
                student.getYear(),
                student.getContact(),
                student.getStudentId()
        );
    }
    
    @Override
    public boolean delete(Integer studentId) throws Exception {

        return CrudUtil.executeUpdate("DELETE FROM student WHERE student_id=?", studentId);
    }
    
    @Override
    public StudentEntity get(Integer studentId) throws Exception {
        
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM student WHERE student_id=?", studentId);
        if (rst.next()) {
            return new StudentEntity(rst.getInt("student_id"),
                    rst.getString("name"),
                    rst.getDate("dob").toLocalDate(),
                    rst.getString("program"),
                    rst.getInt("year"),
                    rst.getString("contact"),
                    rst.getInt("user_id"));
        }
        return null;
    }
    
    @Override
    public ArrayList<StudentEntity> getAll() throws Exception {
        
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM student");
        ArrayList<StudentEntity> studentEntities = new ArrayList<>();
        while (rst.next()) {
            studentEntities.add(new StudentEntity(
                    rst.getInt("student_id"),
                    rst.getString("name"),
                    rst.getDate("dob").toLocalDate(),
                    rst.getString("program"),
                    rst.getInt("year"),
                    rst.getString("contact"),
                    rst.getInt("user_id")
            ));
        }
        return studentEntities;
    }

    @Override
    public StudentEntity getStudentByStudentName(String studentName) throws Exception {
        
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM student WHERE name=?", studentName);
        if (rst.next()) {
            return new StudentEntity(rst.getInt("student_id"),
                    rst.getString("name"),
                    rst.getDate("dob").toLocalDate(),
                    rst.getString("program"),
                    rst.getInt("year"),
                    rst.getString("contact"),
                    rst.getInt("user_id"));
        }
        return null;
    }
    
}
