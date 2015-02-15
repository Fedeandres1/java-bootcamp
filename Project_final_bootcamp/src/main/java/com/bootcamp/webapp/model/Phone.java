package com.bootcamp.webapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Phone {
	@Id @GeneratedValue
	private int id_phone;
	private int number;

	public Phone(int number) {

		this.number = number;
	}

	@Override
	public String toString() {
		return "Phone [id_phone=" + id_phone + ", number=" + number + "]";
	}

	public Phone() {
	}

	public int getId_phone() {
		return id_phone;
	}

	public void setId_phone(int id_phone) {
		this.id_phone = id_phone;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
