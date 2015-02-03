/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Frederic
 */
@Entity
public class Student {

    @Id @GeneratedValue
    private int id_registration;
    private String first_name, last_name;
    private Date date_birth;

    public Student(String first_name, String last_name, Date date_birth) {

        this.first_name = first_name;
        this.last_name = last_name;
        this.date_birth = date_birth;
    }

    public Student() {
    }

    public int getId_registration() {
        return id_registration;
    }

    public void setId_registration(int id_registration) {
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

    public Date getDate_birth() {
        return date_birth;
    }

    public void setDate_birth(Date date_birth) {
        this.date_birth = date_birth;
    }

    @Override
    public String toString() {
        return "Student{" + "id_registration=" + id_registration + ", first_name=" + first_name + ", last_name=" + last_name + ", date_birth=" + date_birth + '}' + "\n";
    }

}
