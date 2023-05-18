package com.example.demo.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.*;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query("FROM Product WHERE productName LIKE %:name%")
    List<Product> findByName(@Param("name") String name);
    
    @Query("From Customer where customerEmail=:email")
    List<Customer> getCustomer(@Param("email") String email);
    
    @Query("From Customer where customerEmail=:email")
    Customer getLogin(@Param("email") String email);

    @Query("FROM Product WHERE productCategoryId =:id")
    List<Product> findByCatId(@Param("id") int id);
    

    @Query("From Customer where customerEmail=:email")
    Customer getCustomerByEmail(@Param("email") String email);

	Customer findByCustomerEmailAndCustomerPassword(String email, String password);

	Customer findByCustomerPassword(String customerPassword);
	 
}
