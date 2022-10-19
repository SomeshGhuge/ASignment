package Map;

import java.util.*;
public class LinkedHashMap2_Override {
  public static void main(String[] args) {

LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(10, "Ram"); 
		map.put(10, "yogesh"); //override 

		Set<Integer> s = map.keySet();
		Iterator<Integer> itr = s.iterator();
		while (itr.hasNext()) {
            int i = itr.next();
			System.out.println("key=" + i);
			System.out.println("value=" + map.get(i));
		}}}
