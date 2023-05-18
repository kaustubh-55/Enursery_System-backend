package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.*;
import com.example.demo.persistence.*;

@Service
public class CustomerServiceImplementations implements CustomerServiceDeclarations {
	
		private ProductRepository productRepository;
	    private ProductCategoryRepository productCategoryRepository;
	    private CustomerRepository customerRepository;
	    private OrderRepository orderRepository;    
	    
	    @Autowired
	    public CustomerServiceImplementations(ProductRepository productRepository,
				ProductCategoryRepository productCategoryRepository, CustomerRepository customerRepository,
				OrderRepository orderRepository ) 
	    {
	    	this.productRepository = productRepository;
			this.productCategoryRepository = productCategoryRepository;
			this.customerRepository = customerRepository;
			this.orderRepository = orderRepository;
		
		}

		@Override
		@Transactional
		public Customer login(Customer customer) 
		{
			return customerRepository.findByCustomerEmailAndCustomerPassword(customer.getCustomerEmail(),customer.getCustomerPassword());
		}
		
		@Override
		@Transactional
		public void signup(Customer customer)
		{
			customerRepository.save(customer);
		}

		@Override
		@Transactional
		public List<Orders> pastOrders(int customerId) {
			return  orderRepository.findByCustomerId(customerId);
		}

		@Override
		@Transactional
		public List<Product> searchProductByName(String name) {
			    
				return customerRepository.findByName(name);
			}

		@Override
		@Transactional
		public void updateDetails(Customer customer) {
			
			customerRepository.save(customer);
		}

		@Override
		@Transactional
		public Product getProductById(int id) {
			return productRepository.findById(id).get();
		}
	
		@Override
		@Transactional
		public List<Product> searchProductByCategoryName(int id)
		{
			return customerRepository.findByCatId(id);
		}

		public List<ProductCategory> getProductCategories() 
		{
			return productCategoryRepository.findAll();
		}

		public void placeOrder(int customerId, String paymentMode, double totalAmount) 
		{
			Orders order = new Orders();
			order.setOrderPayment(paymentMode);
			order.setTotalAmount(totalAmount);
			order.setCustomerId(customerId);
			orderRepository.save(order);
		}
	
}


