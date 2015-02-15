package com.bootcamp.webapp.model;

public class ShoppingServiceProxy implements ShoppingCartService {

	ShoppingCartService implement;

	
	
	
	public ShoppingServiceProxy(ShoppingJmsClient shoppingJmsClient) {
		// TODO Auto-generated constructor stub
	}

	public ShoppingServiceProxy(
			ShoppingWebServiceClient shoppingWebServiceClient) {
		// TODO Auto-generated constructor stub
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
	public void saveCart() {
		// TODO Auto-generated method stub

	}

	@Override
	public String getCartContent() {
		// TODO Auto-generated method stub
		return null;
	}

}
