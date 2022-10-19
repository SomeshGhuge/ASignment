package Set;

import java.util.LinkedHashSet;
public class Linked_Hash_Set2_Generic {
   public static void main(String[] args) {
	    LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<Integer>();
		linkedHashSet.add(10);
		linkedHashSet.add(20);
		linkedHashSet.add(30);
//System.out.println(linkedHashSet);
		for(int j : linkedHashSet) {
				System.out.println(j);
		}}}
