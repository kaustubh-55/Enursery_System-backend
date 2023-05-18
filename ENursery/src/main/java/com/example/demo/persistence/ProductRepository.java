package com.example.demo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.*;


@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>
{
	
}

