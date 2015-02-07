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
@Document(collection = "studentxcoursexnote")
public class StudentXCourseXNote {

   // @Id
    private String id_student;
   // @Id
    private String id_course;
    private int note_1, note_2, note_3, note_final;

    public StudentXCourseXNote() {
    }

    public StudentXCourseXNote(String id_student, String id_course, int note_1, int note_2, int note_3, int note_final) {
        this.id_student = id_student;
        this.id_course = id_course;
        this.note_1 = note_1;
        this.note_2 = note_2;
        this.note_3 = note_3;
        this.note_final = note_final;
    }

    public String getId_student() {
        return id_student;
    }

    public void setId_student(String id_student) {
        this.id_student = id_student;
    }

    public String getId_course() {
        return id_course;
    }

    public void setId_course(String id_course) {
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

    public int getNote_final() {
        return note_final;
    }

    public void setNote_final(int note_final) {
        this.note_final = note_final;
    }

    @Override
    public String toString() {
        return "StudentXCourseXNote{" + "id_student=" + id_student + ", id_course=" + id_course + ", note_1=" + note_1 + ", note_2=" + note_2 + ", note_3=" + note_3 + ", note_final=" + note_final + '}';
    }

}
