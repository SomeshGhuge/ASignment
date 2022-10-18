package MultiThreading1;

public class By_Implementing_Runnable_Interface implements Runnable{
	

		public static void main(String[] args) {

			By_Implementing_Runnable_Interface thread = new By_Implementing_Runnable_Interface();
			Thread t = new Thread(thread);
			t.start();
		}

		@Override
		public void run() {

			for (int i = 1; i <= 50; i++) {
				System.out.println(i);
			}

		}
	}


