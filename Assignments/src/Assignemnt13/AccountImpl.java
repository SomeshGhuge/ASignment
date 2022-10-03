package Assignemnt13;

import java.util.Scanner;
public class AccountImpl implements A{
	
	public void getUserDetails(String name,float balance) {
		System.out.println("Your name is "+name);
		System.out.println("Your account balance is "+balance);
	}
	public void getSavingAccount(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scanner.next(); 
		System.out.println("Enter your balance");
		float balance=scanner.nextFloat(); 
		getUserDetails(name,balance);
		}
	public static void main(String[]args) {
		AccountImpl a= new AccountImpl();
		a.getSavingAccount();
		
	}

}
