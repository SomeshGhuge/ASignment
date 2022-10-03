package Assignemnt07;
//3. Design method to print factors of given number
//Enter no  then factors should be displayed like 1,2,3,6...)

import java.util.Scanner;
public class Assignment7_3B {
	public int factors(int number) {
	
		for (int a =1;a<=number;a++) {
			if(number%a==0) {
				System.out.println("You enterred"+" "+number+"  Factors are-->"+a);
			}
			}return number; 
	}
	public static void main(String[]args) {
		System.out.println("Enter your value which you want factors");
			Scanner scanner=new Scanner(System.in);
			int p=scanner.nextInt();
			Assignment7_3B asdf=new Assignment7_3B();
			int q = asdf.factors(p);
			System.out.println();
	}
}
