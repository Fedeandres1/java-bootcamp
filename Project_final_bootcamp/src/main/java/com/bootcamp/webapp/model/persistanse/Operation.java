package com.bootcamp.webapp.model.persistanse;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.bootcamp.webapp.model.Account;
import com.bootcamp.webapp.model.LineItem;
import com.bootcamp.webapp.model.Payment;
import com.bootcamp.webapp.model.Phone;
import com.bootcamp.webapp.model.Product;
import com.bootcamp.webapp.model.ShoppingCart;
import com.bootcamp.webapp.model.ShoppingOrder;
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

	public void saveShoppingCart(ShoppingCart cart) {
		session.beginTransaction();
		session.save(cart);
		session.getTransaction().commit();
	}

	public void saveObject(Phone obj) {
		session.beginTransaction();
		session.save(obj);
		session.getTransaction().commit();

	}

	public void saveObject(ShoppingOrder obj) {
		session.beginTransaction();
		session.save(obj);
		session.getTransaction().commit();

	}

	public void saveObject(WebUser obj) {
		session.beginTransaction();
		session.save(obj);
		session.getTransaction().commit();

	}

	public void saveObject(Account obj) {
		session.beginTransaction();
		session.save(obj);
		session.getTransaction().commit();

	}

	public void saveObject(LineItem obj) {
		session.beginTransaction();
		session.save(obj);
		session.getTransaction().commit();

	}

	public void saveObject(Payment obj) {
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

	public ArrayList<Product> getProductByNameOrCategory(String query) {
		session.beginTransaction();

		ArrayList<Product> list = (ArrayList<Product>) session.createQuery(
				query).list();

		session.getTransaction().commit();

		return list;

	}

}