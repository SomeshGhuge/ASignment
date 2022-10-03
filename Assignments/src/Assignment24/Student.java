package Assignment24;
//      2. Suppose I have Student class containing I'd, name and salary 
//         now I want to sort the data based on comparator interface by using salary.

public class Student {
	String name;
	String id;
	String salary;
	
	public Student(String id,String name,String salary) {
		super();
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	
	

}
