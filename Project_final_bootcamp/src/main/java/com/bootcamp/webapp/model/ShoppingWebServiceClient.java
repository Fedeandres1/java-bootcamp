package com.bootcamp.webapp.model;

import java.util.ArrayList;

public class ShoppingWebServiceClient implements ShoppingCartService {

	ShoppingCartService webService;

	public ShoppingWebServiceClient() {

		this.webService = new ShoppingWebService();
	}

	@Override
	public void buyProduct(Account account, ArrayList<LineItem> array) {
		webService.buyProduct(account, array);

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
		webService.saveCart(user, shoppingcart);

	}

	@Override
	public String getCartContent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Product> findProductByCategory(String category) {
		// TODO Auto-generated method stub
		return webService.findProductByCategory(category);
	}

	@Override
	public ArrayList<Product> findProductByName(String name) {

		return webService.findProductByName(name);
	}

}
