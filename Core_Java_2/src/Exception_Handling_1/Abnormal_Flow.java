package Exception_Handling_1;

public class Abnormal_Flow {
	public static void main(String[] args) {
		System.out.println("First line");
		System.out.println("Second line");
		
		// upto here above two lines are executed properly
		int a = 10/0;// Here we get error which is runtime error 
		// which stops the execution flow of program 
		
		System.out.println("Third line");
		System.out.println(a);
		
		// Thats why we need to solve exception by using try catch block
		// and remaining program will executed smoothly
	}

}
