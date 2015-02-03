/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

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

    public void fetchCoursesOfStudent() {
        
    }

    public void fetchStudentsOfCourse() {
        
    }

}
