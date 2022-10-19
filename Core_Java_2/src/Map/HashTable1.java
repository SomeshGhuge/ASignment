package Map;
/*
Hashtable   ::----

The Hashtable class implements a hash table, which maps keys to values. 
Any non-null object can be used as a key or as a value. 
To successfully store and retrieve objects from a hashtable,
 the objects used as keys must implement the hashCode method and
  the equals method.
  
	Hashtable is a class which implements Map interface and extends
 Dictionary class.
	It stores values based on key….
	It is unordered and the key should be unique.
	It cannot have null keys or null values.
 It gives runtime error if we try to add any null keys or
  values but will not show an error at compile time.
	It has synchronised methods and slower than hashmap.

*/

import java.util.Hashtable;

public class HashTable1 {

	public static void main(String[] args) {

		Hashtable ht = new Hashtable();
		ht.put(10, "ram");
		ht.put(11, "sohan");
		System.out.println(ht);
	}

}
