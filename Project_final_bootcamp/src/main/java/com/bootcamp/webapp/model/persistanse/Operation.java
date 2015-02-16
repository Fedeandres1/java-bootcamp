package com.bootcamp.webapp.model.persistanse;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.bootcamp.webapp.model.Phone;
import com.bootcamp.webapp.model.WebUser;

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

	public void saveObject(Phone obj) {
		session.beginTransaction();
		session.save(obj);
		session.getTransaction().commit();

	}

	public void saveObject(WebUser obj) {
		session.beginTransaction();
		session.save(obj);
		session.getTransaction().commit();

	}

	public void executeQuery(String query) {
		session.beginTransaction();
		session.createSQLQuery(query).executeUpdate();
		session.getTransaction().commit();
	}

	public boolean searchUser(String query) {
		boolean res = false;

		session.beginTransaction();

		List<WebUser> list = (List<WebUser>) session.createQuery(query).list();

		session.getTransaction().commit();
		if (list.size() != 0) {
			res = true;
		} else {
			res = false;
		}

		return res;
	}

}