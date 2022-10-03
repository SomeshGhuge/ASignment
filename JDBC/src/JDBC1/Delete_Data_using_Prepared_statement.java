package JDBC1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete_Data_using_Prepared_statement {
	public static void main(String[]args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");// load the driver
			  
			  // connect the connection between data base and local machine
			  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","root");
			  
			  // create the prepared statement
			  PreparedStatement ps= con.prepareStatement("delete from data where id=6");
			  
			//  ps.setInt(1, 7);// used when inplace of 6 we put ?
			  // execute statement
			  int i=ps.executeUpdate();
			  System.out.println(" Deleted record "+i);
			  
			  // close the process
			  con.close();
			  ps.close();
			  
	}catch(Exception e) {
		e.printStackTrace();
		System.out.println(e);
	}
	}

}
