package me.kirtish.elearning.controller;

import me.kirtish.elearning.model.Admin;
import me.kirtish.elearning.model.Course;
import me.kirtish.elearning.model.User;
import me.kirtish.elearning.service.AdminService;
import me.kirtish.elearning.service.CourseService;
import me.kirtish.elearning.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminResource {

    private final AdminService adminService;
    private final UserService userService;
    private final CourseService courseService;

    public AdminResource(AdminService adminService, UserService userService, CourseService courseService) {
        this.adminService = adminService;
        this.userService = userService;
        this.courseService = courseService;
    }

    @PostMapping("/register")
    public ResponseEntity<Admin> addCourse(@RequestBody Admin admin) {
    Admin newAdmin = adminService.addCourse(admin);
    return new ResponseEntity<Admin>(admin, HttpStatus.CREATED);
}

    @GetMapping("/allusers")
    public ResponseEntity<List<User>> getAllUsers() {
       List<User> users  = userService.findAllUsers();
       return new ResponseEntity<>(users,HttpStatus.OK);
    }


    @PostMapping("/course/add")
    public ResponseEntity<Course> addACourse(@RequestBody Course course)
    {
        Course addedCourse = courseService.addCourse(course);
        return new ResponseEntity<>(addedCourse,HttpStatus.CREATED);
    }


    @GetMapping("/course/all")
    public ResponseEntity<List<Course>> getCourses()
    {
        List<Course> addedCourses = courseService.findAllCourses();
        return new ResponseEntity<>(addedCourses,HttpStatus.CREATED);
    }

}