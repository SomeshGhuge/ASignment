package Set;
/*
LinkedHashSet-
It is the child class of HashSet….
Introduced in 1.2 version.
It is exactly same as hashset but except the following difference.

HashSet                                 	LinkedHashSet

The underlying data structure          The underlyng data structure
is hashtable.	                       is hashtable + LinkedList
                                       (that is hybrid data structure).
                                       
Insertion order is not preserved.	   Insertion order is preserved.

Introduced in 1.2 version.             Introduced in 1.4 version.

*/
import java.util.HashSet;
import java.util.LinkedHashSet;
public class Linked_Hash_Set {
  public static void main(String[] args) {
     LinkedHashSet LHS = new LinkedHashSet();
     LHS.add("ram");
     LHS.add("shyam");
     LHS.add(null);
     LHS.add(10);
     LHS.add("ram"); // return false
		System.out.println(LHS);
	}}                          
/*
Note- 
1. Load factor is vary between 0.0 to 1.0 and default load factor is 0.75
2. LinkedHashSet is best choice if we want to develop cache based application where duplicates are not allowed and insertion order is preserved.
8?   */
  