package JDBC1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;




public class Insert_using_prepared_statement {
	public static void main(String[]args) {
		Connection con = null;
		PreparedStatement stm=null;
		char ch;
		try {
			do {
	         Class.forName("com.mysql.jdbc.Driver");// used for load the drive
			Scanner scanner=new Scanner(System.in);
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","root");// here data is schema
		    stm= con.prepareStatement("insert into data(works,money, days,id)values (?,?,?,?)");// data is table
		    System.out.println("Enter Work");
		    String a=scanner.next();
		    System.out.println("Enter money");
		    String b=scanner.next();
		    System.out.println("Enter days");
		    String c=scanner.next();
		    System.out.println("Enter id");
		    String d=scanner.next();
		  
			stm.setString(1, a);
			stm.setString(2, b);
			stm.setString(3, c);
			stm.setString(4, d);
		    int i= stm.executeUpdate();// update this info 
			System.out.println("Record inserted "+i);
			con.close();
			stm.close();
			System.out.println("Do you want to insert another record then pree y");
			 ch=scanner.next().charAt(0);
			}while(ch=='y' || ch =='Y');
			con.close();
			stm.close();
		}catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
	
	}}
