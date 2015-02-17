package com.bootcamp.webapp.model;

import java.util.ArrayList;

public interface ShoppingCartService {

	public void buyProduct();

	public ArrayList<Product> findProductByCategory(String category);

	public ArrayList<Product> findProductByName(String name);

	public ShoppingCart addLineItem();

	public ShoppingCart removeLineItem();

	public double calculatePayment();

	public void saveCart();

	public String getCartContent();

}
