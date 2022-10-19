package Set;

import java.util.HashSet;
public class Hashset1 {
  public static void main(String[] args) {
        HashSet hashSet = new HashSet();
		hashSet.add("ram");
		hashSet.add("shyam");
		hashSet.add(null);
		hashSet.add(10);
		hashSet.add("ram"); // return false
		System.out.println(hashSet);
	}}   

