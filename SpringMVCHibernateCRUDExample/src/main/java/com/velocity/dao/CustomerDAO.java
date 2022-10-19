package com.velocity.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.velocity.model.Customer;

@Repository
public class CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory; //injecting the sessionFactory object

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	public List<Customer> getAllCustomeries() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Customer> customerList = session.createQuery("from Customer").list();
		return customerList; //here we are returning the list to getAllcustomeries () method
	}

	public Customer getCustomer(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Customer customer = (Customer) session.get(Customer.class, new Integer(id)); //2
		return customer;
	}

	public Customer addCustomer(Customer customer) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(customer); //persist or save
		return customer; //return customer object to addCustomer() method
	}

	public void updateCustomer(Customer customer) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(customer); //db connect
	}

	public void deleteCustomer(int id) { //id-1
		Session session = this.sessionFactory.getCurrentSession();
		Customer p = (Customer) session.load(Customer.class, new Integer(id)); //2
		if (null != p) { //2
			session.delete(p); //session.delete(p); //1 or 2
		}
	}	
}
