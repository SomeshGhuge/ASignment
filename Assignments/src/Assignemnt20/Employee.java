package Assignemnt20;

public class Employee {

	String name;
	String id;
	String city;
	String Job;
	
	public Employee(String id,String name,String city,String Job) {
		super();
		this.id=id;
		this.name=name;
		this.city=city;
		this.Job=Job;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getJob() {
		return Job;
	}

	public void setJob(String job) {
		Job = job;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", city=" + city + ", Job=" + Job + "]";
	}
	
	
	
}
