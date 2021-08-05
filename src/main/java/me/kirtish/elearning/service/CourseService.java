package me.kirtish.elearning.service;

import me.kirtish.elearning.exception.UserNotFoundException;
import me.kirtish.elearning.model.Course;
import me.kirtish.elearning.model.User;
import me.kirtish.elearning.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CourseService {

    private final CourseRepo courseRepo;

    @Autowired
    public CourseService(CourseRepo courseRepo) {
        this.courseRepo = courseRepo;
    }


    public List<Course> findAllCourses() {
        return courseRepo.findAll();
    }

    public Course addCourse(Course course) {
        return courseRepo.save(course);
    }

//    public Course findCourseByCourse_ID(Long course_id) {
//        return courseRepo.findCourseByCourse_id(course_id)
//                .orElseThrow(
//                        () -> new UserNotFoundException("user by id" + course_id + " not found" ));
//    }
}
