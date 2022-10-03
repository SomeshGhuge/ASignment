package Assignemnt12;

import java.util.Scanner;


public class Simple_Intrest_2ANS {
	
	public static void main(String[]args) {
		
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter bank name (SBI/ICIC/HDFC) to"
				+ " \nget info about simple interest---->"
				+ "\nFor SBI Press 1"
				+ "\nFor HDFC press 2"
				+ "\nFor ICIC press 3");
		int ANS=scanner.nextInt();
		if(ANS==1) {
			SBI_Bank_2C_Q a=new SBI_Bank_2C_Q();
			a.getSBIBankDetails();
			
		}else if(ANS==2) {
			HDFC_Bank_2D_Q c=new HDFC_Bank_2D_Q();
			c.getHDFCBankDetails();
			
		}else if(ANS==3) {
			ICIC_Bank_2B_Q b=new ICIC_Bank_2B_Q();
			b.getICICBankDetails();
			
		}else {
			System.out.println("Invalid Input");
		}
		
	}

}
