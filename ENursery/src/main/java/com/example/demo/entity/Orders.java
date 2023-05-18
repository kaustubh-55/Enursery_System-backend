package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Orders {

	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Column(name="orderId")
	private int orderId;
	@Column(name="orderPayment")
	private String orderPayment;
	@Column(name="customerId")
	private int customerId;
	@Column(name="totalAmount")
	private double totalAmount;
	
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public String getOrderPayment() {
		return orderPayment;
	}

	public void setOrderPayment(String orderPayment) {
		this.orderPayment = orderPayment;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Orders(int orderId, String orderPayment, int customerId, double totalAmount) {
		super();
		this.orderId = orderId;
		this.orderPayment = orderPayment;
		this.customerId = customerId;
		this.totalAmount = totalAmount;
	}

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
	
}
