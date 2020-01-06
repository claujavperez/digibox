package com.digibox.Evaluation.cjp.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * Class that defines the Customer entity and contains its validations by means of annotations
 * @author Claudio Perez
 * @version 1.0
 */

@Entity
@Table(name="customers")
public class Customer{

	//Fields Perisitent 
	@Id()
	@Column(name="customer_Id", nullable  = false )
	 private  long customerId;

	@NotEmpty
	@Size(min=2, max=100, message = "Must be between 2 and 100 characters")
	@Column(name="customer_Name", nullable  = false)
	 private String customerName;
  
	public Customer() {
	}
	
	//Constructors
	public Customer( long customerId,String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
	}
	
	// Properties
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId ;
	}
	
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName){
		this.customerName = customerName;
	}

 
}
