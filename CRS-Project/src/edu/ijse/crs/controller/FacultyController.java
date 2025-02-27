/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.crs.controller;

import edu.ijse.crs.dto.FacultyDTO;
import edu.ijse.crs.service.ServiceFactory;
import edu.ijse.crs.service.custom.FacultyService;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class FacultyController {

    private FacultyService facultyService = (FacultyService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.FACULTY);

    public String addFaculty(FacultyDTO facultyDTO) throws Exception {
        return facultyService.addFaculty(facultyDTO);
    }

    public String updateFaculty(FacultyDTO facultyDTO) throws Exception {
        return facultyService.updateFaculty(facultyDTO);
    }

    public String deleteFaculty(int facultyId) throws Exception {
        return facultyService.deleteFaculty(facultyId);
    }

    public FacultyDTO getFaculty(int facultyId) throws Exception {
        return facultyService.getFaculty(facultyId);
    }

    public ArrayList<FacultyDTO> getAllFaculties() throws Exception {
        return facultyService.getAllFaculties();
    }
}
