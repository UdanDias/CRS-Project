/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.crs.service.custom;

import edu.ijse.crs.dto.FacultyDTO;
import edu.ijse.crs.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public interface FacultyService extends SuperService{
    String addFaculty(FacultyDTO course)throws Exception;
    String updateFaculty(FacultyDTO course)throws Exception;
    String deleteFaculty(int facultyId)throws Exception;
    FacultyDTO getFaculty(int facultyId)throws Exception;
    ArrayList<FacultyDTO> getAllFaculties()throws Exception;
}
