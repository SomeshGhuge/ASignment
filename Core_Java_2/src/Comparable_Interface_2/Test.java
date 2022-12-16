package Comparable_Interface_2;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	public static void main(String[]args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(1,30000,"Somesh","Pune"));
		al.add(new Student(2,25000,"Ghuge","Pune"));
		al.add(new Student(3,35000,"yogesh","Pune"));
		al.add(new Student(4,40000,"munda","Pune"));
		
		Collections.sort(al);
		
		for( Student s:al) {
			System.out.println("id--->"+s.getId()+"  Salary-->"+s.getSalary()+"  location-->"+s.getLocation()+"  name-->"+s.getName());
		}
			
		
	}

}
