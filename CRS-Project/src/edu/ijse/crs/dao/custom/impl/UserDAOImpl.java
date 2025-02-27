/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.crs.dao.custom.impl;

import edu.ijse.crs.dao.CrudUtil;
import edu.ijse.crs.dao.custom.UserDAO;
import edu.ijse.crs.entity.UserEntity;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class UserDAOImpl implements UserDAO {

    @Override
    public boolean add(UserEntity user) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO user (username, password, role) VALUES (?, ?, ?)",
                user.getUserName(),
                user.getPassword(),
                user.getRole());
    }

    @Override
    public boolean update(UserEntity user) throws Exception {

        return CrudUtil.executeUpdate("UPDATE user SET username=?, password=?, role=? WHERE user_id=?",
                user.getUserName(),
                user.getPassword(),
                user.getRole(),
                user.getUserId()
        );
    }

    @Override
    public boolean delete(Integer userId) throws Exception {

        return CrudUtil.executeUpdate("DELETE FROM user WHERE user_id=?", userId);

    }

    @Override
    public UserEntity get(Integer userId) throws Exception {

        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM user WHERE user_id=?", userId);
        if (rst.next()) {
            return new UserEntity(
                    rst.getInt("user_id"),
                    rst.getString("username"),
                    rst.getString("password"),
                    rst.getString("role")
            );
        }
        return null;
    }

    @Override
    public UserEntity getUserByUsername(String username) throws Exception {

        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM user WHERE username=?", username);
        if (rst.next()) {
            return new UserEntity(
                    rst.getInt("user_id"),
                    rst.getString("username"),
                    rst.getString("password"),
                    rst.getString("role")
            );
        }
        return null;
    }

    @Override
    public ArrayList<UserEntity> getAll() throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM user");
        ArrayList<UserEntity> userEntities = new ArrayList<>();
        while (rst.next()) {
            userEntities.add(new UserEntity(
                    rst.getInt("user_id"),
                    rst.getString("username"),
                    rst.getString("password"),
                    rst.getString("role")
            ));
        }
        return userEntities;
    }

    @Override
    public int getUserIdByUserName(String userName) throws Exception {
        ResultSet rs = CrudUtil.executeQuery("SELECT user_id FROM user WHERE username = ?", userName);
        if (rs.next()) {
            return rs.getInt("user_id");
        }
        return -1; 
    }

}
