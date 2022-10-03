package Assignment22;
//1. Suppose I have Map<String,Integer> contain key as Ram, Sohan,
//   Ashok, Ajay, Prasanna and value is 3,2,1,6,5 now 
//   I want to sort the value from map and print it.
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class Problem1 {

	public static void main(String[]args) {
		Map<String,Integer> map = new LinkedHashMap<String,Integer>();
		map.put("Ram",3);
		map.put("Sohan",2);
		map.put("Ashok",1);
		map.put("Ajay",6);
		map.put("Prasanna",5);
		
		System.out.println("Before sorting---->"+map);
		
// Taking the map value in the set by using entrySet()
		Set<Entry<String,Integer>> entry=map.entrySet();
	
// Converted set into linked list for sorting operation performed
		List<Entry<String,Integer>> list= new LinkedList<Entry<String,Integer>>(entry);
		
// Performing the bubble sorting algorithm on values
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
			if (list.get(i).getValue() > list.get(j).getValue()) {
			Entry<String, Integer> temp = list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);
		}}}
		
// Storing the sorted entry into the map
	
		Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
		for (Entry<String, Integer> v : list) {
		sortedMap.put(v.getKey(), v.getValue());
		}
		System.out.println("After sorting---->"+sortedMap);

	}}

