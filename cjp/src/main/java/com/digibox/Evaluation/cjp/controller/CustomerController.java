package com.digibox.Evaluation.cjp.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.digibox.Evaluation.cjp.exception.MessageDetails;
import com.digibox.Evaluation.cjp.model.Customer;
import com.digibox.Evaluation.cjp.repository.CustomerRepository;

/**
 * Class responsible for exposing Endpoint customers
 * @author Claudio Perez
 * @version 1.0
 */

@RestController
@RequestMapping("/api/v1") 
public class CustomerController {
	
	/**
	 * Container variable of the injected JPA repository instance that implements the DAO pattern
	 */
	@Autowired
	private CustomerRepository customerRepository;
	
	/**
	 * Enpoint that allows a Customer to recover through the Get method
	 * @param customerId
	 * @return Customer if successful or otherwise a descriptive message
	 */
	//Object serialization using framework Spring boot antoacion @GetMapping and consumer and producer
	@GetMapping(path = "/customers/{customerId}",consumes=MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
	private ResponseEntity<?> getCustomerById(@PathVariable(value="customerId") long customerId)
	 {
		Optional<Customer> customer = customerRepository.findById(customerId);
		if(customer.isPresent())
		{
			return ResponseEntity.ok().body(customer.get());
		}
		return ResponseEntity.badRequest().body(new MessageDetails(new Date(),"Not exists.", "the requested value: " + customerId + " non-existent"));
	}
	
	 /**
	 * Enpoint that allows to create a Customer through the Post method
	 * @param customer 
	 * @return Customer if successful or otherwise a descriptive message
	 * 
	 */
	//Object serialization using framework Spring boot antoacion @@PostMapping and consumer and producer
	@PostMapping(path = "/customers",consumes=MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
	//  the input is validated with the @Valid annotation using the Customer class
	public ResponseEntity<?> createCustomer(@Valid @RequestBody Customer customer ) 
	 {
		if(!customerRepository.existsById(customer.getCustomerId()))
		{
			customer = customerRepository.save(customer);
			return new ResponseEntity<Customer>(customer, HttpStatus.CREATED);
		}
		return ResponseEntity.badRequest().body( new MessageDetails(new Date(),"Not created.", " Value: " + customer.getCustomerId() + " already exists"));
	}
	
	 /**
	 * Enpoint that allows you to retrieve a list of Customer through the Get method
	 * @param customer 
	 * @return Customer list or an empty list 
	 */
	//Object serialization using framework Spring boot antoacion @GetMapping and consumer and producer
	@GetMapping(path = "/customers", consumes=MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_XML_VALUE)
	public List<Customer> getAllCustomers(){
			return customerRepository.findAll();
	}

}
