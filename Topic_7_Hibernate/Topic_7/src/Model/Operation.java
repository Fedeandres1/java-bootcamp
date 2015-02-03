/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
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
        List result = session.createQuery(" from Teacher").list();
        for (Teacher event : (List<Teacher>) result) {
            res += event.toString() + "\n";
        }

        return res;
    }

    public String fetchStudent() {
        String res = null;
        List<Student> result = session.createQuery("from Student").list();
        for (Student event : (List<Student>) result) {
            res += event.toString() + "\n";
        }

        return res;

    }

    public String fetchCourse() {
        String res = null;
        List<Course> result = null;
        Query query = session.createQuery(" from Course ");
        result = query.list();
        for (int i = 0; i < result.size(); i++) {
            res += result.get(i).toString();
        }

        return res;

    }

    public String fetchCoursesOfStudent(int id_student) {
        String res = null;

        List<Course> result = session.createQuery("select c from "
                + "StudentXCourseXNota s,Course c  where s.id_student="
                + id_student
                + " and  s.id_course=c.id_course"
        ).list();

        for (Course event : (List<Course>) result) {
            res += event.toString();
        }

        return res;
    }

    public String fetchStudentsOfCourse(int id_course) {
        String res = null;
        List<Student> result;
        Query query = session.createQuery(" Select s "
                + " from Student s , StudentXCourseXNota s2 "
                + " where s2.id_course=" + id_course
                + " and s.id_registration=s2.id_student");
        result = query.list();
        for (Student student : (List<Student>) result) {

            res += student.toString();

        }

        return res;
    }

}
