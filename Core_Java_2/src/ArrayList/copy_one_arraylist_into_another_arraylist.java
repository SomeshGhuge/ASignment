package ArrayList;

//1.	Program for copy_one_arraylist_into_another_arraylist.

import java.util.ArrayList;
import java.util.Iterator;
public class copy_one_arraylist_into_another_arraylist {
     public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10); // 0th index
		al.add(20); // 1st index
		al.add(30); // 2nd index

		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(40); // 0th index
		al2.add(50); // 1st index
		al2.add(60); // 2nd index

		al.addAll(al2);
		System.out.println("copy arraylist is=" + al);

		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}}}

