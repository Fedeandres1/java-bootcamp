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
public class Teacher {
    @Id
    private int id_teacher;
    private String last_name,first_name;
    private String date_birth;

    public Teacher( String last_name, String first_name, String date_of_birth) {
       
        this.last_name = last_name;
        this.first_name = first_name;
        this.date_birth = date_of_birth;
    }

    public Teacher() {
    }

    public int getId_teacher() {
        return id_teacher;
    }

    public void setId_teacher(int id_teacher) {
        this.id_teacher = id_teacher;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getDate_of_birth() {
        return date_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_birth = date_of_birth;
    } 
    @Override
    public String toString() {
        return "Teacher{" + "id_teacher=" + id_teacher + ", last_name=" + last_name + ", first_name=" + first_name + ", date_of_birth=" + date_birth + '}';
    }
    
    
}
