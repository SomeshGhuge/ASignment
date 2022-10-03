package Assignemnt20;
//2. Design the generics arraylist for string and add five cities into it 
//   and iterate that using for each loop.
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
public class Pronlem2 {
public static void main(String []args){
	ArrayList<String>al=new ArrayList<String>();
	String b;
	for(int a=1;a<=5;a++) {
		System.out.println("Enter your city name");
		Scanner scanner = new Scanner(System.in);
	     b=scanner.next();
	     al.add(b);
	}
	Iterator<String>itr=al.iterator();
	while(itr.hasNext()) {
		System.out.println("Your city name is "+itr.next());
	}
	
	//Another way
	
//	for(String c:al) {
//		System.out.println(c);
//	}
	
}
}
