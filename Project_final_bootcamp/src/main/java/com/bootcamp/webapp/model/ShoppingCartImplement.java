package com.bootcamp.webapp.model;

import java.util.ArrayList;

import com.bootcamp.webapp.model.persistanse.Operation;

public class ShoppingCartImplement implements ShoppingCartService {
	Operation operation = new Operation();

	protected ShoppingCartImplement() {

	}

	@Override
	public void buyProduct() {
		// TODO Auto-generated method stub

	}

	@Override
	public ShoppingCart addLineItem() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ShoppingCart removeLineItem() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double calculatePayment() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void saveCart(WebUser user, ShoppingCart shoppingcart) {
		String query = "";
		operation.openConnection();
		operation.saveShoppingCart(shoppingcart);
		user.setId_shopping_cart(shoppingcart.getId_shopping_cart());
		query = " update from WebUser " + " set id_shopping_cart="
				+ user.getId_shopping_cart() + "where id_user='"
				+ user.getId_user() + "'";
		operation.executeQuery(query);

	}

	@Override
	public String getCartContent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Product> findProductByCategory(String category) {
		ArrayList<Product> list = new ArrayList<Product>();
		String query = "";

		operation.openConnection();

		query = " select p from Product p,Category c   where   c.id_category=p.id_category and c.name='"
				+ category + "'";

		list = operation.getProductByNameOrCategory(query);
		operation.closeConnection();

		return list;
	}

	@Override
	public ArrayList<Product> findProductByName(String name) {
		ArrayList<Product> list = new ArrayList<Product>();
		String query = "";

		operation.openConnection();

		query = " select p from Product p,Category c   where   c.id_category=p.id_category and c.name='"
				+ name + "'";

		list = operation.getProductByNameOrCategory(query);
		operation.closeConnection();

		return list;

	}

}
