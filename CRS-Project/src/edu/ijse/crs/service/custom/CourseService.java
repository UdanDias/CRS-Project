/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.crs.service.custom;

import edu.ijse.crs.dto.CourseDTO;
import edu.ijse.crs.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public interface CourseService extends SuperService{
    String addCourse(CourseDTO course)throws Exception;
    String updateCourse(CourseDTO course)throws Exception;
    String deleteCourse(int courseId)throws Exception;
    CourseDTO getCourse(int courseId)throws Exception;
    ArrayList<CourseDTO> getAllCourses()throws Exception;
    int getCourseIdByCourseName(String title)throws Exception;
    CourseDTO getCourseByCourseTitle(String title)throws Exception;
}
