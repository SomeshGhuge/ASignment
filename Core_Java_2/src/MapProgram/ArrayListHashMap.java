package MapProgram;

import java.util.*;
public class ArrayListHashMap {
	
   public static void main(String[] args) {
	   
ArrayList<String> maharashtra = new ArrayList<String>();
		maharashtra.add("pune");
		maharashtra.add("mumbai");
		maharashtra.add("nagpur");
		
ArrayList<String> karnataka = new ArrayList<String>();
		karnataka.add("bangalore");
		karnataka.add("mysore");

ArrayList<String> madhyapradesh = new ArrayList<String>();
		madhyapradesh.add("indore");
		madhyapradesh.add("bhopal");

HashMap<String, ArrayList<String>> hmstate = new HashMap<String, ArrayList<String>>();
		hmstate.put("Mharashtra", maharashtra);
		hmstate.put("Karnataka", karnataka);
		hmstate.put("Madhyaradesh", madhyapradesh);

HashMap<String, HashMap<String, ArrayList<String>>> hmcountry = new HashMap<String, HashMap<String, ArrayList<String>>>();
		hmcountry.put("India", hmstate);

		// iterate and print the data
Set<String> s = hmcountry.keySet();
           for (String str : s) {   //iterate using iterator or list iterator for practice
			System.out.println(str);
			System.out.println(hmcountry.get(str));
		}}}
