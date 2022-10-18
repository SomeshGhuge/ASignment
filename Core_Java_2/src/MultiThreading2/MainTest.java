package MultiThreading2;

public class MainTest {

	public static void main(String[] args) {
		
		AccountDetails accountDetails= new AccountDetails();
		Thread thread1=new Thread(accountDetails);
		Thread thread2= new Thread(accountDetails);
		thread1.setName("Jeevan");
		thread2.setName("soham");
		thread1.start();
		thread2.start();
	}
}
/*
In this example, there are two thread which are executed randomly but I want
 to execute one by one thread at a time then go for synchronization.

Note:----> Just make the makeWithdrawal method as synchronized, so you will
 get the output like as   */
