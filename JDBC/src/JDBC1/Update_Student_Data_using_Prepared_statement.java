package JDBC1;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
public class Update_Student_Data_using_Prepared_statement {

	public static void main(String[]args) {
		
	  try {
		  Class.forName("com.mysql.jdbc.Driver");// load the driver
		  
		  // connect the connection between data base and local machine
		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","root");
		  
		  // create the prepared statement
		  PreparedStatement ps= con.prepareStatement("update data1 set works=?,money=?,days=? where id=1");
		 
		  //update dynamic values
		  ps.setString(1, "Java Developer ");
		  ps.setString(2,"70000" );
		  ps.setString(3, " 30");
		  
		  
		  // execute the update
		  
		  int i = ps.executeUpdate();
		  
		  System.out.println("record is updated "+ i);// show the value
		  
		  //close the process
		  ps.close();
		  con.close();
		  
	  }catch(Exception e) {
		  System.out.println(e);
		  e.printStackTrace();
	  }
	}
}
