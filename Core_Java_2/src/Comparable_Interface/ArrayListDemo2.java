package Comparable_Interface;
/*
 Comparable interface:------->
 
Java Comparable interface is used to order the objects of the 
user-defined class. This interface is found in java.lang package 
and contains only one method named compareTo(Object).

 It provides a single sorting sequence only, i.e., you can sort the 
 elements on the basis of single data member only. For example, 
 it may be rollno, name, age or anything else.
 
 
Public int compareTo(Object obj)


Example-->>>>>>>>>>>> obj1.compareTo(obj2)
return 1 if obj1 is greater than obj2
return -1 if obj1 is less than obj2
return 0 if obj1 & obj2 are equal.

 */

	import java.util.ArrayList;
	import java.util.Collections;
	public class ArrayListDemo2 {
	  public static void main(String[] args) {
	   	ArrayList<Integer> al = new ArrayList<Integer>(); // generics
			al.add(10);
			al.add(20);
			al.add(15);
			al.add(12);
			al.add(3);
			System.out.println("before sorting>>" + al);
			Collections.sort(al);
			System.out.println("after sorting>>" + al);
	}}

