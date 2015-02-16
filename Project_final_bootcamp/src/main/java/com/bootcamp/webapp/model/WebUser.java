package com.bootcamp.webapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WebUser {
	@Id
	private String id_user;

	private String password;

	private String user_state;

	private String email;

	private int id_phone;

	private int id_adress;

	private String id_account;

	private int id_shopping_cart;

	public WebUser() {
	}

	public WebUser(String id_user, String password, String user_state,
			String email, int id_phone, int id_adress, String id_account,
			int shoppingcart) {

		this.id_user = id_user;
		this.password = password;
		this.user_state = user_state;
		this.email = email;
		this.id_phone = id_phone;
		this.id_adress = id_adress;
		this.id_account = id_account;
		this.id_shopping_cart = shoppingcart;
	}

	@Override
	public String toString() {
		return "WebUser [id_user=" + id_user + ", password=" + password
				+ ", user_state=" + user_state + ", email=" + email
				+ ", id_phone=" + id_phone + ", id_adress=" + id_adress
				+ ", id_account=" + id_account + ", shoppingcart="
				+ this.id_shopping_cart + "]";
	}

	public String getId_user() {
		return id_user;
	}

	public void setId_user(String id_user) {
		this.id_user = id_user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUser_state() {
		return user_state;
	}

	public void setUser_state(String user_state) {
		this.user_state = user_state;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId_phone() {
		return id_phone;
	}

	public void setId_phone(int id_phone) {
		this.id_phone = id_phone;
	}

	public int getId_adress() {
		return id_adress;
	}

	public void setId_adress(int id_adress) {
		this.id_adress = id_adress;
	}

	public String getId_account() {
		return id_account;
	}

	public void setId_account(String id_account) {
		this.id_account = id_account;
	}

	public int getId_shopping_cart() {
		return id_shopping_cart;
	}

	public void setId_shopping_cart(int id_shopping_cart) {
		this.id_shopping_cart = id_shopping_cart;
	}

}
