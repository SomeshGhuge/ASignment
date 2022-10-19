package Set;

public class Info {
	/*
	 Set-
1.	It is child interface of collection.
2.	It is present in Java.util.Package.
3.	If we want to represent group of individual objects as single entity where duplicates are not allowed and insertion order is not preserved then we should go for set.
4.	This interface contains the methods inherited from the Collection interface and adds a feature that restricts the insertion of the duplicate elements. There are two interfaces that extend the set implementation namely SortedSet and NavigableSet.
 
	 
The navigable set extends the sorted set interface. Since a set doesn’t retain the insertion order, the navigable set interface provides the implementation to navigate through the Set. The class which implements the navigable set is a TreeSet which is an implementation of a self-balancing tree. Therefore, this interface provides us with a way to navigate through this tree.

HashSet-
1.	Underlying data structure is hashtable.
2.	Duplicates are not allowed. If we are trying to insert the duplicates then we won’t get any compile.
3.	Insertion order is not preserved.
4.	Heterogenous objects are allowed.
5.	Null insertion is possible.
6.	It implements serializable and clonable interface but not random access interface.
7.	Hashset is best choice if frequent operation is search operation.

Constructor-
1.	HashSet hs= new HashSet();
           Create the empty hashset object with default initial capacity 16 and default fill ratio is 0.75.

2.	HashSet hs= new HashSet(int initialcapacity);
           Create the empty hashset object with specified initial capacity and default fill ratio is 0.75.

3.	HashSet hs= new HashSet(int initialcapacity, float loadfactor);
           Create the empty hashset object with specified initial capacity and specified load factor.

4.	HashSet hs= new HashSet(Collection c);
           
Load factor or fill ratio:--
           After loading, how much factor, new hashset object will be created that factor is called as load factor.

	 */

}
