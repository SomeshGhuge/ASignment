package com.velocity.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.velocity.model.Customer;
import com.velocity.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService; //inject customerService object into CustomerController 
	//map the request with this getCustomer() method
	@RequestMapping(value = "/getAllCustomer", method = RequestMethod.GET)
	public String getCustomer(Model model) {

		List<Customer> listOfCustomeries = customerService.getAllCustomer();
		model.addAttribute("customer", new Customer()); //object create 
		model.addAttribute("listOfCustomer", listOfCustomeries); // get the value from listOfCustomer
		return "customerDetails"; //.jsp page
	}

	@RequestMapping(value = "/getCustomer/{id}", method = RequestMethod.GET)
	public Customer getCustomerById(@PathVariable int id) { 
		Customer customer = customerService.getCustomer(id);
		return customer; 
	}

	@RequestMapping(value = "/addCustomer", method = RequestMethod.POST)
	public String addCustomer(@ModelAttribute("customer") Customer customer) {
		if (customer.getId() == 0) { //2==0
			customerService.addCustomer(customer); //add customer
		} else {
			customerService.updateCustomer(customer); //update customer
		}

		return "redirect:/getAllCustomer"; //redirect to line no.20-
		//where we get all the list of customer
	}

	//updateCustomer-map the request to method
	@RequestMapping(value = "/updateCustomer/{id}", method = RequestMethod.GET)
	public String updateCustomer(@PathVariable("id") int id, Model model) {
		model.addAttribute("customer", this.customerService.getCustomer(id));
		model.addAttribute("listOfCustomer", this.customerService.getAllCustomer());
		return "customerDetails";
	}

	@RequestMapping(value = "/deleteCustomer/{id}", method = RequestMethod.GET)
	public String deleteCustomer(@PathVariable("id") int id) {
		customerService.deleteCustomer(id); //2
		return "redirect:/getAllCustomer"; //navigate to getAllCustomer List Page

	}
}
