package Numbers;
// prime number are 1,3,5,7,8...
import java.util.Scanner;

public class Prime_number {
	public static void main(String[]args) {
		Prime_number pm=new Prime_number();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your number");
		int a= scanner.nextInt();
		int count=0;
		for(int i=1; i<=a;i++) {
			if(a%i==0) {
				count++;
			}
		}
		if(count<=2) {
			System.out.println("Your number "+a+" is a prime number");
		}else {
			System.out.println("Your number "+a+" is a not prime number");
		}
	}

}
