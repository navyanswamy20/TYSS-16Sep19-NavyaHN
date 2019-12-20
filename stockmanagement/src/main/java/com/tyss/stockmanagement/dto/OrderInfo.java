package com.tyss.stockmanagement.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Order_Info")
public class OrderInfo {
	@Column
	@Id
	@GeneratedValue
	private int oId;
	@Column
	private double totalPrice;
	@Column
	private double totalPriceWithGst;
	public int getoId() {
		return oId;
	}

	public void setoId(int oId) {
		this.oId = oId;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public double getTotalPriceWithGst() {
		return totalPriceWithGst;
	}

	public void setTotalPriceWithGst(double totalPriceWithGst) {
		this.totalPriceWithGst = totalPriceWithGst;
	}

}
