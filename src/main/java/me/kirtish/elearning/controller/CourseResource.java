package me.kirtish.elearning.controller;

import me.kirtish.elearning.model.Course;
import me.kirtish.elearning.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/course")
public class CourseResource {

    private final CourseService courseService;

    public CourseResource(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Course>> getAllCourses() {
        List<Course> courses = courseService.findAllCourses();
        return new ResponseEntity<>(courses, HttpStatus.OK);
    }



    @PostMapping("/add")
    public ResponseEntity<Course> addCourse(@RequestBody Course course) {
        Course newCourse = courseService.addCourse(course);
        return new ResponseEntity<>(newCourse,HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Course> updateCourse(@RequestBody Course course) {
        Course c = courseService.updateCourse(course);
        return new ResponseEntity<Course>(c,HttpStatus.ACCEPTED);
    }

@DeleteMapping("/delete/{id}")
public ResponseEntity<Course> deleteCourse(@PathVariable("id") Long id) {
    courseService.deleteCourse(id);
    return new ResponseEntity<>(HttpStatus.OK);
}





}
