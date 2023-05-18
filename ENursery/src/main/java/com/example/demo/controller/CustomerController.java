package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.*;
import com.example.demo.service.CustomerServiceImplementations;

@RestController
public class CustomerController {

	@Autowired
	private CustomerServiceImplementations customerServiceImplementation;

	public CustomerController(CustomerServiceImplementations customerServiceImplementation) {
		this.customerServiceImplementation = customerServiceImplementation;
	}

	
	@PutMapping("/customer/update-customer")
    public void updateCustomer(@RequestBody Customer customer) 
	{
		customerServiceImplementation.updateDetails(customer);	
		
    }

	@GetMapping("customer/product/{productName}")
	public List<Product> displayProductByName(@PathVariable("productName") String name) {
		return customerServiceImplementation.searchProductByName(name);
	}
	
	@GetMapping("customer/single-products/{productId}")
	public  Product getProductById(@PathVariable("productId")  int id) {
		return customerServiceImplementation.getProductById(id);
	}
	
	@PostMapping("/customer/sign-up")
	public void signUp(@RequestBody Customer customer){
	customerServiceImplementation.signup(customer);
	}
	
	@PostMapping("/customer/login")
	public Customer login(@RequestBody Customer cust1){
	Customer cust = customerServiceImplementation.login(cust1);
	if(cust!=null) {
		return cust;
	}else {
		return cust;
	}
	}
	
	@GetMapping("/customer/orders/{customerId}")
	public List<Orders> getOrders(@PathVariable("customerId")  int customerId) {
		return customerServiceImplementation.pastOrders(customerId);
	}
	
	@GetMapping("customer/products/{productId}")
	public List<Product> displayProductByCategoryName(@PathVariable("productId")  int id) {
		return customerServiceImplementation.searchProductByCategoryName(id);
	}
	@GetMapping("/customer/categories")
	public List<ProductCategory> getCategories() {
		return customerServiceImplementation.getProductCategories();

	}
	
	@GetMapping("/customer/place-order/{customerId}/{paymentMode}/{totalAmount}")
	public void placeOrder(@PathVariable("customerId") int customerId,@PathVariable("paymentMode") String paymentMode,
		@PathVariable("totalAmount") double totalAmount)
	{
		System.out.println("hello");
		
		customerServiceImplementation.placeOrder(customerId, paymentMode, totalAmount);

	}
	
}
