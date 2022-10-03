package Exception_Handling_2;

public class Test1 {

	public static void main(String[]args) {
		Test1 test = new Test1();
		
		try {
			throw new Test("Invalid input");
			
		}catch(Exception e) {
			e.getMessage();
		}
	}
}
