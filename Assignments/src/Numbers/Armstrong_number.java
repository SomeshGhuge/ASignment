package Numbers;
//153=1^3+5^3+3^3=153
import java.util.Scanner;
public class Armstrong_number{
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter  your number");
		int a = scanner.nextInt();
		int rem,sum,num=a;
		for(sum=0;num>0;num=num/10) {
			rem=num%10;
			sum=sum+rem*rem*rem;
		}
		if(sum==a) {
			System.out.println("your number "+a+" is a armstrong number");
		}else {
			System.out.println("Your number "+a+" is not a armstrong number");
		}
	}
}