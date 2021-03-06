package com.akhilaBank.AkhilaBank.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.akhilaBank.AkhilaBank.models.Customer;
import com.akhilaBank.AkhilaBank.services.CustomerService;

@Controller
public class CustController {
	@Autowired
	private CustomerService customerService;

	@GetMapping
	public String viewHomepage() {
		return "index";
	}

	@GetMapping("/register")
	public String showRegistrationForm(Model model) {
		model.addAttribute("customer", new Customer());
		
		return "signup_form";
	}

	@PostMapping("/process_register")
	public String processRegister(Customer customer,Model model) {
	    customer.setPassword(customer.getPan_number());
		String accountNumber = "2"+new SimpleDateFormat("ddMMyyyySSS").format(Calendar.getInstance().getTime());
		customer.setAccountnumber(accountNumber);
		customerService.AddCustomer(customer);
		model.addAttribute("accountNumber",accountNumber);
		return "register_success";
	}
	@GetMapping("/home")
	public String homepage() {
		
		
		
		return "home";
	}
}
