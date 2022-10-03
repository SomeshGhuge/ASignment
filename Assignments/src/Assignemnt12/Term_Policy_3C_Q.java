package Assignemnt12;

//TermPolicy
//Int: duration
//Void: getTermPolicyDetails()
//Void: 
//getTermPolicyInformation()
import java.util.Scanner;
public class Term_Policy_3C_Q extends Lifeinsurance_3B_Q{
	int duration;
	
	 void getTermPolicyDetails() {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter your termpolicy duration");
		 duration=scanner.nextInt();
		 super.getInsuranceInformation(id, PersonName, InsuranceCompany);
		 super.getLifeInsuranceInformation(premiumAmount, premiumname);
		 getTermPolicyInformation(duration);
	 }
	 void getTermPolicyInformation(int duration) {
		 System.out.println("Your termpolicy duration is "+duration);
	 }
	 
	 public static void main(String[]args) {
		 Term_Policy_3C_Q a= new Term_Policy_3C_Q();
   	 a.getInsuranceDetails();
		 a.getLifeInsuranceDetails();
		 a.getTermPolicyDetails();
		 
	   // a.getInsuranceInformation(0, "PersonName", "InsuranceCompany");
	 }


}