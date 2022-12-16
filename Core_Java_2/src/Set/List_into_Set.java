package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class List_into_Set {
  public static void main(String[] args) {
     ArrayList arrayList= new ArrayList();
		arrayList.add(50);
		arrayList.add(75);
		arrayList.add(100);
		arrayList.add(75);// This is duplicate value
		System.out.println("List is="+arrayList);
		
		HashSet hashSet=new HashSet(arrayList);//pass arrayList as a constructor in hashset
		
		System.out.println("\n<-----1st Way----->");
		System.out.println("New Element is="+hashSet);
		
		System.out.println("\n<-----2nd Way----->");	
	    Iterator itr=hashSet.iterator();
	    while(itr.hasNext()) {
           System.out.println(itr.next());
		}
	    
	    System.out.println("\n<-----3rd Way----->");
	    for(Object s:hashSet) {
	    	System.out.println(s);
	    }
  }}
