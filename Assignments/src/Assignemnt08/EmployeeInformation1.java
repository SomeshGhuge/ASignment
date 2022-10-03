package Assignemnt08;

import java.util.Scanner;

public class EmployeeInformation1 {
	
		 String firstName;
		 String lastName;
		 String city;
		 String mobileNumber;
		 
	public static void main(String[]args) {
		EmployeeInformation1 empl = new EmployeeInformation1();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of students");
		int a=scanner.nextInt();
		for(int b=1;b<=a;b++) {
			
			System.out.println("Enter the first name>>");
			empl.firstName = scanner.next();
		    
			System.out.println("Enter the last name>>");
			empl.lastName = scanner.next();
		
			System.out.println("Enter the city>>");
			empl.city = scanner.next();
			
			System.out.println("Enter the Mobile number>>");
			empl.mobileNumber = scanner.next();
			
			
			System.out.println("Student Information:");
			System.out.println("First Name: "+ empl.firstName);
			System.out.println("Last Name: " + empl.lastName);
			System.out.println("City: " + empl.city);
			System.out.println("Mobile number: " + empl.mobileNumber);
		}

	}

}
