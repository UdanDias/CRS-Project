/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.crs.controller;

import edu.ijse.crs.dto.StudentDTO;
import edu.ijse.crs.service.ServiceFactory;
import edu.ijse.crs.service.custom.StudentService;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class StudentController {

    private StudentService studentService = (StudentService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.STUDENT);

    public String addStudent(StudentDTO studentDTO) throws Exception {
        return studentService.addStudent(studentDTO);
    }

    public String updateStudent(StudentDTO studentDTO) throws Exception {
        return studentService.updateStudent(studentDTO);
    }

    public String deleteStudent(int studentId) throws Exception {
        return studentService.deleteStudent(studentId);
    }

    public StudentDTO getStudent(int studentId) throws Exception {
        return studentService.getStudent(studentId);
    }

    public ArrayList<StudentDTO> getAllStudents() throws Exception {
        return studentService.getAllStudents();
    }
    public StudentDTO getStudentByStudentName(String studentName) throws Exception {
        return studentService.getStudentByStudentName(studentName);
    }

}
