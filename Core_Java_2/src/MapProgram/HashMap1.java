package MapProgram;

// Program -1 – How to return map to method

import java.util.HashMap;
import java.util.Map;
public class HashMap1 {
    
public HashMap<Integer,String> Employee(){
   HashMap<Integer, String> hashMap= new HashMap<Integer,String>();
		hashMap.put(10, "rohan");
		hashMap.put(20, "sohan");
		hashMap.put(30, "velocity");
		return hashMap;
	}
	public static void main(String[] args) {
		HashMap1 hashMapDemo5= new HashMap1();
		
		System.out.println("first way="+hashMapDemo5.Employee());//1st Way
		
		HashMap<Integer, String> hashMap=hashMapDemo5.Employee(); //2nd way
		System.out.println("second way="+hashMap);
		
//3rd way
	Map<Integer, String> map= hashMapDemo5.Employee(); 
		System.out.println("third way="+map);
	
	
	}
}
