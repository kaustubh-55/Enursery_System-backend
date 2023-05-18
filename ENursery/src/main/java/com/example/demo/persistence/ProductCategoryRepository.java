package com.example.demo.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.*;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

	List<Product> findByProductCategoryName(String name);
}
