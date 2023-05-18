package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "productcategory")
public class ProductCategory {
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Column(name="productcategoryId")
	private int productCategoryId;
	@Column(name="productcategoryName")
	private String productCategoryName;
	public ProductCategory() {}
	
	public ProductCategory(int productCategoryId, String productCategoryName) {
		this.productCategoryId = productCategoryId;
		this.productCategoryName = productCategoryName;
	}
	
	public int getProductCategoryId() {
		return productCategoryId;
	}
	public void setProductCategoryId(int productCategoryId) {
		this.productCategoryId = productCategoryId;
	}
	public String getProductCategoryName() {
		return productCategoryName;
	}
	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}
	
	@Override
	public String toString() {
		return "ProductCategory [productCategoryId=" + productCategoryId + ", productCategoryName="
				+ productCategoryName + "]";
	}

	
	
	
}
