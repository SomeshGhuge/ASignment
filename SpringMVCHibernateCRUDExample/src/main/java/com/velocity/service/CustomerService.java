package com.velocity.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.velocity.dao.CustomerDAO;
import com.velocity.model.Customer;

@Service
public class CustomerService {

	@Autowired
	private CustomerDAO customerDao; //injecting the customerDAO object into customerservice class
	
	//Design method for List<Employee>- beginTransection
	@Transactional
	public List<Customer> getAllCustomer() {  //get List of all customer
		//list contain list of all the customer.
		List<Customer> list=customerDao.getAllCustomeries();
		return list;
	}

	@Transactional
	public Customer getCustomer(int id) { //get customer record by using id
		Customer customer=customerDao.getCustomer(id); //calling method
		return customer; //public Employee addEmployee(){  }
	}

	@Transactional
	public void addCustomer(Customer customer) { //add new record
		customerDao.addCustomer(customer); //passing the object of customer into
		//addCustomer()
	}

	@Transactional
	public void updateCustomer(Customer customer) { //update record
		customerDao.updateCustomer(customer);
	}

	@Transactional
	public void deleteCustomer(int id) { //by using id-1
		customerDao.deleteCustomer(id); //2
	}
}
