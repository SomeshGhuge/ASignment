package Set;

import java.util.Iterator;
import java.util.LinkedHashSet;
public class Linked_Hash_Set2_Generic {
   public static void main(String[] args) {
	    LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<Integer>();
		linkedHashSet.add(10);
		linkedHashSet.add(20);
		linkedHashSet.add(30);
		
		System.out.println("\n<-----1st Way----->");
        System.out.println(linkedHashSet);

        System.out.println("\n<-----2nd Way----->");
		for(int j : linkedHashSet) {
				System.out.println(j);
		}
		System.out.println("\n<-----3rd Way----->");
		Iterator<Integer> itr=linkedHashSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
   }}
