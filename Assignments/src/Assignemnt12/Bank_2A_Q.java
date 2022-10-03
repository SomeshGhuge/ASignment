package Assignemnt12;

//Bank----> This is Parentclass
//double : principleAmount 
//int: tenure
//float: rateOfInterest
import java.util.Scanner;
public class Bank_2A_Q {
	double principleAmount;
	int tenure;
	float rateofInterest;
	void getbankinfo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter principle amount");
		principleAmount=scanner.nextDouble();
		System.out.println("Enter tenure");
		tenure=scanner.nextInt();
		System.out.println("Enter rate of interest");
		rateofInterest=scanner.nextFloat();
		}
	void userbankdetails() {
		System.out.println("Your principle amount is "+principleAmount);
		System.out.println("Your tenure is "+tenure);
		System.out.println("Your rate of intrest is "+rateofInterest);
	}

}
