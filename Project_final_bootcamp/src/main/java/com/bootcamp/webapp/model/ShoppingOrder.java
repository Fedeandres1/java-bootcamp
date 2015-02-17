package com.bootcamp.webapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ShoppingOrder {

	@Id
	@GeneratedValue
	private Integer number;
	private String order_date;
	private String shipping;
	private Integer id_ship_to_adress;
	private Double total;
	private String state;
	private Integer id_payment;

	public Integer getNumber() {
		return number;
	}

	public ShoppingOrder() {
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	public String getShipping() {
		return shipping;
	}

	public void setShipping(String shipping) {
		this.shipping = shipping;
	}

	public Integer getId_ship_to_adress() {
		return id_ship_to_adress;
	}

	public void setId_ship_to_adress(Integer id_ship_to_adress) {
		this.id_ship_to_adress = id_ship_to_adress;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getId_payment() {
		return id_payment;
	}

	public void setId_payment(Integer id_payment) {
		this.id_payment = id_payment;
	}

	@Override
	public String toString() {
		return "ShoppingOrder [number=" + number + ", order_date=" + order_date
				+ ", shipping=" + shipping + ", id_ship_to_adress="
				+ id_ship_to_adress + ", total=" + total + ", state=" + state
				+ ", id_payment=" + id_payment + "]";
	}

	public ShoppingOrder(String order_date, String shipping,
			Integer id_ship_to_adress, Double total, String state,
			Integer id_payment) {
		super();
		this.order_date = order_date;
		this.shipping = shipping;
		this.id_ship_to_adress = id_ship_to_adress;
		this.total = total;
		this.state = state;
		this.id_payment = id_payment;
	}

}
