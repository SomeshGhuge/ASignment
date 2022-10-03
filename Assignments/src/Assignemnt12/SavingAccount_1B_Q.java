package Assignemnt12;


//you have to import this info in  next class
//
//SavingAccount
//String : accountType
//long: balance
//void :getSavingAccountDetails()
//void: getSavingAccountInformation()

import java.util.Scanner;
public class SavingAccount_1B_Q extends Account_1A_Q {
	String accountType;
	long balance;
	void getSavingAccountDetails() {
		this.getAccountDetails();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your account type");
		accountType=scanner.next();
		System.out.println("Enter your balance");
		balance=scanner.nextLong();
		this.getAccountInformation(accountnumber, accountname);
		getSavingAccountInformation( accountType, balance);
	}
	void getSavingAccountInformation(String accountType,long balance) {
		//Scanner scanner = new Scanner(System.in);
		System.out.println("Your account type is "+accountType);
		System.out.println("Your balance is "+balance);
	}
	
	public static void main(String[]args) {
		SavingAccount_1B_Q s= new SavingAccount_1B_Q();
		s.getSavingAccountDetails();
		
	}
	

}
