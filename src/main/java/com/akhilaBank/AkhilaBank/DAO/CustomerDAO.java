package com.akhilaBank.AkhilaBank.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akhilaBank.AkhilaBank.models.Customer;

public interface CustomerDAO extends JpaRepository<Customer, Long> {

}
