package Assignemnt20;

//4. Suppose I have arraylist which contain elements as
//   [mumbai, pune, Bangalore, Hyderabad, mumbai], now I want to remove
//   the mumbai from list and print that data.
import java.util.*;
public class Problem4 {
	public static void main(String[]args) {
	
		ArrayList<String> al =new ArrayList<String>();
		al.add("Mumbai");
		al.add("Pune");
		al.add("Banglore");
		al.add("Hydrabad");
		al.add("Mumbai");
		
		// now we want to remove mumbai
		
		for( int a=0; a<=al.size();a++) {// size is used to get that value and length
			
			al.remove("Mumbai");
		}
		System.out.println("New ArrayList ---------> "+al );
		
//		for(String i:al) {
//			System.out.println(i);
//		}
	}
}
