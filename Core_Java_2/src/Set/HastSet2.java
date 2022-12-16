package Set;

import java.util.HashSet;
public class HastSet2 {
        public static void main(String[] args) {
		HashSet hashSet= new HashSet();
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(30);
		//hashSet.add(10); //duplicates are not allowed.
		System.out.println(hashSet);//1st way 
		
		for(Object j:hashSet ) {  // 2nd Way
			System.out.println(j);
		}
		
		}}
