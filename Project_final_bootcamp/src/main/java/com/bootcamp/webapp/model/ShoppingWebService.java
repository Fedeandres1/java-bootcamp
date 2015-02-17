package com.bootcamp.webapp.model;

import java.util.ArrayList;

import javax.jws.WebService;

@WebService
public class ShoppingWebService implements ShoppingCartService {
	ShoppingCartService imp = new ShoppingCartImplement();

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
	public void saveCart() {
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
