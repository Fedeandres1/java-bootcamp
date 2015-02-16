package com.bootcamp.webapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WebUser {
	@Id
	private String id_user;
	@Column(nullable = false)
	private String user_password;
	@Column(nullable = true)
	private String user_state;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private Integer id_phone;
	@Column(nullable = true)
	private Integer id_adress;
	@Column(nullable = true)
	private String id_account;
	@Column(nullable = true)
	private Integer id_shopping_cart;

	public WebUser() {
	}

	public WebUser(String id_user, String password, String user_state,
			String email, Integer id_phone, Integer id_adress,
			String id_account, Integer shoppingcart) {

		this.id_user = id_user;
		this.user_password = password;
		this.user_state = user_state;
		this.email = email;
		this.id_phone = id_phone;
		this.id_adress = id_adress;
		this.id_account = id_account;
		this.id_shopping_cart = shoppingcart;
	}

	@Override
	public String toString() {
		return "WebUser [id_user=" + id_user + ", password=" + user_password
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
		return user_password;
	}

	public void setPassword(String password) {
		this.user_password = password;
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

	public Integer getId_phone() {
		return id_phone;
	}

	public void setId_phone(Integer id_phone) {
		this.id_phone = id_phone;
	}

	public Integer getId_adress() {
		return id_adress;
	}

	public void setId_adress(Integer id_adress) {
		this.id_adress = id_adress;
	}

	public String getId_account() {
		return id_account;
	}

	public void setId_account(String id_account) {
		this.id_account = id_account;
	}

	public Integer getId_shopping_cart() {
		return id_shopping_cart;
	}

	public void setId_shopping_cart(Integer id_shopping_cart) {
		this.id_shopping_cart = id_shopping_cart;
	}

}
