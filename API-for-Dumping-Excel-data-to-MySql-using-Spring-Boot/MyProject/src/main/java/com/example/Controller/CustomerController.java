package com.example.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.Customer;
import com.example.Service.CustomerService;


@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService cs;
	
	
	@RequestMapping(path = "saveproducts")
	public String setDatainDb() {
		cs.saveCustomerData();
		
		return "Data Added Successfully";
	}
	
}
