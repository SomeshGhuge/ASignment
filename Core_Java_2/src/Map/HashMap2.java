package Map;
import java.util.*;
public class HashMap2 {
  public static void main(String[] args) {
   HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(10, "Ram");
		map.put(20, "yogesh");
		map.put(30, "sohan");

		Set<Integer> s = map.keySet(); // s contain all the keys only.
		for (int i : s) {
			System.out.print("Key==" + i+" value=" + map.get(i));
			
// * get method used to get the respective value of key.
			 
		}}}
