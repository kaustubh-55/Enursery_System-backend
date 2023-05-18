package com.example.demo.service;


import java.util.List;

import com.example.demo.entity.*;

public interface CustomerServiceDeclarations {
	
	public void signup(Customer customer);

	public List<Orders> pastOrders(int customerId);
	
	List<Product> searchProductByName(String name);
	
	Customer login(Customer customer);
	void updateDetails(Customer customer);

	Product getProductById(int id);

	List<Product> searchProductByCategoryName(int id);
	public List<ProductCategory> getProductCategories();
	
	public void placeOrder(int customerId, String paymentMode, double totalAmount);
	
	}
