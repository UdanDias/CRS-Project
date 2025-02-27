/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.crs.service.custom;

import edu.ijse.crs.dto.AdminDTO;
import edu.ijse.crs.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public interface AdminService extends SuperService{
    String addAdmin(AdminDTO student)throws Exception;
    String updateAdmin(AdminDTO student)throws Exception;
    String deleteAdmin(int adminId)throws Exception;
    AdminDTO getAdmin(int adminId)throws Exception;
    ArrayList<AdminDTO> getAllAdmins()throws Exception;
}
