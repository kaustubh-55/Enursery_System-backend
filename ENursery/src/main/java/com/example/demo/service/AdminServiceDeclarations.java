package com.example.demo.service;

import java.util.List;


import com.example.demo.entity.*;


public interface AdminServiceDeclarations
{
	public List<Product> getProducts();
	public void addProduct(Product product);
	public void updateProduct(Product product);
	public void deleteProduct(int productId);
	public Product getProductById(int productId);
	
	public List<ProductCategory> getProductCategories();
	public void addProductCategory(ProductCategory category);
	public void updateProductCategory(ProductCategory productCategory);
	public void deleteProductCategory(int categoryId);
	public List<Customer> getCustomers();
	public List<Orders> getOrders();
	public ProductCategory getProductCategoryById(int categoryId);
	
	
	}
