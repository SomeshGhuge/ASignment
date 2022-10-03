package Assignemnt20;

//3. Design the method for ArrayList<Employee> which returns the list of employee
 //  and print that data.
import java.util.ArrayList;
import java.util.Iterator;
public class Problem3 {

	public static void main(String[]args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("1","Somesh","Latur","Java Developer"));
		al.add(new Employee("1","Santosh","Latur","Java Developer"));
		al.add(new Employee("1","Ganesh","Solapur","Java Developer"));
		al.add(new Employee("1","Komal","Pune","Java Developer"));
		
		for(Employee a:al) {
			System.out.println(a);
			System.out.println("------------------------------------");
		}
		
		Iterator<Employee> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			System.out.println("------------------------------------");

		}
		
	}
}
