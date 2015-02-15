package com.bootcamp.webapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Adress {
	@Id
	@GeneratedValue
	private int id_adress;
	private String street;
	private int number;
	private int floor;
	private int zip_code;
	private char letter;

	public Adress() {
	}

	public Adress(String street, int number, int floor, int zip_code,
			char letter) {

		this.street = street;
		this.number = number;
		this.floor = floor;
		this.zip_code = zip_code;
		this.letter = letter;
	}

	public int getId_adress() {
		return id_adress;
	}

	public void setId_adress(int id_adress) {
		this.id_adress = id_adress;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public int getZip_code() {
		return zip_code;
	}

	public void setZip_code(int zip_code) {
		this.zip_code = zip_code;
	}

	public char getLetter() {
		return letter;
	}

	public void setLetter(char letter) {
		this.letter = letter;
	}

	@Override
	public String toString() {
		return "Adress [id_adress=" + id_adress + ", street=" + street
				+ ", number=" + number + ", floor=" + floor + ", zip_code="
				+ zip_code + ", letter=" + letter + "]";
	}

}
