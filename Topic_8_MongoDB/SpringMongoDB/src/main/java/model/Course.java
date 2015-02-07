/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Frederic
 */
@Document(collection="course")
public class Course {
  @Id
    private String id_course;
  private String name;
  //@Id
  private String id_teacher;
    private int hour_week;

    public Course() {
    }

    public Course(String id_course, String name, String id_teacher, int hour_week) {
        this.id_course = id_course;
        this.name = name;
        this.id_teacher = id_teacher;
        this.hour_week = hour_week;
    }

    public String getId_course() {
        return id_course;
    }

    public void setId_course(String id_course) {
        this.id_course = id_course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId_teacher() {
        return id_teacher;
    }

    public void setId_teacher(String id_teacher) {
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
