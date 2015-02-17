package com.bootcamp.webapp.model;

import java.util.ArrayList;

public class ShoppingServiceProxy implements ShoppingCartService {

	ShoppingCartService implement;

	protected ShoppingServiceProxy(ShoppingCartService imp) {
		this.implement = imp;

	}

	@Override
	public void buyProduct() {
		implement.buyProduct();

	}

	@Override
	public ShoppingCart addLineItem() {

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
