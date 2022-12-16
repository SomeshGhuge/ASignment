package String;

import java.util.Scanner;

public class total_space_in_string  {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your string-->");
		String str=scanner.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch==' ') {
				count++;
			}
		}
		System.out.println("Total spaces in stentence is -->"+count);
	}

}

