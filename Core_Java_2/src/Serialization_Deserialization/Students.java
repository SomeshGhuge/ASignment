package Serialization_Deserialization;

import java.io.Serializable;

public class Students implements Serializable {

	
	private static final long serialVersionUID = 1L;
	String firstname;
	String lastname;
	transient int salary;// you did not want ro show the salary

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
