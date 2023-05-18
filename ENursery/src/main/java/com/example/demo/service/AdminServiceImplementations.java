package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.*;

import com.example.demo.persistence.*;



@Service
public class AdminServiceImplementations implements AdminServiceDeclarations{



	private ProductRepository productRepository;
    private ProductCategoryRepository productCategoryRepository;
    private CustomerRepository customerRepository;
    private OrderRepository orderRepository;
    

    public AdminServiceImplementations(ProductRepository productRepository,
			ProductCategoryRepository productCategoryRepository, CustomerRepository customerRepository,
			OrderRepository orderRepository) {
		this.productRepository = productRepository;
		this.productCategoryRepository = productCategoryRepository;
		this.customerRepository = customerRepository;
		this.orderRepository = orderRepository;
	}
	

	@Override
	public List<Product> getProducts() {
		return  productRepository.findAll();
	}

	@Override
	public void addProduct(Product product) {
		productRepository.save(product);
		System.out.println(product);
	}

	
	public void updateProduct(Product product) {
		
		productRepository.save(product);
	}
	

	@Override
	public void deleteProduct(int productId) {
		productRepository.deleteById(productId);
	}

	@Override
	public List<ProductCategory> getProductCategories() {
		return  productCategoryRepository.findAll();
	}

	@Override
	public void addProductCategory(ProductCategory category) {
		productCategoryRepository.save(category);
	}

	@Override
	public void updateProductCategory(ProductCategory productCategory) {
		
		productCategoryRepository.save(productCategory);
	}

	@Override
	public void deleteProductCategory(int categoryId) {
		productCategoryRepository.deleteById(categoryId);
	}

	@Override
	public List<Customer> getCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public List<Orders> getOrders() {
		return  orderRepository.findAll();
	}

	@Override
	public Product getProductById(int productId) {
		return productRepository.findById(productId).get();
	}

	@Override
	public ProductCategory getProductCategoryById(int categoryId) {
		return productCategoryRepository.findById(categoryId).get();
	}

	
}
