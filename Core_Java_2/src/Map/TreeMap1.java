package Map;
/*
TreeMap-
	The TreeMap is a class which implements NavigableMap interface which is the sub- interface of SortedMap.
	It stores values based on key.
	It is ordered but in an Ascending manner.
	It cannot have null key at run time but can have null values because the interpreter will not understand how to sort null with other values.
	Keys should be unique.
*/
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.TreeSet;
public class TreeMap1 {

	public static void main(String[] args) {

		TreeMap hm = new TreeMap();
		hm.put(10, "Ajay");
		hm.put(11, "ram");
		hm.put(12, "shyaaam");

		System.out.println(hm);


	}

}
