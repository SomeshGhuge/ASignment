package Set;
/*
SortedSet->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

1.	It the child interface of set.
2.	It we want to represent group of objects according to some 
sorting order and duplicates are not allowed then we should go for 
sortedset.

Methods-
Object first()- return the first element of sortedset.
Object last()-return the last element of sortedset.



TreeSet    >>>>>>>>>>>>>>>>>>>>>>
1.	Underlying data structure is balanced tree.
2.	Duplicates objects are not allowed.
3.	Insertion order is not preserved.
4.	All the objects will be inserted according to some sorting order.
5.	Heterogenous objects are not allowed.
6.	If we are trying to insert the heterogenous objects then will get run time exception saying classcastexception.
7.	Null insertion is not allowed, if we are trying to insert it then will get run time error as NullPointerException.

Constructor-
1.	TreeSet ts= new TreeSet();
           Create the empty treeset object where elements will be inserted according to default natural sorting order.

2.	TreeSet ts= new TreeSet(Comparator c);
            Create empty treeset object where elements will be inserted according to customized sorting order.

3.	TreeSet t= new TreeSet(SortedSet s);
4.	TreeSet t= new TreeSet(Collection c);

*/


import java.util.TreeSet;
public class TreeSet1 {
          public static void main(String[] args) {
                    TreeSet ts = new TreeSet();
		ts.add("Jay");
		ts.add("zam");
		ts.add("Shyam");
		System.out.println(ts);
	}}
