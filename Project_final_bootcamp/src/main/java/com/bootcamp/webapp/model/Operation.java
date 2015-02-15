package com.bootcamp.webapp.model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Operation {

	SessionFactory sessionFactory = null;
	Session session = null;

	public Operation() {

	}

	public void openConnection() {
		sessionFactory = new AnnotationConfiguration().configure()
				.buildSessionFactory();
		session = sessionFactory.openSession();

	}

	public void closeConnection() {
		session.close();
		sessionFactory.close();

	}
	
	
	public void saveObject(Object s) {
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();

	}

}