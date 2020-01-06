package com.digibox.Evaluation.cjp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digibox.Evaluation.cjp.model.Customer;
/**
 * Interface for access to jpa repository that implements DAO pattern
 * @author Claudio Perez
 * @version 1.0
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
