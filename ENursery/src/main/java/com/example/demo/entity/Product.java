package com.example.demo.entity;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name="productId")
	private int productId;
	@Column(name="productName")
	private String productName;
	@Column(name="productDescription")
	private String productDescription;
	@Column(name="productPrice")
	private double productPrice;
	@Column(name="productQuantity")
	private int productQuantity;
	@Column(name="productImg")
	private String productImg;
	@Column(name="productCategoryId")
	private int productCategoryId;
	
	public Product() {}

	public Product(int productId, String productName, String productDescription, double productPrice,
			int productQuantity, String productImg, int productCategoryId) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
		this.productImg = productImg;
		this.productCategoryId = productCategoryId;
	}

	public Product(int productid) 
	{
		this.productId = productid;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public String getProductImg() {
		return productImg;
	}

	public void setProductImg(String productImg) {
		this.productImg = productImg;
	}

	public int getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(int productCategoryId) {
		this.productCategoryId = productCategoryId;
	}
	

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productDescription="
				+ productDescription + ", productPrice=" + productPrice + ", productQuantity=" + productQuantity
				+ ", productImg=" + productImg + ", productCategoryId=" + productCategoryId + "]";
	}
	

}
