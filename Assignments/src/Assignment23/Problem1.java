package Assignment23;

// * Design the below example by using HashMap<String,  ArrayList<String>>

//   Karnataka  ---> Benglore,Mysore;
//   Maharashtra---> Pune,Mumbai;
//   Rajasthan  ---> Jaipur,mewad;
//   India      ---> Karnataka,Maharashtra,Rajasthan

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.ArrayList;

public class Problem1 {
	public static void main(String []args) {
		Problem1 problem = new Problem1();
		
		ArrayList<String> Karnataka = new ArrayList<String>();
		Karnataka.add("Benglore");
		Karnataka.add("Mysore");
		
		ArrayList<String> Maharashtra = new ArrayList<String>();
		Maharashtra.add("Pune");
		Maharashtra.add("Mumbai");
		
		ArrayList<String> Rajasthan = new ArrayList<String>();
		Rajasthan.add("Jaipur");
		Rajasthan.add("Mewad");
		
		HashMap<String,ArrayList<String>> hashmap = new HashMap<String,ArrayList<String>>();
		hashmap.put("Rajasthan", Rajasthan);
		hashmap.put("Maharashtra", Maharashtra);
		hashmap.put("Karnataka", Karnataka);
		
		
		HashMap<String,HashMap<String,ArrayList<String>>> hash=new HashMap<String,HashMap<String,ArrayList<String>>>();
		hash.put("India", hashmap);
		
		
		// iterate the data
		Set<String>s=hash.keySet();// get keys
		
		Iterator<String>itr=s.iterator();
		while(itr.hasNext()) {
		String i=itr.next();
		System.out.println("Key----> "+i);
		System.out.println("Value---> = "+hash.get(i));
		}
		for(String i:s) {
			System.out.println("Key--> "+i);
			System.out.println(hash.get(i));
		}
		
		
		
	}

}
