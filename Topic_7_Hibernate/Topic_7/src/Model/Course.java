/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Frederic
 */
@Entity
public class Course {

    @Id
    @GeneratedValue
    private int id_course;
    @Column(nullable = true)
    private String name;
    @Column(nullable = true)
    private Integer id_teacher;
    @Column(nullable = true)
    private Integer hour_week;

    public Course() {
    }

    public Course(String name, Integer id_teacher, Integer hour_week) {

        this.name = name;
        this.id_teacher = id_teacher;
        this.hour_week = hour_week;
    }

    public int getId_course() {
        return id_course;
    }

    public void setId_course(int id_course) {
        this.id_course = id_course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId_teacher() {
        return id_teacher;
    }

    public void setId_teacher(Integer id_teacher) {
        this.id_teacher = id_teacher;
    }

    public int getHour_week() {
        return hour_week;
    }

    public void setHour_week(Integer hour_week) {
        this.hour_week = hour_week;
    }

    @Override
    public String toString() {
        return "Course{" + "id_course=" + id_course + ", name=" + name + ", id_teacher=" + id_teacher + ", hour_week=" + hour_week + '}' + "\n";
    }

}
