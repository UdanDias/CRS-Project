/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.crs.service.custom.impl;

import edu.ijse.crs.dao.DAOFactory;
import edu.ijse.crs.dao.custom.UserDAO;
import edu.ijse.crs.dto.UserDTO;
import edu.ijse.crs.entity.UserEntity;
import edu.ijse.crs.service.custom.UserService;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class UserServiceImpl implements UserService {

    private UserDAO userDAO = (UserDAO) DAOFactory.getInstance().getDao(DAOFactory.DAOTypes.USER);

    @Override
    public UserDTO authenticateUser(String username, String password) throws Exception {
        UserEntity userEntity = userDAO.getUserByUsername(username);
        if (userEntity != null && userEntity.getPassword().equals(password)) {
            return new UserDTO(userEntity.getUserId(), userEntity.getUserName(), userEntity.getPassword(), userEntity.getRole());
        }
        return null;
    }

    @Override
    public String addUser(UserDTO user) throws Exception {
        UserEntity userEntity = new UserEntity(user.getUserName(), user.getPassword(), user.getRole());
        boolean isSaved = userDAO.add(userEntity);
        return isSaved ? "Successfully Added User" : "Failed to Add User";
    }

    @Override
    public int getUserIdByUserName(String userName) throws Exception {
        return userDAO.getUserIdByUserName(userName);
    }

    @Override
    public UserDTO getUser(int userId) throws Exception {
        UserEntity userEntity = userDAO.get(userId);
        if (userEntity != null) {
            return new UserDTO(
                    userEntity.getUserId(),
                    userEntity.getUserName(),
                    userEntity.getPassword(),
                    userEntity.getPassword());
        }
        return null;
    }

    @Override
    public ArrayList<UserDTO> getAllUsers() throws Exception {
        ArrayList<UserEntity> userEntities = userDAO.getAll();
        ArrayList<UserDTO> userDtos = new ArrayList<>();
        if (userEntities != null) {
            for (UserEntity user : userEntities) {
                UserDTO userDTO = new UserDTO(user.getUserId(),
                        user.getUserName(),
                        user.getPassword(),
                        user.getRole()
                );
                userDtos.add(userDTO);

            }
        }
        return userDtos;
    }

    @Override
    public String updateUser(UserDTO userDto) throws Exception {

        UserEntity userEntity = new UserEntity(
                userDto.getUserId(),
                userDto.getUserName(),
                userDto.getPassword(),
                userDto.getRole()
        );

        boolean isUpdated = userDAO.update(userEntity);
        return isUpdated ? "Successfully Updated User" : "Failed to Update User";
    }

}
