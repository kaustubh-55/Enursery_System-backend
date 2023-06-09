package com.example.demo.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.*;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Integer> {
	List<Orders> findByCustomerId(int customerId);
}
