package Assignment24;

//   1.   Suppose I have Employee class that containing   I'd, name and city
//        now I want to sort the data based on comparable interface by using name.

import java.lang.*;
import java.util.*;
public class Problem1_Employee implements Comparable<Problem1_Employee> {

	String name;
	int id;
	String city;
	
	public Problem1_Employee(int id,String name,String city) {
		super();
		this.id=id;
		this.name=name;
		this.city=city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Problem1_Employee [name=" + name + ", id=" + id + ", city=" + city + "]";
	}
	
	@Override
	public int compareTo(Problem1_Employee o) {
		return this.name.compareTo(o.name);
	}
	
	
}
