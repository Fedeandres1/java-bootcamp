package com.bootcamp.webapp.model;

import java.util.ArrayList;

public class ShoppingJmsClient implements ShoppingCartService {

	ShoppingCartService jmsObject;

	public ShoppingJmsClient() {
		// jmsObject=
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
	public void saveCart(WebUser user,ShoppingCart shoppingcart) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getCartContent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Product> findProductByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Product> findProductByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
