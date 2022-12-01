package com.example.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Model.Customer;

@Repository
public interface CustomerDTO extends CrudRepository<Customer, Integer> {

	

}
