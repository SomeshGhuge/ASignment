package Numbers;

import java.util.Scanner;

// 1-->1
//2-->2
//3-->6
//4--->24.....
public class Factorial_number {
	public int factor(int num) {
		int factorial=1;
		for(int i=1;i<=num;i++) {
			factorial=i*factorial;
		}
		return factorial;
	}
	public static void main(String []args) {
		Factorial_number fact= new Factorial_number();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter value");
		int b=scanner.nextInt();
		int a=fact.factor(b);
		
		System.out.println(a);
		
	}

}
