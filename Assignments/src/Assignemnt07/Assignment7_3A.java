package Assignemnt07;
//3. Design method to print factorial of given number
//Enter no = 6 then factors should be displayed like 1,2,3,6...)
import java.util.Scanner;
public class Assignment7_3A {
	public int factorial(int num) {
		int fact=1;
		for(int a=1;a<=num;a++) {
			fact=fact*a;
			
		}
		return fact;// we creat method to get only final ans in output ...
		            ///  not required how that final ans is come
		
	}
	public static void main(String[]args) {
		System.out.println("Enter your value  ");
		Scanner scanner=new Scanner(System.in);
		int c=scanner.nextInt();
		
		Assignment7_3A asdf=new Assignment7_3A();
		int d=asdf.factorial(c);
		System.out.println("Your number is "+c+"-->& Your factorial value is "+d);
		
		
	}}
