/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author Frederic
 */
public class Operation {

    SessionFactory sessionFactory = null;
    Session session = null;

    public Operation() {

    }

    public void openConnection() {
        sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        session = sessionFactory.openSession();

    }

    public void closeConnection() {
        session.close();
        sessionFactory.close();

    }

    //with this method save all object to the date base
    public void saveObject(Object s) {
        session.beginTransaction();
        session.save(s);
        session.getTransaction().commit();

    }

    public String fetchTeacher() {
        String res = null;
        List result = session.createQuery("  Teacher").list();
        for (Teacher event : (List<Teacher>) result) {
            res += event.toString();
        }

        return res;
    }

    public String fetchStudent() {
        String res = null;
        List<Student> result = session.createQuery("from Student").list();
        for (Student event : (List<Student>) result) {
            res += event.getFirst_name() + ", " + event.getLast_name();
        }

        return res;

    }

    public String fetchCourse() {
        String res = null;
        List<Course> result = session.createQuery("from Course").list();
        for (Course event : (List<Course>) result) {
            res += event.toString();
        }

        return res;

    }

    public String fetchCoursesOfStudent(int id_student) {
        String res = null;
        ArrayList array = new ArrayList();
        List<StudentXCourseXNota> result = session.createQuery("from "
                + "StudentXCourseXNota where id_student="
                + id_student
        ).list();
        
        List<Course> result2 = session.createQuery("from Course ").list();

        for (Course event : (List<Course>) result2) {
            res += event.toString();
        }

        return res;
    }

    public String fetchStudentsOfCourse() {
        String res = null;

        return res;
    }

}
