/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.crs.controller;

import edu.ijse.crs.dto.AdminDTO;
import edu.ijse.crs.service.ServiceFactory;
import edu.ijse.crs.service.custom.AdminService;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class AdminController {

    private AdminService adminService = (AdminService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ADMIN);

    public String addAdmin(AdminDTO adminDTO) throws Exception {
        return adminService.addAdmin(adminDTO);
    }

    public String updateAdmin(AdminDTO adminDTO) throws Exception {
        return adminService.updateAdmin(adminDTO);
    }

    public String deleteAdmin(int adminId) throws Exception {
        return adminService.deleteAdmin(adminId);
    }

    public AdminDTO getAdmin(int adminId) throws Exception {
        return adminService.getAdmin(adminId);
    }

    public ArrayList<AdminDTO> getAllAdmins() throws Exception {
        return adminService.getAllAdmins();
    }

}
