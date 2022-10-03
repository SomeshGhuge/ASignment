package Assignemnt21;

// 1. Design the method which return the list that contain the element as Ram,
//   Sohan, Ashok, Ajay, Prasanna now I want to sort that element based on descending order.
import java.util.*;
public class Problem1 {
	// method return list
	public List<String> list1() {
		List<String> list=new ArrayList<String>();
		list.add("Sohan");
		list.add("Ram");
		list.add("Ashok");
		list.add("Ajay");
		list.add("Prasanna");
		return list;
	}
	
	public static void main(String[]args) {
		Problem1 pro = new Problem1();
		List<String> lisst= pro.list1();
		Collections.sort(lisst);
		System.out.println("Assending order list is --->"+lisst);
		
		System.out.print("List in descending order is ---->");
		for(int a=lisst.size()-1;a>=0;a--) {
               System.out.print(lisst.get(a)+" ");
		}
		
	}
	



}
