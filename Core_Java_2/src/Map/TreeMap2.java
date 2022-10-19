package Map;

import java.util.*;
public class TreeMap2{
   public static void main(String[] args) {
		
		TreeMap<String,String> treeMap= new TreeMap<String,String>(); //sorted elements based on key
		treeMap.put("20","velocity");
		treeMap.put("50","pune");
		treeMap.put("10","software");
		//System.out.println(treeMap);
		
		Set<String> s=treeMap.keySet();
		for(String i: s) {
			System.out.println("key="+i);
			System.out.println("value="+treeMap.get(i));
		}}}

