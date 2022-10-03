package Assignemnt19;

// 1. Design a method for counting the alphabet, vowels and numbers from String. 
// Input should be from user into main method and pass that to methods.
// And result will print into main method 
import java.util.*;
public class Problem1 {
	
	public int getvowelcount(String str) {
		int vowels=0;
		for(int i =0; i<str.length() ; i++) {
			char ch=str.charAt(i);
			if(ch==65|| ch==69 || ch==73 || ch==79 || ch==85 || ch==97 || ch==101 || ch==111 || ch==117) {
				vowels++;
			}
			}
		return vowels;
	}
	public int getnumbers(String str) {
		int numbers=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>=48 && ch<=57) {
				numbers++;
		}
		}
		return numbers;
		
	}
	public int getalphabets(String str) {
		int alphabets=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>=65 && ch<=122) {
				alphabets++;
		}
		}
		return alphabets;
		
	}
	
	public static void main(String[]args) {
		Problem1 p=new Problem1();
		Scanner scanner=new Scanner(System.in);
		System.out.println(" Enter your string contain alphabets vowels numbers");
		String str=scanner.nextLine();
		int vowel=p.getvowelcount(str);
		System.out.println("Your Vowels are "+vowel);
		int alphabets=p.getalphabets(str);
		System.out.println("Your alphabets are "+alphabets);
		int numbers=p.getnumbers(str);
		System.out.println("Your numbers are "+numbers);
		
	
		
	}

}
