package Assignemnt12;


import java.util.Scanner;

//LifeInsurance
//Int: premiumAmount
//Void: getLifeInsuranceDetails()
//Void: 
//getLifeInsuranceInformation()


public class Lifeinsurance_3B_Q extends Insurance_3A_Q {

	int premiumAmount;
	String premiumname;
	void getLifeInsuranceDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter youe premium amount");
		premiumAmount= scanner.nextInt();
		System.out.println("Enter youe premium name");
		premiumname= scanner.next();
	//	getLifeInsuranceInformation(premiumAmount,premiumname);
	}
	void getLifeInsuranceInformation(int premiumAmount,String premiumname) {
		System.out.println("Your premium amount is "+premiumAmount);
		System.out.println("Your premium amount is "+premiumname);
	}
	
}
