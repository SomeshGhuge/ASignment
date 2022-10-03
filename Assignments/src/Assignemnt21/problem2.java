package Assignemnt21;
// 2.Suppose I have one container that contain  different colors of ballons such as Red, 
//   Blue, Green, Red,Blue,Red, Blue, Green in this order, now sort that baloon 
//   in such manner so Red baloon will be added first then Blue baloon and last is 
//   Green balloons. Use the proper collection.
import java.util.*;

import javax.print.DocFlavor.STRING;
public class problem2 {
public static void main(String[]args) {
	
	LinkedList<String> ll = new LinkedList<String>();
	ll.add("Red");
	ll.add("Blue");
	ll.add("Green");
	ll.add("Red");
	ll.add("Blue");
	ll.add("Green");
	ll.add("Red");
	ll.add("Blue");
	ll.add("Green");
	System.out.println("At starting container contain--->"+ll);
	
	LinkedList<String> list2=new LinkedList<String>();
	for(String str:ll) {
		if(str.equals("Red")) {
			list2.addFirst("Red");
		}else if(str.equals("Blue")) {
			list2.add("Blue");
		}}
	for (String str:ll) {
		{if(str.equals("Green"))
			list2.add("Green");
		}
	}
	System.out.println("At starting container contain--->"+list2);
	
	
}
}
