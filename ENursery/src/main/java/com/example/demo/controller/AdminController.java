package com.example.demo.controller;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.*;
import com.example.demo.service.*;


@RestController
public class AdminController {

	private AdminServiceImplementations adminServiceImplementation;

	public AdminController(AdminServiceImplementations adminServiceImplementation) {
		this.adminServiceImplementation = adminServiceImplementation;
	}

	@GetMapping("/admin/products")
	public List<Product> getProducts(){
		return adminServiceImplementation.getProducts();
	}

	@PostMapping("/admin/add-product")
	public void addProduct(@RequestBody Product product)
	{
		product.setProductId(0);
		adminServiceImplementation.addProduct(product);
	}
	
	@PostMapping(value="/admin/upload",produces="application/json")
	  @ResponseBody
	  public ResponseEntity<?> uploadImages(@RequestBody MultipartFile[] files) {
		  Map<String, Object> response = new HashMap<>();
		    try {
		    	List<String> filenames = new ArrayList<>();
		      for (MultipartFile file : files) {
		        Path filePath = Paths.get("src/main/resources/static", file.getOriginalFilename());
		        file.transferTo(filePath);
		        filenames.add(file.getOriginalFilename());
		      }
		      response.put("image_url","http://localhost:8080/content/"+filenames.get(0) );
		      return ResponseEntity.ok(response);
		    } catch (IOException e) {
		      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Upload failed");
		    }
	  }

	@PutMapping("/admin/update-product")
	public void updateProduct(@RequestBody Product product) {
		adminServiceImplementation.updateProduct(product);
	}


	@DeleteMapping("/admin/delete-product/{id}")
	public void deleteProduct(@PathVariable("id") int id){
		adminServiceImplementation.deleteProduct(id);
		
	}

	@GetMapping("/admin/categories")
	public List<ProductCategory> getCategories() {
		return adminServiceImplementation.getProductCategories();

	}

	@GetMapping("/admin/customers")
	public List<Customer> getCustomers() {
		return adminServiceImplementation.getCustomers();

	}

	@GetMapping("/admin/orders")
	public List<Orders> getOrders() {
		return adminServiceImplementation.getOrders();

	}

	@PostMapping("/admin/add-category")
	public boolean addCategory(@RequestBody String category) {
		ProductCategory p =new ProductCategory();
		p.setProductCategoryName(category);
		adminServiceImplementation.addProductCategory(p);
		return true;
	}

	@PutMapping("/admin/update-category")
	public void updateCategory(@RequestBody ProductCategory category) {
		adminServiceImplementation.updateProductCategory(category);

	}

	@DeleteMapping("/admin/delete-category/{productCategoryId}")
	public void deleteCategory(@PathVariable int productCategoryId) {
		adminServiceImplementation.deleteProductCategory(productCategoryId);
	}
}

