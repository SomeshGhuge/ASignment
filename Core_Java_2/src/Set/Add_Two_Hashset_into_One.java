package Set;

import java.util.HashSet;
import java.util.Iterator;
public class Add_Two_Hashset_into_One {
   public static void main(String[] args) {
		HashSet hashSet= new HashSet();
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(30);
		hashSet.add("velocity");
		hashSet.add("pune");
		//System.out.println(hashSet.remove("velocity"));
		//System.out.println(hashSet);
		//System.out.println(hashSet.size());
		//System.out.println(hashSet.contains("pune"));
		
		HashSet hashSet1= new HashSet();
		hashSet1.add(40);
		hashSet1.add(50);
		hashSet1.add(60);
		
		hashSet.addAll(hashSet1);
		System.out.println(hashSet);
	}}
