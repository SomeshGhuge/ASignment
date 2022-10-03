package JDBC2;
// Program for multiple student data using jdbc into database
import java.sql.Connection;
import java.sql.DriverManager; 

public class multiple {
	 Connection con=null;
	 
	public Connection getconnections() {
		try {
			Class.forName("com.mysql.jdbc.Driver");// loading driver
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "root");
			// establish connection
		}catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		return con;
	}

}
