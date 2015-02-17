package com.bootcamp.webapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class LineItem {
	@Id
	@GeneratedValue
	private Integer id_line_item;
	private Integer quantity;
	private Float pricen;
	private Integer id_product;
	private Integer id_shopping_cart;
	private Integer id_order;

	public LineItem() {
	}

	public LineItem(Integer quantity, Float pricen, Integer id_product,
			Integer id_shopping_cart, Integer id_order) {
		super();
		this.quantity = quantity;
		this.pricen = pricen;
		this.id_product = id_product;
		this.id_shopping_cart = id_shopping_cart;
		this.id_order = id_order;
	}

	public Integer getId_line_item() {
		return id_line_item;
	}

	public void setId_line_item(Integer id_line_item) {
		this.id_line_item = id_line_item;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Float getPricen() {
		return pricen;
	}

	public void setPricen(Float pricen) {
		this.pricen = pricen;
	}

	public Integer getId_product() {
		return id_product;
	}

	public void setId_product(Integer id_product) {
		this.id_product = id_product;
	}

	public Integer getId_shopping_cart() {
		return id_shopping_cart;
	}

	public void setId_shopping_cart(Integer id_shopping_cart) {
		this.id_shopping_cart = id_shopping_cart;
	}

	public Integer getId_order() {
		return id_order;
	}

	public void setId_order(Integer id_order) {
		this.id_order = id_order;
	}

	@Override
	public String toString() {
		return "LineItem [id_line_item=" + id_line_item + ", quantity="
				+ quantity + ", pricen=" + pricen + ", id_product="
				+ id_product + ", id_shopping_cart=" + id_shopping_cart
				+ ", id_order=" + id_order + "]";
	}

}
