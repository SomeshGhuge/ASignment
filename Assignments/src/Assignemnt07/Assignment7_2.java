package Assignemnt07;
//2. Design method public int getNumberCube(int num), return int value to
	//	that method and result should be into main method.
import java.util.Scanner;//we get the pakage to access the user input
public class Assignment7_2 {//we creat the class 
	public int getNumberCube(int num) {//we creat the method 
		int c= num*num*num;//we put the condition which was given by the user
		return c;//the value which is output from this method
	}
	public static void main(String[]args) {//this is the main method
		System.out.println("Please Enter your numer  ");//this is for get input from user
		Scanner scanner = new Scanner(System.in);//to get input
		int b= scanner.nextInt();//store the input
		
		Assignment7_2 asdf= new Assignment7_2();//call the method by using object 
		int c= asdf.getNumberCube(b);//store the value in this variable
		System.out.println("Your number"+b+" cube is "+c);//printing statment\
		
		
	}

}
