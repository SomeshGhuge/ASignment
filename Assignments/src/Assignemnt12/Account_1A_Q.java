package Assignemnt12;

//Account
//int : accountNumber
//String: accountName
//void :getAccountDetails()
//void: getAccountInformation()
//
//you have to import this info in  next class
//
//SavingAccount
//String : accountType
//long: balance
//void :getSavingAccountDetails()
//void: getSavingAccountInformation()

import java.util.Scanner;
public class Account_1A_Q {
String accountnumber;
String accountname;

void getAccountDetails() {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter your account number");
	accountnumber=scanner.next();
	System.out.println("Enter your accountname without Space FirstnameLastname");
	accountname=scanner.next();
	//getAccountInformation(accountnumber,accountname);
	}
void getAccountInformation(String accountnumber,String accountname) {
	System.out.println("Your account number is "+accountnumber);
	System.out.println("Your account name is "+accountname);
}
}