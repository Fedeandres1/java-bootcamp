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
@Document(collection="teacher")
public class Teacher {
    private String first_name;
    private String last_name;
    @Id
    private String id_teacher;
    private String date_birth;

    public Teacher() {
    }

    public Teacher(String first_name, String last_name, String id_teacher, String date_birth) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.id_teacher = id_teacher;
        this.date_birth = date_birth;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getId_teacher() {
        return id_teacher;
    }

    public void setId_teacher(String id_teacher) {
        this.id_teacher = id_teacher;
    }

    public String getDate_birth() {
        return date_birth;
    }

    public void setDate_birth(String date_birth) {
        this.date_birth = date_birth;
    }

    @Override
    public String toString() {
        return "Teacher{" + "first_name=" + first_name + ", last_name=" + last_name + ", id_teacher=" + id_teacher + ", date_birth=" + date_birth + '}';
    }
    
}
