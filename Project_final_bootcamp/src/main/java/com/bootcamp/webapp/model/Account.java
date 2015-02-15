package com.bootcamp.webapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {

	@Id
	private String id;
	private int billing_adres;
	private String open_date;
	private boolean is_close;
	private String close_date;
	private int id_order;
	private int id_shopping_cart;

	public Account() {
	}

	public Account(String id, int billing_adres, String open_date,
			boolean is_close, String close_date, int id_order,
			int id_shopping_cart) {

		this.id = id;
		this.billing_adres = billing_adres;
		this.open_date = open_date;
		this.is_close = is_close;
		this.close_date = close_date;
		this.id_order = id_order;
		this.id_shopping_cart = id_shopping_cart;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", billing_adres=" + billing_adres
				+ ", open_date=" + open_date + ", is_close=" + is_close
				+ ", close_date=" + close_date + ", id_order=" + id_order
				+ ", id_shopping_cart=" + id_shopping_cart + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getBilling_adres() {
		return billing_adres;
	}

	public void setBilling_adres(int billing_adres) {
		this.billing_adres = billing_adres;
	}

	public String getOpen_date() {
		return open_date;
	}

	public void setOpen_date(String open_date) {
		this.open_date = open_date;
	}

	public boolean isIs_close() {
		return is_close;
	}

	public void setIs_close(boolean is_close) {
		this.is_close = is_close;
	}

	public String getClose_date() {
		return close_date;
	}

	public void setClose_date(String close_date) {
		this.close_date = close_date;
	}

	public int getId_order() {
		return id_order;
	}

	public void setId_order(int id_order) {
		this.id_order = id_order;
	}

	public int getId_shopping_cart() {
		return id_shopping_cart;
	}

	public void setId_shopping_cart(int id_shopping_cart) {
		this.id_shopping_cart = id_shopping_cart;
	}

}
