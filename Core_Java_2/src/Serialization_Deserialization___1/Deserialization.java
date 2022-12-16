package Serialization_Deserialization___1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[]args) {
		
		try {
			FileInputStream fis=new FileInputStream("F:\\SOMESH\\Information Technology\\Softaware Course\\Java\\Velocity\\Java Backend Developer\\Practise\\serialization.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Object o=ois.readObject();
			Studentsss s=(Studentsss) o;
			System.out.println(s.getId());
			System.out.println(s.getFirstname());
			System.out.println(s.getLastname());
			System.out.println(s.salary);
			fis.close();
			ois.close();
			
		}catch(Exception e ) {
			e.printStackTrace();
		}
	}
}
