package List_Within_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class E_Shop {
	public static void main(String[]args) {
		ArrayList<String> Electronics=new ArrayList<String>();
		Electronics.add("TV");
		Electronics.add("Fridge");
		Electronics.add("Washing Machine");
		
		ArrayList<String> Electric= new ArrayList<String>();
		Electric.add("Oven");
		Electric.add("Bulb");
		Electric.add("Fan");
		
		ArrayList<String> Mobile=new ArrayList<String>();
		Mobile.add("Charger");
		Mobile.add("Headphone");
		Mobile.add("Buds");
		
		Map<String,ArrayList<String>> Categories=new HashMap<String,ArrayList<String>>();
		Categories.put("Electronics", Electronics);
		Categories.put("Mobile", Mobile);
		Categories.put("Electric", Electric);
		
		Map<String,Map<String,ArrayList<String>>> eshop=new HashMap<String,Map<String,ArrayList<String>>>();
		eshop.put("Eshop", Categories);
		
		Set<String>s=eshop.keySet();
		for(String e:s) {
			System.out.println(e);
			System.out.println(eshop.get(e));
		}
	}

}
