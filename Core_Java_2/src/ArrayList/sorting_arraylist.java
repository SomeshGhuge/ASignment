package ArrayList;

//5. Program for sorting_arraylist

import java.util.ArrayList;
import java.util.Collections;
public class sorting_arraylist {
        public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<String>();
		al.add("shubham");
		al.add("rahul");
		al.add("laxman");
		al.add("snehal");
		al.add("kshitija");
		al.add("yogesh");
		al.add("piyush");
		al.add("pushkar");
		al.add("ajay");
		
		Collections.sort(al);
		System.out.println(al);
	}}
