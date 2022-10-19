package Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class HashMap4_foreach_action {
   public static void main(String[] args) {

		Map<String,String> map = new HashMap<String,String>();
	     
        // enter name/url pair
        map.put("ram", "patil");
        map.put("shyam", "deshmukh");
        
        // forEach(action) method to iterate map
    map.forEach((k,v) -> System.out.println("Key = " + k + ", Value = " + v));
}}
