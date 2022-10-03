package Input_Output;
// Here we Write the file using File Writer class
import java.io.FileWriter;
import java.util.Scanner;

public class Write_FIle {

	public static void main(String[]args) {
		try {
			FileWriter fw = new FileWriter("F:\\SOMESH\\IT sector   JAVA Course\\Java\\Velocity\\Java Backend Developer\\Practise\\a.txt");
		   Scanner scanner = new Scanner(System.in);
		   System.out.println("Enter sentence whish u want to add");
		   String a=scanner.nextLine();
			fw.write(a);
		    fw.close();
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		System.out.println("<--------Input added into file successfully-------->");
	}
}
