package Collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList al= new ArrayList();
		al.add(50);
		al.add("ram");
		al.add(10);
		al.remove(1); //passing the index value here, ram will be removed from list.
		al.add(null);
		al.add(null);
		System.out.println(al);
		
	}
}
