/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Frederic
 */
@Entity
public class StudentXCourseXNota implements Serializable {

    @Id
    private int id_student;
    @Id
    private int id_course;
    private int note_1, note_2, note_3;

    public StudentXCourseXNota() {
    }

    public StudentXCourseXNota(int note_1, int note_2, int note_3) {
        this.note_1 = note_1;
        this.note_2 = note_2;
        this.note_3 = note_3;
    }

    public int getId_student() {
        return id_student;
    }

    public void setId_student(int id_student) {
        this.id_student = id_student;
    }

    public int getId_course() {
        return id_course;
    }

    public void setId_course(int id_course) {
        this.id_course = id_course;
    }

    public int getNote_1() {
        return note_1;
    }

    public void setNote_1(int note_1) {
        this.note_1 = note_1;
    }

    public int getNote_2() {
        return note_2;
    }

    public void setNote_2(int note_2) {
        this.note_2 = note_2;
    }

    public int getNote_3() {
        return note_3;
    }

    public void setNote_3(int note_3) {
        this.note_3 = note_3;
    }

    @Override
    public String toString() {
        return "StudentXCourseXNota{" + "id_student=" + id_student + ", id_course=" + id_course + ", note_1=" + note_1 + ", note_2=" + note_2 + ", note_3=" + note_3 + '}'+"\n";
    }

}
