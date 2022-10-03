package Assignemnt12;

//Insurance
//Int: id
//String: personName
//String: insuranceCompany
//Void: getInsuranceDetails()
//Void: 
//getInsuranceInformation()
import java.util.Scanner;
public class Insurance_3A_Q {
	int id;
	String PersonName;
	String InsuranceCompany;
	
	void getInsuranceDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Person  Name");
		PersonName=scanner.next();
		System.out.println("Enter InsuranceCompany");
		InsuranceCompany=scanner.next();
		System.out.println("Enter your ID");
		id= scanner.nextInt();
	   // getInsuranceInformation( id,PersonName,InsuranceCompany);
		
	}
	void getInsuranceInformation(int id,String PersonName,String InsuranceCompany) {
		System.out.println("Your name is "+PersonName);
		System.out.println("Your name is "+InsuranceCompany);
      System.out.println("Your name is "+id);
		
		
	}

}

