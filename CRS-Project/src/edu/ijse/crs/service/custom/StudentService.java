/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.crs.service.custom;

import edu.ijse.crs.dto.StudentDTO;
import edu.ijse.crs.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public interface StudentService extends SuperService {
    String addStudent(StudentDTO student)throws Exception;
    String updateStudent(StudentDTO student)throws Exception;
    String deleteStudent(int studentId)throws Exception;
    StudentDTO getStudent(int studentId)throws Exception;
    ArrayList<StudentDTO> getAllStudents()throws Exception;
    StudentDTO getStudentByStudentName(String studentName)throws Exception;
}
