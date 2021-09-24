package com.akhilaBank.AkhilaBank.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.akhilaBank.AkhilaBank.models.Customer;

public interface CustomerDAO extends JpaRepository<Customer, Long> {

	@Query(value = "select * from customer where email =?1", nativeQuery = true)
	Customer findByEmail(String email);

}
