package Serialization_Deserialization___1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[]args) {
		Studentsss ss=new Studentsss();
		ss.setId(1);
		ss.setFirstname("Somesh");
		ss.setLastname("Ghuge");
		ss.setSalary(35000);
		
		try {
			FileOutputStream fos=new FileOutputStream("F:\\SOMESH\\Information Technology\\Softaware Course\\Java\\Velocity\\Java Backend Developer\\Practise\\serialization.txt");
	        ObjectOutputStream oos=new ObjectOutputStream(fos);
	        oos.writeObject(ss);
	        fos.close();
	        oos.close();
	        System.out.println("Serialization is Done");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
		}
	}
}
