package Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class HashMap3_Using_iterator {
public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();
		map.put("ram", "patil");
		map.put("ajay", "deshmukh");
		
// using iterators
		Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();
            while (itr.hasNext()) {
			Map.Entry<String, String> entry = itr.next();
	System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
            
            }
            
     }
}
