/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.crs.dao.custom;

import edu.ijse.crs.dao.CrudDAO;
import edu.ijse.crs.entity.CourseEntity;

/**
 *
 * @author USER
 */
public interface CourseDAO extends CrudDAO<CourseEntity,Integer>{
    int getCourseIdByCourseName(String title)throws Exception;
    CourseEntity getCourseByCourseTitle(String title)throws Exception;
    int getAvailableSeats(int courseId)throws Exception;
    boolean updateAvailableSeats(int courseId, int newSeats)throws Exception;
    boolean incrementAvailableSeats(int courseId) throws Exception;

}
