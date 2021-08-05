package me.kirtish.elearning.repo;

import me.kirtish.elearning.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.NamedQuery;



public interface CourseRepo extends JpaRepository<Course,Long> {



}
