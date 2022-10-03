package Exception_Handling_2;
import java.util.*;
public class Maintest {

	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		Account account = new Account();
    	System.out.println("Current balance "+account.balance);
		System.out.println("Enter withdrawal amount");
		int a = scanner.nextInt();
		account.withdraw(a);
		System.out.println("Current balance is "+account.balance);
	}
}
