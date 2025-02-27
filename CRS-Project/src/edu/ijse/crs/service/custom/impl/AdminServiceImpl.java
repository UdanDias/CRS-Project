/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.crs.service.custom.impl;

import edu.ijse.crs.dao.DAOFactory;
import edu.ijse.crs.dao.custom.AdminDAO;
import edu.ijse.crs.dto.AdminDTO;
import edu.ijse.crs.entity.AdminEntity;
import edu.ijse.crs.service.custom.AdminService;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class AdminServiceImpl implements AdminService {

    private AdminDAO adminDAO = (AdminDAO) DAOFactory.getInstance().getDao(DAOFactory.DAOTypes.ADMIN);

    @Override
    public String addAdmin(AdminDTO admin) throws Exception {
        AdminEntity adminEntity = new AdminEntity(
                admin.getName(),
                admin.getContact(),
                admin.getUserId()
        );

        boolean isSaved = adminDAO.add(adminEntity);
        return isSaved ? "Successfully Added Admin" : "Failed to Add Admin";
    }

    @Override
    public String updateAdmin(AdminDTO admin) throws Exception {
        AdminEntity adminEntity = new AdminEntity(
                admin.getAdminId(),
                admin.getName(),
                admin.getContact(),
                admin.getUserId()
        );

        boolean isUpdated = adminDAO.update(adminEntity);
        return isUpdated ? "Successfully Updated Admin" : "Failed to Update Admin";
    }

    @Override
    public String deleteAdmin(int adminId) throws Exception {
        boolean isDeleted = adminDAO.delete(adminId);
        return isDeleted ? "Successfully Deleted Admin" : "Failed to Delete Admin";
    }

    @Override
    public AdminDTO getAdmin(int adminId) throws Exception {
        AdminEntity adminEntity = adminDAO.get(adminId);
        if (adminEntity != null) {
            return new AdminDTO(adminEntity.getAdminId(),
                    adminEntity.getName(),
                    adminEntity.getContact(),
                    adminEntity.getUserId());
        }
        return null;
    }

    @Override
    public ArrayList<AdminDTO> getAllAdmins() throws Exception {
        ArrayList<AdminEntity> adminEntities = adminDAO.getAll();
        ArrayList<AdminDTO> adminDtos = new ArrayList<>();
        if (adminEntities != null) {
            for (AdminEntity adminEntity : adminEntities) {
                AdminDTO dto = new AdminDTO(adminEntity.getAdminId(),
                        adminEntity.getName(),
                        adminEntity.getContact(),
                        adminEntity.getUserId()
                );
                adminDtos.add(dto);
            }
        }

        return adminDtos;
    }
}
