package Comparator_Interface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Test {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student("101", "ram", "9000"));
		al.add(new Student("102", "ashok", "3000"));
		al.add(new Student("103", "ajay", "8000"));
		
		System.out.println("<---------First Name Comparator-------->");
		Collections.sort(al, new NameComparator());
		for (Student emp : al) {
			System.out.println("id>>" + emp.getId() + " name>>" + emp.getName() + " salary>>" + emp.getSalary());
		}
		
		System.out.println("\n<---------Second Salary Comparator-------->");
		Collections.sort(al,new SalaryComparator());
		for (Student All : al) {
			System.out.println("id>>" + All.getId() + " name>>" + All.getName() + " salary>>" + All.getSalary());
		}
		
		System.out.println("\n<---------Third Id Comparator-------->");
		Collections.sort(al,new IdComparator());
		for (Student All : al) {
			System.out.println("id>>" + All.getId() + " name>>" + All.getName() + " salary>>" + All.getSalary());
		}
	}}
