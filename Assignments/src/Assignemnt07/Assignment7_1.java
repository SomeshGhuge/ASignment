package Assignemnt07;

//1. Design method to check whether the character is alphabet, digit and special symbol.
import java.util.Scanner;
public class Assignment7_1 {
	public static void main(String[]args) {
		System.out.println("Enter your value");
		Scanner scanner = new Scanner(System.in);
		char number= scanner.next().charAt(0);//charAt(0) is for access the char value 
		
	char ch=number;
	if(ch>=0 && ch<=32 ) {
		System.out.println("Your charactor"+ch+" is a KEYWORD ");
	}else if(ch>32 && ch<=47) {
		System.out.println("Your charactor"+ch+"is a SYMBOL");
	}else if(ch>47 && ch<=57) {
		System.out.println("Your charactor"+ch+"is a NUMBER");
	}else if(ch>57 && ch<=64) {
		System.out.println("Your charactor"+ch+"is a relational operator");
	}else if(ch>64 && ch<=90) {
		System.out.println("Your charactor"+ch+"is a Capital Alpabates");
	}else if (ch>90 && ch<=96) {
		System.out.println("Your charactor"+ch+" value is a  special type symbol");
	}else if ( ch>96 && ch<=122) {
		System.out.println("Your charactor"+ch+" value is a  small alphabates");
	}else if(ch>122 && ch<=127) {
		System.out.println("Your charactor"+ch+" value is a symbole");
	}else {
		System.out.println("Your entered value is not valide");
	}

}
}
