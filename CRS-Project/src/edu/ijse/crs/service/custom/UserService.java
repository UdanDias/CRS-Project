/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.crs.service.custom;

import edu.ijse.crs.dto.UserDTO;
import edu.ijse.crs.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public interface UserService extends SuperService{
    UserDTO authenticateUser(String username, String password)throws Exception;
    String addUser(UserDTO user) throws Exception;
    int getUserIdByUserName(String userName) throws Exception;
    UserDTO getUser(int userId)throws Exception;
    ArrayList<UserDTO>getAllUsers()throws Exception;
    String updateUser(UserDTO userDto)throws Exception;

}
