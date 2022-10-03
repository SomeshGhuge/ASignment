package Exception_Handling_1;

public class Abnormal_Handle_By_TRY_CATCH_BLOCK {
	public static void main(String[] args) {
		System.out.println("1 line");
		System.out.println("2 line");
		
		try{
			int a= 10/0;
		}catch(Exception e) {
			System.out.println(e);
			e.getStackTrace();
		}
				
				System.out.println("3 line");
				System.out.println("4 line");	
				System.out.println("5 line");
				
				// Thats why we need to solve exception by using try catch block
				// and remaining program will executed smoothly
	}


}
