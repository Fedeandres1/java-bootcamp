package com.bootcamp.webapp.model;

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
	public void saveCart() {
		// TODO Auto-generated method stub

	}

	@Override
	public String getCartContent() {
		// TODO Auto-generated method stub
		return null;
	}

}
