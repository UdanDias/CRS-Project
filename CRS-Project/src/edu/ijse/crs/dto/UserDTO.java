/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.crs.dto;

/**
 *
 * @author USER
 */
public class UserDTO {

    private int userId;
    private String userName;
    private String password;
    private String role;

    public UserDTO(int userId, String username, String password, String role) {
        this.userId = userId;
        this.userName = username;
        this.password = password;
        this.role = role;
    }

    public UserDTO(String username, String password, String role) {
        this.userName = username;
        this.password = password;
        this.role = role;
    }
    public UserDTO(){
        
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
