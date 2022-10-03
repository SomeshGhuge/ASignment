package Assignemnt10;
//Program-
//Write java program to check whether number is prime or not(Prime 
//number
//means which is divisible by two numbers only i.e. 1 and itself 
//only.
//if any number is divisible by any other number except mentioned 
//then
//its not prime number.
import java.util.Scanner;
public class Assignment10_1 {
public static void main(String[]args) {
		
	System.out.println("Enter the number");
	Scanner scanner = new Scanner(System.in);
	int a= scanner.nextInt();
	int count=0;
	for (int no=a; no>0;no--) {
		if(a%no==0) {
		count++;
		}
	}
	if(count>2) {
		System.out.println("The number is not prime");
	}else {
		System.out.println("The number is  prime");
	}
	
	
	
}
}
	

