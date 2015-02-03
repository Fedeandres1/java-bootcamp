/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Frederic
 */
@Entity
public class Course {

    @Id
    private int id_course;
    private String name;
    private int id_teacher;
    private int hour_week;

    public Course() {
    }

    public Course(String name, int id_teacher, int hour_week) {

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

    public void setId_teacher(int id_teacher) {
        this.id_teacher = id_teacher;
    }

    public int getHour_week() {
        return hour_week;
    }

    public void setHour_week(int hour_week) {
        this.hour_week = hour_week;
    }

    @Override
    public String toString() {
        return "Course{" + "id_course=" + id_course + ", name=" + name + ", id_teacher=" + id_teacher + ", hour_week=" + hour_week + '}';
    }

}
