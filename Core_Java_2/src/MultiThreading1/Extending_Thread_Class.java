package MultiThreading1;

public class Extending_Thread_Class extends Thread {


		public void run() {

			for (int i = 1; i <= 10; i++) {
				System.out.println(i);
			}
		}

		public static void main(String[] args) {

			Extending_Thread_Class thread = new Extending_Thread_Class();
			thread.start();
		}
	}


