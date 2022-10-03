package Input_Output;
import java.io.FileInputStream;
import java.io.IOException;
// Read a file line by line using Scanner class
import java.util.Scanner;
public class Read_File {
	public static void main(String[]args) {
		try {
			// file to be open for reading
			FileInputStream fis = new FileInputStream("F:\\SOMESH\\IT sector   JAVA Course\\Java\\Velocity\\Java Backend Developer\\Practise\\a.txt");
		  
			// file to be scanned
			Scanner sc = new Scanner(fis);
		    
			
			while(sc.hasNextLine())// returns true if there is a another line to read
			{
				// returns the line that was skipped
				System.out.println(sc.nextLine());
			}
			sc.close();
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
