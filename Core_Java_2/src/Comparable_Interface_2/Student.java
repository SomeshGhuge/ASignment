package Comparable_Interface_2;

public class Student implements Comparable<Student> {

	int id;
	int salary;
	String name;
	String location;
	public Student(int id, int salary, String name, String location) {
		super();
		this.id=id;
		this.salary=salary;
		this.name=name;
		this.location=location;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", salary=" + salary + ", name=" + name + ", location=" + location + "]";
	}
	
	
	@Override
	public int compareTo(Student o) {
	if(salary==o.salary)
		return 1;
	else if(salary>o.salary)
		return 0;
	else
		return -1;
	}
	
}
