package com.bootcamp.webapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Payment {
	@Id
	@GeneratedValue
	private Integer id_payment;
	private String paid_date;
	private Double total;
	private String detail;

	public Integer getId_payment() {
		return id_payment;
	}

	public Payment() {
	}

	public void setId_payment(Integer id_payment) {
		this.id_payment = id_payment;
	}

	public String getPaid_date() {
		return paid_date;
	}

	public void setPaid_date(String paid_date) {
		this.paid_date = paid_date;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Payment(String paid_date, Double total, String detail) {
		super();

		this.paid_date = paid_date;
		this.total = total;
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "Payment [id_payment=" + id_payment + ", paid_date=" + paid_date
				+ ", total=" + total + ", detail=" + detail + "]";
	}

}
