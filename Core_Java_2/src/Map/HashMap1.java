package Map;
/*

Map >>>>>>>>>>>>>
The map interface is present in java.util package represents a mapping between a key and a value. The Map interface is not a subtype of the Collection interface. Therefore it behaves a bit differently from the rest of the collection types. A map contains unique keys.
1.	Map is not child interface of collection.
2.	If we want to represent group of individual objects as key value pair then should go for map.
3.	Exo :--  Roll no  Name
     101      Soham
               102      Ram
               103      Shyam
4.	Both key and values are objects, duplicated keys are not allowed, but values may be duplicated.



HashMap :--------
HashMap is a part of Java’s collection since Java 1.2. It provides the basic implementation of the Map interface of Java. It stores the data in (Key, Value) pairs. To access a value one must know its key. This class uses a technique called Hashing.
	A HashMap is class which implements the Map interface
	It stores values based on key.
	It has 16 size and internally it will increase the size by double, so new size will be 32,64,128.
	It is unordered, which means that the key must be unique
	It may have null key-null value
	For adding elements in HashMap we use the put method
	Return type of put method is Object.
Constructor:
1) HashMap hm = new HashMap();
	It will create default HashMap with default capacity 16

2) HashMap hm = new HashMap(int InitialCapacity);
	It will create Hashmap with specified capacity

3) HashMap hm = new HashMap(int initialCapacity, float loadFactor);
	It will create Hashmap with specified capaciity and load factor

4) HashMap hm = new HashMap(Map map);
	It will convert the other map to HashMap

*/


import java.util.HashMap;
import java.util.TreeSet;

public class HashMap1 {

	public static void main(String[] args) {

		HashMap hm = new HashMap();
		hm.put(10, "ashok");
		hm.put(11, "ram");

		System.out.println(hm);

	}

}
