package String;

import java.util.Scanner;

public class Sample2 {
	

		private static String getStudentName(String name) {
			return name;
		}
		public static void main(String[] args) {

			System.out.println("Enter your name>>");
			Scanner scanner= new Scanner(System.in);
			String name=scanner.next();
			String s= getStudentName(name);
			System.out.println(s);
		}
	

}
