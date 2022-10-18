package ArrayList;

//4. Program for demonstrate_the_arraylist_method

import java.util.ArrayList;
public class demonstrate_the_arraylist_method {
         public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add(10);
		al.add(20);
		al.add(50);
		al.add(2,75);
		System.out.println("size of list is="+al.size());
		System.out.println("List="+al);
		System.out.println(al.contains(80));
	}}
