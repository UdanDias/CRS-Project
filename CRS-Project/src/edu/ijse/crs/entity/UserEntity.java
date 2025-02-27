/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.crs.entity;

/**
 *
 * @author USER
 */
public class UserEntity {

    private int userId;
    private String userName;
    private String password;
    private String role;

    public UserEntity(int userId, String username, String password, String role) {
        this.userId = userId;
        this.userName = username;
        this.password = password;
        this.role = role;
    }

    public UserEntity(String username, String password, String role) {
        this.userName = username;
        this.password = password;
        this.role = role;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
