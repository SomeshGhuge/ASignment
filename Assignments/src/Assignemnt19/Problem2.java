package Assignemnt19;

// 2. Design the java method for String getReverseString(String reverse) and
// take the input from user into main method and pass to that method.
// Result will print into main method
// Output:--->
//             Enter string---> pune
//             Output---> enup
import java.util.*;
public class Problem2 {
	public String getReverseString(String reverse) {
		String a=" ";
		
		for(int i=0;i<reverse.length();i++) {
			char ch=reverse.charAt(i);
			a=ch+a;
		}
		return a;
		
	}
	public static void main(String[]args) {
//		String s="Somesh";
//		String asdf="";
//		for(int i=0; i<s.length(); i++) {
//			char ch= s.charAt(i);
//			 asdf=ch+asdf;
//		}
//		System.out.println(asdf);
		Problem2 p=new Problem2();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your string");
		String reverse = scanner.nextLine();
		String str2=p.getReverseString(reverse);
		System.out.println("Your reverse string is \n "+str2);
	}

}
