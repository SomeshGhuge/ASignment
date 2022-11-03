package ArrayList;

import java.util.ArrayList;
import java.util.List;

//8.  Design the method to return the list of Employees in arraylist.
public class the_method_to_return_the_list_of_Employees_in_arraylist {
public List<Employee> getEmployeeList() {

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee( "ajay", "deshmukh"));
		list.add(new Employee("Ram", "Pawar"));
		return list;
	}



public static void main(String[] args) {
	the_method_to_return_the_list_of_Employees_in_arraylist al=new the_method_to_return_the_list_of_Employees_in_arraylist();
	System.out.println(al.getEmployeeList());
}
}