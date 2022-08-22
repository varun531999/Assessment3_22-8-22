package com.example.demo.controller;





import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.CustomerRepo;

import com.example.demo.model.Customer;

@RestController

public class CustomerController

{

 @Autowired

 CustomerRepo repo;

 /*
 * @RequestMapping("/") public String home() { return "home.jsp"; }
 */

 @PostMapping(path="/customer",consumes= {"application/json"})

 public Customer addCustomer(@RequestBody Customer customer)

 {

 repo.save(customer);

 return customer;

 }

 @GetMapping(path="/customers")

 public List<Customer> getCustomers()

 {

 return repo.findAll();

 }

 @RequestMapping("/customer/{cid}")

 public Optional<Customer> getCustomer(@PathVariable("cid")int cid)

 {

 return repo.findById(cid);

 }

 @DeleteMapping("/customer/{cid}")

 public String deleteCustomer(@PathVariable int cid)

 {

	 Customer a = repo.getOne(cid);

 repo.delete(a);

 return "deleted";

 }

 @PutMapping(path="/customer",consumes= {"application/json"})

 public Customer saveOrUpdateCustomer(@RequestBody Customer customer)

 {

 repo.save(customer);

 return customer;

 }

}