package Comparable_Interface;

import java.util.ArrayList;
import java.util.Collections;
public class Test_Comparable {
	
	public static void main(String[] args) {
        ArrayList<Employee_Comparable> al = new ArrayList<Employee_Comparable>();
		al.add(new Employee_Comparable(101, "ram", 9000));
		al.add(new Employee_Comparable(102, "ashok", 3000));
		al.add(new Employee_Comparable(103, "ajay", 8000));
        Collections.sort(al);
        
for(Employee_Comparable emp : al) {
			System.out.println("id>>" + emp.getId() + " name>>" + emp.getName() + " salary" + emp.getSalary());
		}}}
