/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.crs.controller;

import edu.ijse.crs.dto.CourseDTO;
import edu.ijse.crs.service.ServiceFactory;
import edu.ijse.crs.service.custom.CourseService;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class CourseController {
    private CourseService courseService=(CourseService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.COURSE);
     public String addCourse(CourseDTO courseDTO) throws Exception {
        return courseService.addCourse(courseDTO);
    }

     public String updateCourse(CourseDTO courseDTO) throws Exception {
        return courseService.updateCourse(courseDTO);
    }

    
     public String deleteCourse(int courseId) throws Exception {
        return courseService.deleteCourse(courseId);
    }

     public CourseDTO getCourse(int courseId) throws Exception {
        return courseService.getCourse(courseId);
    }

     public ArrayList<CourseDTO> getAllCourses() throws Exception {
        return courseService.getAllCourses();
    }
     public int getCourseIdByCourseName(String title)throws Exception{
         return courseService.getCourseIdByCourseName(title);
     }
     public CourseDTO getCourseByCourseTitle(String title) throws Exception {
        return courseService.getCourseByCourseTitle(title);
    }
     
}
