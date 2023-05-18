package com.example.demo.entity;

import javax.persistence.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Column(name="customerId")
	private int customerId;
	@Column(name="customerName")
	private String customerName;
	@Column(name="customerEmail",unique =true, nullable = false)
	private String customerEmail;
	@Column(name="customerPassword")
	private String customerPassword;
	@Column(name="customerPhone")
	private String customerPhone;
	@Column(name="customerAddress")
	private String customerAddress;
	
	public Customer() {}
	
	public Customer(int customerId, String customerName, String customerEmail, String customerPassword,
			String customerPhone, String customerAddress) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerPassword = customerPassword;
		this.customerPhone = customerPhone;
		this.customerAddress = customerAddress;
	}

	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerEmail="
				+ customerEmail + ", customerPassword=" + customerPassword + ", customerPhone=" + customerPhone
				+ ", customerAddress=" + customerAddress + "]";
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getCustomerEmail() {
		return customerEmail;
	}


	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}


	public String getCustomerPassword() {
		return customerPassword;
	}


	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}


	public String getCustomerPhone() {
		return customerPhone;
	}


	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}


	public String getCustomerAddress() {
		return customerAddress;
	}


	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}


	
	
}
