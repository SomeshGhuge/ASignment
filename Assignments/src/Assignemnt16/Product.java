package Assignemnt16;

//1. Design the Product class in which design void productCheck(int weight) in chec
//whether weight is less than 100, then throw the ProductException  with meaningful message. 
import java.util.Scanner;
public class Product   {
	
	void productCheck( int weight) {
		int a=weight;
		if(a<100) {
			try {
				throw new Product_Exception("This is the product exception");
				
			}catch(Exception e ) {
				e.printStackTrace();
			}
		}else {
			System.out.println("Your weight is "+a+" is more than 100 kg");
		}
	}
	
	public static void main(String[]args) {
		Product product = new Product();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the weight");
		int weight=scanner.nextInt();
		product.productCheck(weight);
		
	}
}
