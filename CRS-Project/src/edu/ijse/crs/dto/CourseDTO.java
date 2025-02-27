/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.crs.dto;

/**
 *
 * @author USER
 */
public class CourseDTO {

    private int courseId;
    private String title;
    private int creditHours;
    private String department;
    private int maxEnrollment;
    private int availableSeats;

    public CourseDTO(int courseId, String title, int creditHours, String department, int maxEnrollment, int availableSeats) {
        this.courseId = courseId;
        this.title = title;
        this.creditHours = creditHours;
        this.department = department;
        this.maxEnrollment = maxEnrollment;
        this.availableSeats = availableSeats;
    }

    public CourseDTO(String title, int creditHours, String department, int maxEnrollment, int availableSeats) {
        this.title = title;
        this.creditHours = creditHours;
        this.department = department;
        this.maxEnrollment = maxEnrollment;
        this.availableSeats = availableSeats;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getMaxEnrollment() {
        return maxEnrollment;
    }

    public void setMaxEnrollment(int maxEnrollment) {
        this.maxEnrollment = maxEnrollment;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

}
