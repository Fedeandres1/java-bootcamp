/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Frederic
 */
@Document (collection="teacherxcourse")
public class TeacherXCourse {
    private String id_teacher;
    private String id_course;

    public TeacherXCourse(String id_teacher, String id_course) {
        this.id_teacher = id_teacher;
        this.id_course = id_course;
    }

    public String getId_teacher() {
        return id_teacher;
    }

    public void setId_teacher(String id_teacher) {
        this.id_teacher = id_teacher;
    }

    public String getId_course() {
        return id_course;
    }

    public void setId_course(String id_course) {
        this.id_course = id_course;
    }

    @Override
    public String toString() {
        return "TeacherXCourse{" + "id_teacher=" + id_teacher + ", id_course=" + id_course + '}';
    }
    
    
}
