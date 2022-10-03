package Assignemnt15;
//Design another class called as SavingAccount extends Account that contain withdrawAmount. 
//Design class AccountDetails class in which below methods. 
//Public void getAccountDetails () 
//public static int getWithdrawDetails(Account account) 
import java.util.Scanner;
public class Saving_Account extends Account {
	private  int withdrawAmount;

	public int getWithdrawAmount() {
		return withdrawAmount;
	}

	public void setWithdrawAmount(int withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}
	
	public void getAccountDetails() {
		Account account= new Account();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your id");
		int a=scanner.nextInt();
		System.out.println("Enter your account number");
		int b = scanner.nextInt();
		System.out.println("Enter balance");
		int c= scanner.nextInt();
		 
	account.setAccountNumber(b);
	account.setBalance(c);
	account.setId(a);
		getwithdrawDetails(account);
		
		
	}
	public static int getwithdrawDetails(Account account) {
		Saving_Account withdraw=new Saving_Account();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter withdrawable amount");
		int s=scanner.nextInt();
		withdraw.setWithdrawAmount(s);
		int rem=0;
		rem=account.getBalance()-s;
				if(account.getBalance()>s) {
					System.out.println("Your account balance is "+rem);
				}
				if(account.getBalance()<s) {
				System.out.println("Insufficient balance"); 
			}
				
	
			return rem;
		
		
	}
	public static void main(String[]args) {
		Saving_Account save=new Saving_Account();
		save.getAccountDetails();
	}

}
