/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.crs.dao.custom;

import edu.ijse.crs.dao.CrudDAO;
import edu.ijse.crs.entity.UserEntity;

/**
 *
 * @author USER
 */
public interface UserDAO extends CrudDAO<UserEntity, Integer> {
    UserEntity getUserByUsername(String username)throws Exception;
    int getUserIdByUserName(String userName) throws Exception;

}