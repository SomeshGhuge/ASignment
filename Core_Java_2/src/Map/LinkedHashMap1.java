package Map;
/*
LinkedHashMap-
HashMap provided the advantage of quick insertion, search, and deletion
	A LinkedHashMap is a ‘hashtable and linked list implementation of the map interface with a predictable iteration order.
	It is the same as HashMap except it maintains an insertion order i.e. ordered


*/

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeSet;

public class LinkedHashMap1 {

	public static void main(String[] args) {

		LinkedHashMap hm = new LinkedHashMap();
		hm.put(10, "ajay");
		hm.put(11, "ram");
		hm.put(12, "shyam");

		System.out.println(hm);


	}

}
