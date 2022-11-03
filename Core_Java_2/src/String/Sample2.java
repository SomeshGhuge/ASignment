package String;

import java.util.Scanner;

public class Sample2 {
	

		private static String getStudentName(String name) {
			return name;
		}
		public static void main(String[] args) {
			Sample2 sa = new Sample2();
			System.out.println("Enter your name>>");
			Scanner scanner= new Scanner(System.in);
			String name=scanner.next();
			String s= sa.getStudentName(name);
			System.out.println(s);
		}
	

}
