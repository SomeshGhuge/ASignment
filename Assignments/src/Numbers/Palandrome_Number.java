package Numbers;
import java.util.Scanner;
// palandrome number 
public class Palandrome_Number {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int a= scanner.nextInt();
		int rem,sum,p,num=a;
		
		for(sum=0;num>0;num=num/10) {
			rem=num%10;
			sum=sum*10+rem;
			
		}
		if (sum==a) {
			System.out.println("it is palandrome number");
		}else {
			System.out.println("It is not palandrome number");
		}
	}

}
