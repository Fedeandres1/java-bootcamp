package com.bootcamp.webapp.model;

import java.util.ArrayList;

public interface ShoppingCartService {

	public void buyProduct(Account account, ArrayList<LineItem> array);

	public ArrayList<Product> findProductByCategory(String category);

	public ArrayList<Product> findProductByName(String name);

	public ShoppingCart addLineItem();

	public ShoppingCart removeLineItem();

	public double calculatePayment();

	public void saveCart(WebUser id_user,ShoppingCart shoppingcart);

	public String getCartContent();

}
