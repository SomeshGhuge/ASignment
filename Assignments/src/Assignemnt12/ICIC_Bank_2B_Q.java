package Assignemnt12;
//ICICIBank
//double: 
//getCalculateInterest(double 
//principleAmount, int tenure, 
//float rateOfInterest)
//void: getICICIBankDetails()



public class ICIC_Bank_2B_Q extends Bank_2A_Q {
	
	double getCalculateInterest(double principleAmount,int tenure,float rateofInterest) {
		double simpleintrest=((principleAmount*tenure*rateofInterest)/100);
		return simpleintrest;
		}
	void getICICBankDetails() {
		super.getbankinfo();
		super.userbankdetails();
		double a= getCalculateInterest(principleAmount, tenure, rateofInterest);
		System.out.println("You got simple intrest is "+a);
		
	}
	
	
}

