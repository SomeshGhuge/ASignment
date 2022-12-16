package Set;

import java.util.HashSet;
import java.util.Iterator;
public class HastSet4 {
   public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>(); 
        // 16 internally size increase
		hashSet.add("10"); // 16*0.75 =12
		hashSet.add("20");
		hashSet.add("30"); // 13th element
		hashSet.add(null);
		
		System.out.println("\n<-----1st Way----->");
		Iterator<String> itr = hashSet.iterator();  // first way
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("\n<-----2nd Way----->");
		System.out.println(""+hashSet);// 2nd way
		
		System.out.println("\n<-----3rd Way----->");
		for(Object s:hashSet) {  // 3rd way
			System.out.println(s);
		}
		
   }}

