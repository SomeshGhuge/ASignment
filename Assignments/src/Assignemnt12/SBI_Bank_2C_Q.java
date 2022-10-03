package Assignemnt12;



//SBIBank
//double: 
//getCalculateInterest(double 
//principleAmount, int tenure, 
//float rateOfInterest)


public class SBI_Bank_2C_Q  extends Bank_2A_Q{
	
	double getCalculateInterest(double principleAmount,int tenure,float rateofInterest) {
		double simpleintrest=((principleAmount*tenure*rateofInterest)/100);
		return simpleintrest;
		}
	
	void getSBIBankDetails() {
		super.getbankinfo();
		super.userbankdetails();
		System.out.println("You got simple intrest is "+getCalculateInterest(principleAmount, tenure, rateofInterest));
		
	}
	

}
