/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.crs.controller;

import edu.ijse.crs.dto.UserDTO;
import edu.ijse.crs.service.ServiceFactory;
import edu.ijse.crs.service.custom.UserService;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class UserController {

    private UserService userService = (UserService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.USER);

    public UserDTO authenticateUser(String username, String password) throws Exception {
        return userService.authenticateUser(username, password);
    }

    public String addUser(UserDTO userDTO) throws Exception {
        return userService.addUser(userDTO);
    }

    public int getUserIdByUserName(String userName) throws Exception {
        return userService.getUserIdByUserName(userName);
    }

    public UserDTO getUser(int userId) throws Exception {
        return userService.getUser(userId);
    }

    public ArrayList<UserDTO> getAllUsers() throws Exception {
        return userService.getAllUsers();
    }
    public String updateUser(UserDTO userDto)throws Exception{
        return userService.updateUser(userDto);
    }

}
