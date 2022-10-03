package Assignemnt08;

//3. Pass the input to getStudentInformation() method.
//Note- 
//1. Input should be from user not hard code value.
//2. Mention comments into program.
import java.util.Scanner;
public class Assignment8_3 {
	public void getStudentInfo(String name,String city,String Class,String no) {
		
		System.out.println("Your student name is  "+name+".He is from  "+city+".His class is  "+Class+".His no is "+no);
		
	}
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		Assignment8_3 zxcv= new Assignment8_3();
		System.out.println("Enter Student name");
		String name=scanner.next();
		System.out.println("Enter Student city");
		String city=scanner.next();

		System.out.println("Enter Student Class");
		String Class=scanner.next();

		System.out.println("Enter Student Number");
		String No=scanner.next();
		
		zxcv.getStudentInfo(name, city, Class, No);
		

		
		
		
	}

}
