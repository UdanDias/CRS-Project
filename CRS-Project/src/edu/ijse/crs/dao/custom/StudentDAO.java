/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.crs.dao.custom;

import edu.ijse.crs.dao.CrudDAO;
import edu.ijse.crs.entity.StudentEntity;

/**
 *
 * @author USER
 */
public interface StudentDAO extends CrudDAO<StudentEntity,Integer>{
    StudentEntity getStudentByStudentName(String studentName)throws Exception;
}
