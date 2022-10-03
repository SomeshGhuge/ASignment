package Exception_Handling_2;

public class Account {

	protected int balance = 3000;
	
	public int balance() {
		return balance;
	}
	
	public void withdraw (int amount) {
		if(amount>balance) {
			throw new InsufficientFundException("Insufficient Funds in your Account");
		}
		balance= balance-amount;
	}
}
