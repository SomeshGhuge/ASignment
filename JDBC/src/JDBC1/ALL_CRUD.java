package JDBC1;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.util.Scanner;

	public class ALL_CRUD {
		public static void main(String[] args) {
			char ch;
			Connection con=null;
			PreparedStatement ps=null;
			Scanner sc=new Scanner(System.in);
			try {
				do {
					System.out.println("WHICH OPERATION YOU CAN PERFORM");
					System.out.println("1<-INSERT");
					System.out.println("2<-UPDATE");
					System.out.println("3<-DELETE");
					System.out.println("4<-SELECT");
					System.out.println("ENTER YOUR CHOICE-->>");
					int c=sc.nextInt();
					// step1:load the driver class
					Class.forName("com.mysql.jdbc.Driver");
					//step2:Establish the connection
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
					//step3:prepare statement
					switch(c)
					{
					case 1:
					{
						System.out.println("<<---ENTER YOUR DATA TO DATABASE-->>");
						System.out.println("LAST NAME->>");
						String lname=sc.next();
						System.out.println("FIRST NAME->>");
						String fname=sc.next();
						System.out.println("CITY NAME->>");
						String city=sc.next();
						System.out.println("DISTRICT NAME->>");
						String dist=sc.next();
						System.out.println("SALARY->>");
						String salary=sc.next();
						
						ps = con.prepareStatement("insert into user(Lname,Fname,city,dist,salary) values(?,?,?,?,?)");
						ps.setString(1, lname);
						ps.setString(2, fname);
						ps.setString(3, city);
						ps.setString(4, dist);
						ps.setString(5, salary);
						int x=ps.executeUpdate();
						System.out.println("INSERT RECORD SUCCESSFULLY->>"+x);
						break;
					}
					case 2:
					{
						System.out.println("ENTER WHERE YOU CAN UPDATE");
						System.out.println("1<-LAST NAME & FIRST NAME");
						System.out.println("2<-CITY & DISTRICT");
						System.out.println("3<-SALARY");
						System.out.println("ENTER YOUR CHOICE-->>");
						int u=sc.nextInt();
						switch(u)
						{
						case 1:
						{//fname and lname
							System.out.println("ENTER LAST NAME->>");
							String lname=sc.next();
							System.out.println("ENTER FIRST NAME->>");
							String fname=sc.next();
							System.out.println("ENTER ID WHERE CAN UPDATE->>");
							String id=sc.next();
							ps=con.prepareStatement("update user set Lname=?,Fname=? where id=?;");
							ps.setString(1, lname);
							ps.setString(2, fname);
							ps.setString(3, id);
							ps.executeUpdate();
							System.out.println("RECORD UPDATE-1");
							break;
						}
						case 2:
						{
							//city and distict
							System.out.println("ENTER CITY NAME->>");
							String city=sc.next();
							System.out.println("ENTER DISTRICT NAME->>");
							String dist=sc.next();
							System.out.println("ENTER ID WHERE CAN UPDATE->>");
							String id=sc.next();
							ps=con.prepareStatement("update user set city=?,dist=? where id=?;");
							ps.setString(1, city);
							ps.setString(2, dist);
							ps.setString(3, id);
							ps.executeUpdate();
							System.out.println("RECORD UPDATE-1");
							break;
						}
						case 3:
						{
							//salary
							System.out.println("ENTER SALARY NAME->>");
							String salary=sc.next();
							System.out.println("ENTER ID WHERE CAN UPDATE->>");
							String id=sc.next();
							ps=con.prepareStatement("update user set salary=? where id=?;");
							ps.setString(1, salary);
							ps.setString(2, id);
							ps.executeUpdate();
							System.out.println("RECORD UPDATE-1");
							break;
						}
						default:
						{
							System.out.println("WRONG CHOICE");
						}
						}
						break;
					}
					case 3:
					{
						//delete
						ps=con.prepareStatement("delete from user where id=?;");
						System.out.println("ENTER  ID->>");
						String id=sc.next();
						ps.setString(1, id);
						ps.executeUpdate();
						System.out.println("RECORD DELETE-1");
						break;
					}
					case 4:
					{//select
						System.out.println("ENTER WITCH RECORD WILL DISPLAY");
						System.out.println("1<-ALL RECORD");
						System.out.println("2<-NAME");
						System.out.println("3<-ADDRESS");
						System.out.println("4<-SALARY");
						System.out.println("5<-SELECT SINLE RECORD");
						System.out.println("6<-HiGHEST SALARY");
						System.out.println("7<-2 HIGHEST SALARY");
						System.out.println("8<-LOWEST SALARY");
						System.out.println("ENTER YOUR CHOICE->>");
						int s=sc.nextInt();
						switch(s)
						{
						case 1:
						{//ALL RECORD
						ps=con.prepareStatement("select * from user;");
						ResultSet rs = ps.executeQuery();
					    while(rs.next())
					    {
					    	System.out.print("ID->>"+rs.getInt(1));
					    	System.out.print("\tLname->>"+rs.getString(2));
					    	System.out.print("\tFname->>"+rs.getString(3));
					    	System.out.print("\tCITY->>"+rs.getString(4));
					    	System.out.print("\tDISt->>"+rs.getString(5));
					    	System.out.println("\tSALARY->>"+rs.getString(6));
					    }
					    break;
						}
						case 2:
						{//NAME
							ps=con.prepareStatement("select lname,fname from user;");
							ResultSet rs = ps.executeQuery();
						    while(rs.next())
						    {
						    	System.out.print("LAST NAME->>"+rs.getString(1));
						    	System.out.println("\tFIRST NAME->>"+rs.getString(2));
						    }
						    break;
						}
						case 3:
						{//address
							ps=con.prepareStatement("select city,dist from user;");
							ResultSet rs = ps.executeQuery();
						    while(rs.next())
						    {
						    	System.out.print("CITY->>"+rs.getString(1));
						    	System.out.println("\tDISTRICT->>"+rs.getString(2));
						    }
						    break;
						}
						case 4:
						{//salary
							ps=con.prepareStatement("select salary from user;");
							ResultSet rs = ps.executeQuery();
						    while(rs.next())
						    {
						    	System.out.println("SALARY->>"+rs.getString(1));
						    }
						    break;	
						}
						case 5:
						{//single record
							ps=con.prepareStatement("select * from user where id=?;");
							System.out.println("ENTER ID->>");
							String id=sc.next();
							ps.setString(1, id);
							ResultSet rs = ps.executeQuery();
						    while(rs.next())
						    {
						    	System.out.print("ID->>"+rs.getInt(1));
						    	System.out.print("\tLname->>"+rs.getString(2));
						    	System.out.print("\tFname->>"+rs.getString(3));
						    	System.out.print("\tCITY->>"+rs.getString(4));
						    	System.out.print("\tDISt->>"+rs.getString(5));
						    	System.out.println("\tSALARY->>"+rs.getString(6));
						    }
						    break;
						}
						case 6:
						{//highest salary
							ps=con.prepareStatement("select * from user as e order by salary DESC limit 1; ");
							ResultSet rs = ps.executeQuery();
							while(rs.next())
						    {
						    	System.out.print("ID->>"+rs.getInt(1));
						    	System.out.print("\tLname->>"+rs.getString(2));
						    	System.out.print("\tFname->>"+rs.getString(3));
						    	System.out.print("\tCITY->>"+rs.getString(4));
						    	System.out.print("\tDISt->>"+rs.getString(5));
						    	System.out.println("\tSALARY->>"+rs.getString(6));
						    }
						    break;	
							
						}
						case 7:
						{//2 highest salary
							ps=con.prepareStatement("select * from user as e order by salary DESC limit 1,1; ");
							ResultSet rs = ps.executeQuery();
							while(rs.next())
						    {
						    	System.out.print("ID->>"+rs.getInt(1));
						    	System.out.print("\tLname->>"+rs.getString(2));
						    	System.out.print("\tFname->>"+rs.getString(3));
						    	System.out.print("\tCITY->>"+rs.getString(4));
						    	System.out.print("\tDISt->>"+rs.getString(5));
						    	System.out.println("\tSALARY->>"+rs.getString(6));
						    }
						    break;	
						}
						case 8:
						{//lowest salary
							ps=con.prepareStatement("select * from user as e order by salary limit 1; ");
							ResultSet rs = ps.executeQuery();
							while(rs.next())
						    {
						    	System.out.print("ID->>"+rs.getInt(1));
						    	System.out.print("\tLname->>"+rs.getString(2));
						    	System.out.print("\tFname->>"+rs.getString(3));
						    	System.out.print("\tCITY->>"+rs.getString(4));
						    	System.out.print("\tDISt->>"+rs.getString(5));
						    	System.out.println("\tSALARY->>"+rs.getString(6));
						    }
						    break;	
							
							
						}
						default:
						{
							System.out.println("WRONG CHAOICE.......");
						}
						break;
						}
						break;
					}
					default:
					{
						System.out.println("WRONG CHOICE........");
					}
				}
					System.out.println("Do YOU WANT CONTINUE PRESS->>Y");
					ch=sc.next().charAt(0);
				}while(ch=='y' || ch=='Y');
				System.out.println("<<--THENK YOU-->>>");
				con.close();
				ps.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}		}



