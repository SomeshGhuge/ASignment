package Assignemnt12;

public class HDFC_Bank_2D_Q extends Bank_2A_Q {
	
	double getCalculateInterest(double principleAmount,int tenure,float rateofInterest) {
		double simpleintrest=((principleAmount*tenure*rateofInterest)/100);
		return simpleintrest;
		}
	
	void getHDFCBankDetails() {
		super.getbankinfo();
		super.userbankdetails();
		System.out.println("You got simple intrest is "+getCalculateInterest(principleAmount, tenure, rateofInterest));
		
	}

}