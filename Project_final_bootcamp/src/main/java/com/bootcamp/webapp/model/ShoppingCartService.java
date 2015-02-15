package com.bootcamp.webapp.model;

public interface ShoppingCartService {

	public void buyProduct();

	public ShoppingCart addLineItem();

	public ShoppingCart removeLineItem();

	public double calculatePayment();

	public void saveCart();

	public String getCartContent();

}
