package Comparator_Interface;
/*
Comparator interface:------->

	We can use comparator to define our own sorting 
    (customized sorting order)
	It present in java.util package.
	It defines two methods-
o	Public int compare(Object obj1, Object obj2)
o	Public Boolean equals();

	Whenever we are implementing the comparator interface, 
compulsory we should provide the implementation for compare() method.

	Implementing the equals method is optional, because it is already
available in every java class from object class.

*/

public class Student {
	String id;
	String name;
	String salary; // custom objects
	// int is not invoked in this comparator so use string

	public Student(String id, String name, String salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}
