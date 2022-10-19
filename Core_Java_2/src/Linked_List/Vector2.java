package Linked_List;

import java.util.Vector;
public class Vector2 {
     public static void main(String[] args) {
		Vector<String> vector= new Vector<String>();
		vector.add("Jeevan");
		vector.add("velocity");
		vector.add("Pune");
		vector.add("Pune");
		
		while(vector.contains("Pune")) {
			vector.remove("Pune");
		}
		
		System.out.println("new vector is="+vector);
		
		/*System.out.println("vector size="+vector.size());
		System.out.println("vector capacity="+vector.capacity());
		System.out.println("index="+vector.get(2)); */
	}}
