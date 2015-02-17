package com.bootcamp.webapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue
	private Integer id_product;
	private String name;
	private Integer stock;
	private Integer id_category;

	public Integer getId_product() {
		return id_product;
	}

	public void setId_product(Integer id_product) {
		this.id_product = id_product;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Integer getId_category() {
		return id_category;
	}

	public void setId_category(Integer id_category) {
		this.id_category = id_category;
	}

	@Override
	public String toString() {
		return "Product [id_product=" + id_product + ", name=" + name
				+ ", stock=" + stock + ", id_category=" + id_category + "]";
	}

	public Product(Integer id_product, String name, Integer stock,
			Integer id_category) {
		super();
		this.id_product = id_product;
		this.name = name;
		this.stock = stock;
		this.id_category = id_category;
	}

	public Product() {
	}
}
