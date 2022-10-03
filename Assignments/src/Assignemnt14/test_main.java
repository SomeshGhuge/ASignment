package Assignemnt14;
//1.Write a java program to print the all multiplication table from * 2, 3, 4.... to 20.
//1. Input should be from user not hard code value.
//2. Mention comments into progra
import java.util.Scanner;
public class test_main extends Table1 {
	public static void main(String [] args) {
		test_main table=new test_main();
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter your number");
		int s= scanner.nextInt();
		
		table.table(s);

}
}
