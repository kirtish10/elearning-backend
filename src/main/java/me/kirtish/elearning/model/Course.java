package me.kirtish.elearning.model;

import javax.persistence.*;
import java.io.Serializable;



@Entity
@Table(name = "course")
public class Course implements Serializable {
    @Id
    @SequenceGenerator(name="new", initialValue=111)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="new")
    @Column(name = "course_id", nullable = false, updatable = false)
    private Long course_id;
    private String c_name;
    private String c_desp;
    private String c_fees;
    private String c_resource;

    public Course(Long course_id, String c_name, String c_desp, String c_fees, String c_resource) {
        this.course_id = course_id;
        this.c_name = c_name;
        this.c_desp = c_desp;
        this.c_fees = c_fees;
        this.c_resource = c_resource;
    }

    public Course() {}

    public Long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Long course_id) {
        this.course_id = course_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getC_desp() {
        return c_desp;
    }

    public void setC_desp(String c_desp) {
        this.c_desp = c_desp;
    }

    public String getC_fees() {
        return c_fees;
    }

    public void setC_fees(String c_fees) {
        this.c_fees = c_fees;
    }

    public String getC_resource() {
        return c_resource;
    }

    public void setC_resource(String c_resource) {
        this.c_resource = c_resource;
    }

}
