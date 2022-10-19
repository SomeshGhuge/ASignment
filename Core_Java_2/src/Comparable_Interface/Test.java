package Comparable_Interface;

import java.util.ArrayList;
import java.util.Collections;
public class Test {
      public static void main(String[] args) {
         ArrayList<Employee> al = new ArrayList<Employee>();
		       al.add(new Employee(101, "ram", 9000));
               al.add(new Employee(102, "ashok", 3000));
		       al.add(new Employee(103, "ajay", 8000));
               Collections.sort(al);

             }
             }	
/*
Here, I am getting error at collection.sort(al);
Now to resolve this issue, need to implement comparable<Employee> 
into Employee class.
*/