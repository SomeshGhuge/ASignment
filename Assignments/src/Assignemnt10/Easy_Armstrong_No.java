package Assignemnt10;

//3. Write java program to check whether number is Armstrong or not
//(A positive number is called armstrong number 
//  if it is equal to the sum of cubes of its digits for example
//    0, 1, 153, 370, 371, 407 etc. Let's try to understand why 153 is an Armstrong number.
//                          153 = (1*1*1)+(5*5*5)+(3*3*3)  
//                         where:  
//                          (1*1*1)=1  
//                          (5*5*5)=125  
//                          (3*3*3)=27  
//                         So:  
import java.util.Scanner;
public class Easy_Armstrong_No {
	public static void main(String[]args) {
		Scanner scanner =new Scanner(System.in);
		int t,sum,rem;
		System.out.println("Enter the number");
		int num=scanner.nextInt();
		t= num;
		for(sum=0;num>0;num=num/10) {
			rem = num%10;
			sum=sum+rem*rem*rem;
		}
		if(sum==t) {
			System.out.println("it is a armstrong number");
		}else {
			System.out.println("It is not armstrong number");
		}
				
	}

}
