package MapProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
public class ArrayListHashMap_Combo {
     public static void main(String[] args) {
ArrayList<String> computeraccessories = new ArrayList<String>();
		computeraccessories.add("watch");
		computeraccessories.add("speaker");
		computeraccessories.add("laptop");

		ArrayList<String> electronics = new ArrayList<String>();
		electronics.add("printer");
		electronics.add("mouse");
		electronics.add("keyboards");

		ArrayList<String> furniture = new ArrayList<String>();
		furniture.add("bed");
		furniture.add("sofa");
		furniture.add("chair");

HashMap<String, ArrayList<String>> categories = new HashMap<String, ArrayList<String>>();
		categories.put("Computer", computeraccessories);
		categories.put("Electronics", electronics);
		categories.put("Furniture", furniture);


HashMap<String, HashMap<String, ArrayList<String>>> eShop = new HashMap<String, HashMap<String, ArrayList<String>>>();

		eShop.put("E Shop", categories);
// iterate and print the data
           Set<String> s = eShop.keySet();

		for (String str : s) { // iterate using iterator or list iterator for practice
			System.out.println(str);
			System.out.println(eShop.get(str)); }}}
