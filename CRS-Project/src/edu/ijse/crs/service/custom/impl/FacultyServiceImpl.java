/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.crs.service.custom.impl;

import edu.ijse.crs.dao.DAOFactory;
import edu.ijse.crs.dao.custom.FacultyDAO;
import edu.ijse.crs.dto.FacultyDTO;
import edu.ijse.crs.entity.FacultyEntity;
import edu.ijse.crs.service.custom.FacultyService;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class FacultyServiceImpl implements FacultyService{
    private FacultyDAO facultyDAO = (FacultyDAO) DAOFactory.getInstance().getDao(DAOFactory.DAOTypes.FACULTY);

    @Override
    public String addFaculty(FacultyDTO faculty) throws Exception {
        FacultyEntity facultyEntity = new FacultyEntity(
                faculty.getName(),
                faculty.getDepartment(),
                faculty.getContact(),
                faculty.getUserId()
        );

        boolean isSaved = facultyDAO.add(facultyEntity);
        return isSaved ? "Successfully Added Faculty member" : "Failed to Add Faculty member";
    }

    @Override
    public String updateFaculty(FacultyDTO faculty) throws Exception {
        FacultyEntity facultyEntity = new FacultyEntity(
                faculty.getFacultyId(),
                faculty.getName(),
                faculty.getDepartment(),
                faculty.getContact(),
                faculty.getUserId()
        );

        boolean isUpdated = facultyDAO.update(facultyEntity);
        return isUpdated ? "Successfully Update Faculty member" : "Failed to Update Faculty member";
    }

    @Override
    public String deleteFaculty(int facultyId) throws Exception {
        boolean isDeleted = facultyDAO.delete(facultyId);
        return isDeleted ? "Successfully Deleted Faculty member" : "Failed to Delete Faculty member";
    }

    @Override
    public FacultyDTO getFaculty(int facultyId) throws Exception {
        FacultyEntity facultyEntity = facultyDAO.get(facultyId);
        if (facultyEntity != null) {
            return new FacultyDTO(facultyEntity.getFacultyId(),
                    facultyEntity.getName(),
                    facultyEntity.getDepartment(),
                    facultyEntity.getContact(),
                    facultyEntity.getUserId());
        }
        return null;
    }

    @Override
    public ArrayList<FacultyDTO> getAllFaculties() throws Exception {
        ArrayList<FacultyEntity> facultyEntities = facultyDAO.getAll();
        ArrayList<FacultyDTO> facultyDtos = new ArrayList<>();
        if (facultyEntities != null) {
            for (FacultyEntity facultyEntity : facultyEntities) {
                FacultyDTO dto = new FacultyDTO(facultyEntity.getFacultyId(),
                        facultyEntity.getName(),
                        facultyEntity.getDepartment(),
                        facultyEntity.getContact(),
                        facultyEntity.getUserId()
                );
                facultyDtos.add(dto);
            }
        }

        return facultyDtos;
    }
}
