package JDBC1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Retriving_program {
	public static void main(String[]args) throws SQLException {
		
		Connection con= null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			// load the derive
			Class.forName("com.mysql.jdbc.Driver");
			// connect  the class
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/data",
					                                                           "root","root");
			// create the prepared statement
		    ps=con.prepareStatement("select * from data");
			
		    rs=ps.executeQuery();// for execute Query
			
			while(rs.next()) {
				System.out.println("Id is = "+ rs.getInt(4));
				System.out.println("Work is = "+rs.getString(1));
				System.out.println("Money is = "+rs.getString(2));
				System.out.println("Days is = "+rs.getString(3));
				System.out.println("------------------------------------");
			}
		

		}catch(Exception e) {
		//	System.out.println(e);
			e.printStackTrace();
		}
		con.close();
		ps.close();
		rs.close();
	}


}
