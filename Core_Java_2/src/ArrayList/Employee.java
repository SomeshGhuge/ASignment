package ArrayList;

public class Employee {

	// id, name, salary.

	int id;
	String name;
	String salary;
	String Lastname;
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	
	public Employee(int id, String name, String salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Employee(String name,String Lastname) {
		super();
		this.name=name;
		this.Lastname=Lastname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
		return "Employee [id=" + id + ", name=" + name + ", Lastname=" + Lastname+ ", salary=" + salary + "]";
	}
	
	
	

}