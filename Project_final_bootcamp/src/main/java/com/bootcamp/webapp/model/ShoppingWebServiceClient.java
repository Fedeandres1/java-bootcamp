package com.bootcamp.webapp.model;

public class ShoppingWebServiceClient implements ShoppingCartService {

	ShoppingCartService webService;

	public ShoppingWebServiceClient() {

		this.webService = new ShoppingWebService();
	}

	@Override
	public void buyProduct() {
		webService.buyProduct();

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
