package com.bootcamp.webapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ShoppingCart {
	@Id
	@GeneratedValue
	private int id_shopping_cart;
	private String date;

	public ShoppingCart() {

	}

	public ShoppingCart(String date) {

		this.date = date;
	}

	@Override
	public String toString() {
		return "ShoppingCart [id_shopping_cart=" + id_shopping_cart + ", date="
				+ date + "]";
	}

	public int getId_shopping_cart() {
		return id_shopping_cart;
	}

	public void setId_shopping_cart(int id_shopping_cart) {
		this.id_shopping_cart = id_shopping_cart;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
