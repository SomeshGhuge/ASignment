package JDBC2;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Userinput {
	static String A, B, C , D, E;
	Connection connection=null;
	PreparedStatement pre=null;
	
	public void insertuserinput(String Firstname,String Lastname,String Job,String Salary,String Location )  {
	try {
		multiple mul = new multiple();
	    connection = mul.getconnections();
	    pre=connection.prepareStatement("insert into user2 (Firstname,Lastname,Job,Salary,Location)values(?,?,?,?,?)");
	   
	    Scanner scanner=new Scanner(System.in);
	    pre.setString(1, Firstname);
	    pre.setString(2, Lastname);
	    pre.setString(3, Job);
	    pre.setString(4, Salary);
	    pre.setString(5, Location);
	    
	    int i = pre.executeUpdate();
	    System.out.println("<-------Record Successfully inserted--------> ");
	    System.out.println("Pree Y or y  if want to insert again new data ");
		char ch = scanner.next().charAt(0);
		if(ch=='Y' || ch=='y') {
			Userinput userinput = new Userinput();
			userinput.Userinput();
			userinput.insertuserinput(A, B, C, D, E);
		}else {
			System.out.println("<-------Leave Now--------> ");
		}
	}catch(Exception e) {
		System.out.println(e);
		e.printStackTrace();
	}
	}
	public static void main(String[]args) {
		
	Userinput userinput = new Userinput();
	userinput.Userinput();
	userinput.insertuserinput(A, B, C, D, E);
		}
	protected void Userinput() {
		Scanner scanner = new Scanner(System.in);
		 
		   System.out.println("<---------Insert data--------->");
		   System.out.println("Enter your Firstname");
		   A=scanner.next();
		   System.out.println("Enter your Lastname");
		   B=scanner.next();
		   System.out.println("Enter your Job");
		   C=scanner.next();
		   System.out.println("Enter your Salary");
		   D=scanner.next();
		   System.out.println("Enter your Location");
		   E=scanner.next();
		}
}
