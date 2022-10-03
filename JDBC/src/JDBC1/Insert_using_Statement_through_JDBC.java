package JDBC1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Insert_using_Statement_through_JDBC {

	public static void main(String[] args) {
		try {
		String sql= "INSERT INTO user(lastname,firstname)VALUES('Munde','Radha')";
		// here we  insert table column and info in that column
		
	    Class.forName("com.mysql.jdbc.Driver");// here we load the drive

Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","root");
	// here we establishesh the connection between database and local machine

        Statement statement=con.createStatement();// here we creat the sql statement
        
		statement.execute(sql);// here we update the sql
		
		System.out.println("Insurtion successfully...");
		
		con.close();// here we closes the resources
		statement.close();
		
	}catch(Exception e) {
		System.out.println(e);
		e.printStackTrace();
	}
	}
}
