package MultiThreading2;

public class AccountDetails implements Runnable {

	Account account = new Account();

	@Override
	public void run() {

		for (int x = 0; x < 5; x++) {

			makeWithdrawal(500);

		}

	}

/*
In this example, there are two thread which are executed randomly but I want
 to execute one by one thread at a time then go for synchronization.

Note:----> Just make the makeWithdrawal method as synchronized, so you will
 get the output like as   */
	
	synchronized 	private void makeWithdrawal(int amt) {

		if (account.getBalance() >= amt) {
			System.out.println(Thread.currentThread().getName() + 
					" is going to withdraw=>");
		

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		int bal = account.withdraw(amt);
		System.out.println(Thread.currentThread().getName() + 
				" complete the withdrawal=>" + bal);
		} else{
			System.out.println("Account is overdrawn...");
		}

	}

}
