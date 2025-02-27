/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.crs.dto;

/**
 *
 * @author USER
 */
import java.time.LocalDate;

public class StudentDTO {

    private int studentId;
    private String name;
    private LocalDate dob;
    private String program;
    private int year;
    private String contact;
    private int userId;

    public StudentDTO(int studentId, String name, LocalDate dob, String program, int year, String contact, int userId) {
        this.studentId = studentId;
        this.name = name;
        this.dob = dob;
        this.program = program;
        this.year = year;
        this.contact = contact;
        this.userId = userId;
    }

    public StudentDTO(String name, LocalDate dob, String program, int year, String contact, int userId) {
        this.name = name;
        this.dob = dob;
        this.program = program;
        this.year = year;
        this.contact = contact;
        this.userId = userId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

}
