package Assignemnt10;

//2. Write a java program to display the Fibonacci series up to given number. 
//(Fibonacci series mean next number is the sum of previous two numbers for example,
//              0,1,1,2,3,5,8,13,21,34,55 etc. If enter no as 5 then output is 0,1,1,2,3).
import java.util.Scanner;
public class Assignment10_2 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number>>");
	int input = scanner.nextInt();
	int value1 = 0;
	int value2 = 1;
	for ( int i=1;i<=input;i++) {
		System.out.print(value1+",");
		int temp=value1;
		value1=value1+value2;
		value2=temp;
	}
	}

	
}


