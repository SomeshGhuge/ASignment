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
		arrayList.add(75);
		System.out.println("List is="+arrayList);
		
		HashSet hashSet=new HashSet(arrayList);
		//System.out.println("New Element is="+hashSet);
		
	Iterator itr=hashSet.iterator();
	while(itr.hasNext()) {
           System.out.println(itr.next());
		}}}
