package com.example.demo.dao;





import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Customer;

import java.util.List;

public interface CustomerRepo extends JpaRepository<Customer,Integer>

{

}

