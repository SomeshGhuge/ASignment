package JDBC1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class CRUD_Operation {
	public static void main(String[]args) {
		char ch; char p;
		Connection con=null;
		PreparedStatement pre=null;
		Scanner scanner= new Scanner(System.in);
		
		try {
		
		
				System.out.println("This is CRUD Operation");
				System.out.println("Enter 1 for Insert/Create");
			    System.out.println("Enter 2 for Update");
			    System.out.println("Enter 3 for Delete ");
			    System.out.println("Enter 4 for SELECT");
                int a= scanner.nextInt();
               
	    // Step:1)--->Load the Driver
	     Class.forName("com.mysql.jdbc.Driver");
	    	
	    // Step:2)--->Make connection between java program and database
	     con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","root");
	     
	   //  Step:3)--->Prepare Statement
	     switch(a) {
	     case 1:{
	    	 do {
	    	 System.out.println(" <--------Enter your details------->");
	    	 System.out.println(" Enter Your  Firstname ");
	    	 String q=scanner.next();
	    	 System.out.println(" Enter Your  Lastname ");
	    	 String w=scanner.next();
	    	 System.out.println(" Enter Your  Job ");
	    	 String e=scanner.next();
	    	 System.out.println(" Enter Your  Salary ");
	    	 String r=scanner.next();
	    	 System.out.println(" Enter Your  Location ");
	    	 String t=scanner.next();
	    	
	   // Step:-3) Create prepare statement
	     pre=con.prepareStatement("insert into user1 (Firstname,Lastname,Job,Salary,Location)values(?,?,?,?,?)");
	     pre.setString(1, q);
	     pre.setString(2, w);
	     pre.setString(3, e);
	     pre.setString(4, r);
	     pre.setString(5, t);
	     
	   // Step:-4) Execute update
	     int i = pre.executeUpdate();
	     System.out.println("Record updated");
	     System.out.println("------------------------------------");
	     System.out.println(" If you want upload more id press Y or y");
	      p=scanner.next().charAt(0);
	    	 }while(p=='Y' || p=='y');
	     break;
	    	 }
	     
	     case 2:{
                char c;
				do {
	    		 System.out.println("<-------Enter your updates------->");
	    		 System.out.println("Press 1 for update in Firstname and LastName");
	    		 System.out.println("Press 2 for update in Job");
	    		 System.out.println("Press 3 for update in Salary");
	    		 System.out.println("Press 4 for update in Location");
	    		 int o=scanner.nextInt();
	    		 switch(o) {
	    		 case 1:{
	    			 pre=con.prepareStatement("Update user1 set Firstname=?,Lastname=? where id=?");
	    			 System.out.println("Enter FirstName ");
	    			 String A=scanner.next();
	    			 pre.setString(1, A);
	    			 System.out.println("Enter Lastname");
	    			 String B = scanner.next();
	    			 pre.setString(2,B);
	    			 System.out.println("Enter Id");
	    			 String C = scanner.next();
	    			 pre.setString(3,C);
	    			 System.out.println("<-----Record updated---->");

	    			 break ;
	    		 }
	    		 case 2:{
	    			 pre=con.prepareStatement("Update user1 set Job=? where id=?");
	    			 System.out.println("Enter Job ");
	    			 String A=scanner.next();
	    			 pre.setString(1, A);
	    			 System.out.println("Enter Id");
	    			 String B = scanner.next();
	    			 pre.setString(2,B);
	    			 System.out.println("<-----Record updated---->");

	    			 break ;
	    			 
	    		 }case 3:{
	    			 pre=con.prepareStatement("Update user1 set Salary=? where id=?");
	    			 System.out.println("Enter Salary ");
	    			 String A=scanner.next();
	    			 pre.setString(1, A);
	    			 System.out.println("Enter Id");
	    			 String C = scanner.next();
	    			 pre.setString(2,C);
	    			 System.out.println("<-----Record updated---->");

	    			 break ;
	    		 }case 4:{
	    			 pre=con.prepareStatement("Update user1 set Location=? where id=?");
	    			 System.out.println("Enter Location ");
	    			 String A=scanner.next();
	    			 pre.setString(1, A);
	    			
	    			 System.out.println("Enter Id");
	    			 String C = scanner.next();
	    			 pre.setString(2,C);
	    			 System.out.println("<-----Record updated---->");

	    			 break ;
	    		 }
	    		 
	    		 
	    	 }
	    		 System.out.println("If you want again update pree Y or y");
	    		  c=scanner.next().charAt(0);
                }while(c=='Y' || c=='y');
	     }
	     
	     case 3:{
	    	 do {
	    		 System.out.println("<-----Perform Delete Operation----->");

    			 pre=con.prepareStatement(" Delete from user1 where id=?");
    			 System.out.println("Enter Id");
    			 int Q=scanner.nextInt();
    			 pre.setInt(1, Q);
    			 if(0<Q && Q<=6) {
    				
						pre.executeUpdate();
						System.out.println("RECORD DELETED");
						
    			 }else {
    				 System.out.println("Wrong information provided by u");
    			 }
    			 System.out.println("Press Y or y if want to delet again");
    			 ch=scanner.next().charAt(0);
	    	 }while(ch=='Y' || ch=='y');
	    	 break;
	     }
	  }
		}catch(Exception e ) {
			e.printStackTrace();
			System.out.println(e);
	}
	}
}

