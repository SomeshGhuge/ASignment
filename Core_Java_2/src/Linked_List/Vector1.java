package Linked_List;
/*

Vector:--------
The Vector class implements a growable array of objects. Vectors fall in legacy classes, but now it is fully compatible with collections. It is found in java.util package and implement the List interface.
1.	 The underlying data structure for vector is growable or resizable array.
2.	Duplicates objects are allowed.
3.	Insertion order is preserved.
4.	Null insertion is possible.
5.	Heterogenous objects are allowed.
6.	Vector class implements serializable, clonable and randmoaccess interface.
7.	Most of methods are present in vector are synchronized.
8.	 Hence vector object is thread safe.
9.	Best choice if frequent operation is retrieval.

Methods-
For adding objects-
add(Object o)-
add(int index, object o)-
addElement(object o)-

For removing objects-
remove(object o)
remove(int index)
removeElement(object o)

For accessing elements-
Object get(int index)
Object ElementAt(int index)
Object firstElement()
Object lastElement()

Other methods-
int size();
int capacity();

Constructor-
1.	Vector v= new Vector();
       Create the empty object with default initial capacity 10, once the vector reaches its max capacity a new vector object will be created with

New capacity= 2*current capacity.

2.	Vector v= new Vector(int initialcapacity);
       Create the empty vector object with specified initial capacity.

3.	Vector v= new Vector(int initialcapacity, int incrementalcapacity)

4.	Vector v= new Vector(Collection c);

               Create the equivalent vector object for given collection.
*/

import java.util.Vector;
public class Vector1 {
       public static void main(String args[]) {
         Vector v = new Vector();
			System.out.println(v.capacity());
				for (int i = 1; i <= 10; i++) {
					v.addElement(i);
				}
			System.out.println(v.capacity());
			v.addElement("J");
			System.out.println(v.capacity());
			System.out.println(v);
         }
       }
