package Assignemnt08;

//1.Design the Employee class which contain firstName,lastName,city & mobileNumber & country.
//Note- 
//1. Input should be from user not hard code value.
//2. Mention comments into program.
import java.util.Scanner;

public class Assignment8_1 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter your Employee  First Name");
		String a = scanner.next(); 
		System.out.println("Enter your Employee Last Name");
		String b= scanner.next();
		System.out.println("Enter your Employee City");
		String c= scanner.next();
		System.out.println("Enter your Employee Mobile Number");
		String d= scanner.next();
		System.out.println("Enter your Employee Country");
		String e= scanner.next();
		
		
	String f=(a+b+"\n"+c+"\n"+d+"\n"+e);
		System.out.println("Your empolyee details are--->"+f);
		
	}

}