package MultiThreading1;

public class MultiThreading extends Thread {

	public void run() {

  for (int i = 1; i <= 5; i++) {
	try {
    	Thread.sleep(500);// it will pause the thread execution for perticular milliseconds
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		MultiThreading thread1 = new MultiThreading();
		MultiThreading thread2 = new MultiThreading();
		thread1.start();
		thread2.start();

	}

	

}
