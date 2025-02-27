/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.crs.dto;

/**
 *
 * @author USER
 */
public class EnrollmentDTO {

    private int enrollmentId;
    private int studentId;
    private int courseId;
    private String semester;
    private String grade;

    public EnrollmentDTO(int enrollmentId, int studentId, int courseId, String semester, String grade) {
        this.enrollmentId = enrollmentId;
        this.studentId = studentId;
        this.courseId = courseId;
        this.semester = semester;
        this.grade = grade;
    }

    public EnrollmentDTO(int studentId, int courseId, String semester, String grade) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.semester = semester;
        this.grade = grade;
    }

    public EnrollmentDTO() {
    }
    
    public EnrollmentDTO(int enrollmentId, String grade) {
        this.enrollmentId = enrollmentId;
        this.grade = grade;
    }

    public int getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(int enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
