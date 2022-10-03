package Assignemnt17;
//1. Write a Java Program for counting the vowels and numbers from file( abc.txt) .
// Input should be from user not hard code value.
// Mention comments into program.
import java.util.Scanner;
import java.io.*;
public class count{
	public static void main(String[]args) {
	 int vowelcount=0;
	 int numbercount=0;
	try {
	FileInputStream fis= new FileInputStream("C:\\Users\\HP\\Desktop\\IT sector   JAVA Course\\Java\\Velocity\\Java Backend Developer\\Practise\\abc.txt");
	Scanner scanner = new Scanner(fis);
	while(scanner.hasNextLine()) {
		String a=scanner.nextLine();
		System.out.println(a);
		for(int i=0; i<a.length(); i++) {
			char ch=a.charAt(i);
			if(ch==65|| ch==69 || ch==73 || ch==79 || ch==85 || ch==97 || ch==101 || ch==111 || ch==117) {
				vowelcount++;
			}
			if(ch>=48 && ch<=57) {
				numbercount++;
	}}}
	System.out.println("Your vowelcount is "+vowelcount);
	System.out.println("Your number count is "+numbercount);
	scanner.close();
   }catch(Exception e) {
	e.printStackTrace();
}}}

