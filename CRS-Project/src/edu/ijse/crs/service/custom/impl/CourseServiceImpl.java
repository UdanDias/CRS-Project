/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.crs.service.custom.impl;

import edu.ijse.crs.dao.DAOFactory;
import edu.ijse.crs.dao.custom.CourseDAO;
import edu.ijse.crs.dto.CourseDTO;
import edu.ijse.crs.entity.CourseEntity;
import edu.ijse.crs.service.custom.CourseService;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class CourseServiceImpl implements CourseService {

    private CourseDAO courseDAO = (CourseDAO) DAOFactory.getInstance().getDao(DAOFactory.DAOTypes.COURSE);

    @Override
    public String addCourse(CourseDTO course) throws Exception {
        CourseEntity courseEntity = new CourseEntity(course.getTitle(),
                course.getCreditHours(),
                course.getDepartment(),
                course.getMaxEnrollment(),
                course.getAvailableSeats()
        );

        boolean isSaved = courseDAO.add(courseEntity);
        return isSaved ? "Successfully Added Course" : "Failed to add Course";
    }

    @Override
    public String updateCourse(CourseDTO course) throws Exception {
        CourseEntity courseEntity = new CourseEntity(course.getCourseId(),
                course.getTitle(),
                course.getCreditHours(),
                course.getDepartment(),
                course.getMaxEnrollment(),
                course.getAvailableSeats()
        );

        boolean isUpdated = courseDAO.update(courseEntity);
        return isUpdated ? "Successfully Updated Course" : "Failed to Update Course";
    }

    @Override
    public String deleteCourse(int courseId) throws Exception {
        boolean isDeleted = courseDAO.delete(courseId);
        return isDeleted ? "Successfully Deleted Course" : "Failed to Delete Course (Ensure no enrolled students)";
    }

    @Override
    public CourseDTO getCourse(int courseId) throws Exception {
        CourseEntity courseEntity = courseDAO.get(courseId);
        if (courseEntity != null) {
            return new CourseDTO(courseEntity.getCourseId(),
                    courseEntity.getTitle(),
                    courseEntity.getCreditHours(),
                    courseEntity.getDepartment(),
                    courseEntity.getMaxEnrollment(),
                    courseEntity.getAvailableSeats()
            );
        }
        return null;
    }

    @Override
    public ArrayList<CourseDTO> getAllCourses() throws Exception {
        ArrayList<CourseEntity> courseEntities = courseDAO.getAll();
        ArrayList<CourseDTO> courseDtos = new ArrayList<>();
        if (courseEntities != null) {
            for (CourseEntity courseEntity : courseEntities) {
                CourseDTO dto = new CourseDTO(courseEntity.getCourseId(),
                        courseEntity.getTitle(),
                        courseEntity.getCreditHours(),
                        courseEntity.getDepartment(),
                        courseEntity.getMaxEnrollment(),
                        courseEntity.getAvailableSeats()
                );
                courseDtos.add(dto);
            }
        }

        return courseDtos;
    }

    @Override
    public int getCourseIdByCourseName(String title) throws Exception {
        int courseId = courseDAO.getCourseIdByCourseName(title);
        return courseId;
    }

    @Override
    public CourseDTO getCourseByCourseTitle(String title) throws Exception {
        CourseEntity courseEntity = courseDAO.getCourseByCourseTitle(title);
        if (courseEntity != null) {
            return new CourseDTO(courseEntity.getCourseId(),
                    courseEntity.getTitle(),
                    courseEntity.getCreditHours(),
                    courseEntity.getDepartment(),
                    courseEntity.getMaxEnrollment(),
                    courseEntity.getAvailableSeats()
            );
        }
        return null;
    }

}
