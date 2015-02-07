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
@Document(collection = "student")
public class Student {

    @Id
    private String id_registration;
    private String first_name, last_name, date_birth;

    public Student() {
    }

    public Student(String id_registration, String first_name, String last_name, String date_birth) {
        this.id_registration=id_registration;
        this.first_name = first_name;
        this.last_name = last_name;
        this.date_birth = date_birth;
    }

    public String getId_registration() {
        return id_registration;
    }

    public void setId_registration(String id_registration) {
        this.id_registration = id_registration;
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

    public String getDate_birth() {
        return date_birth;
    }

    public void setDate_birth(String date_birth) {
        this.date_birth = date_birth;
    }

    @Override
    public String toString() {
        return "Student{" + "id_registration=" + id_registration + ", first_name=" + first_name + ", last_name=" + last_name + ", date_birth=" + date_birth + '}';
    }

}
