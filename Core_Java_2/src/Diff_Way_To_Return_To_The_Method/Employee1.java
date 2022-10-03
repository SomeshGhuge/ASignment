package Diff_Way_To_Return_To_The_Method;
// Here we reuturn only employee id 
// How_to_return_the_empId_only 
public class Employee1 {
	// by using class name we cant create return type method
	// here we create the return type method by using another class name and constructor
	public static Employee getEmployeeById() {
		int id=10;
		return new Employee(id);
		// return only employee id here from Employee class constructor
	}
	
	public static void main(String[]args) {
		Employee e= getEmployeeById();// here we create type cast
	   System.out.println(e.id);
	}

}
