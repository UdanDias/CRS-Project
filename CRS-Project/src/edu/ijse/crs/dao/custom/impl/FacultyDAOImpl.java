/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.crs.dao.custom.impl;

import edu.ijse.crs.dao.CrudUtil;
import edu.ijse.crs.dao.custom.FacultyDAO;
import edu.ijse.crs.entity.FacultyEntity;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class FacultyDAOImpl implements FacultyDAO{
    @Override
    public boolean add(FacultyEntity faculty) throws Exception {

        return CrudUtil.executeUpdate("INSERT INTO faculty (name,department,contact,user_id) VALUES (?, ?, ?,?)",
                faculty.getName(),
                faculty.getDepartment(),
                faculty.getContact(),
                faculty.getUserId()
        );
    }

    @Override
    public boolean update(FacultyEntity faculty) throws Exception {

        return CrudUtil.executeUpdate("UPDATE faculty SET name=?,department=?,contact=? WHERE faculty_id=?",
                faculty.getName(),
                faculty.getDepartment(),
                faculty.getContact(),
                faculty.getFacultyId()
        );
    }

    @Override
    public boolean delete(Integer facultyId) throws Exception {

        return CrudUtil.executeUpdate("DELETE FROM faculty WHERE faculty_id=?", facultyId);
    }

    @Override
    public FacultyEntity get(Integer facultyId) throws Exception {

        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM faculty WHERE faculty_id=?", facultyId);
        if (rst.next()) {
            return new FacultyEntity(
                    rst.getInt("faculty_id"),
                    rst.getString("name"),
                    rst.getString("department"),
                    rst.getString("contact"),
                    rst.getInt("user_id")
            );
        }
        return null;
    }

    @Override
    public ArrayList<FacultyEntity> getAll() throws Exception {

        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM faculty");
        ArrayList<FacultyEntity> facultyEntities = new ArrayList<>();
        while (rst.next()) {
            facultyEntities.add(new FacultyEntity(
                    rst.getInt("faculty_id"),
                    rst.getString("name"),
                    rst.getString("department"),
                    rst.getString("contact"),
                    rst.getInt("user_id")
            ));
        }
        return facultyEntities;
    }
}
