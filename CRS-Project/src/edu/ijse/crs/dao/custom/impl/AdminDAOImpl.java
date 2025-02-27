/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.crs.dao.custom.impl;

import edu.ijse.crs.dao.CrudUtil;
import edu.ijse.crs.dao.custom.AdminDAO;
import edu.ijse.crs.entity.AdminEntity;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author USER
 */
public class AdminDAOImpl implements AdminDAO {

    @Override
    public boolean add(AdminEntity admin) throws Exception {

        return CrudUtil.executeUpdate("INSERT INTO admin (name,contact,user_id) VALUES (?, ?,?)",
                admin.getName(),
                admin.getContact(),
                admin.getUserId()
        );
    }

    @Override
    public boolean update(AdminEntity admin) throws Exception {

        return CrudUtil.executeUpdate("UPDATE admin SET name=?,contact=? WHERE admin_id=?",
                admin.getName(),
                admin.getContact(),
                admin.getAdminId()
        );
    }

    @Override
    public boolean delete(Integer adminId) throws Exception {

        return CrudUtil.executeUpdate("DELETE FROM admin WHERE admin_id=?", adminId);
    }

    @Override
    public AdminEntity get(Integer adminId) throws Exception {

        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM admin WHERE admin_id=?", adminId);
        if (rst.next()) {
            return new AdminEntity(
                    rst.getInt("admin_id"),
                    rst.getString("name"),
                    rst.getString("contact"),
                    rst.getInt("user_id")
            );
        }
        return null;
    }

    @Override
    public ArrayList<AdminEntity> getAll() throws Exception {

        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM admin");
        ArrayList<AdminEntity> adminEntities = new ArrayList<>();
        while (rst.next()) {
            adminEntities.add(new AdminEntity(
                    rst.getInt("admin_id"),
                    rst.getString("name"),
                    rst.getString("contact"),
                    rst.getInt("user_id")
            ));
        }
        return adminEntities;
    }

}
