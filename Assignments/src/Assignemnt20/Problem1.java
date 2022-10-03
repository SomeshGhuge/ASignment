package Assignemnt20;

//1. Write program to add the five students mobile number into arraylist and 
//iterate that elements using iterator. 
//VIMP - Do not use Google it will reduce your chances of gettin
import java.util.ArrayList;
import java.util.Scanner;
public class Problem1 {
	public static void main(String[]args) {
		ArrayList <Long> al = new ArrayList <Long>();
	for(int i=1; i<=5; i++) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your mobile number");
		Long a= scanner.nextLong();
          al.add(a);
	}
	for(long c:al) {
		System.out.println("Your mobile number is "+c);
	}
	}

}
