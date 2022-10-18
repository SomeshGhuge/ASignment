package Serialization_Deserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeStudents {

	public static void main(String[] args) {

		Students s = new Students();
		s.setFirstname("ajay");
		s.setLastname("pawar");
		s.setSalary(5000); //wont be serialized

		try {
			FileOutputStream fps = new FileOutputStream("F:\\SOMESH\\Information Technology\\Softaware Course\\Java\\Velocity\\Java Backend Developer\\Practise\\e.txt");
			ObjectOutputStream ooos = new ObjectOutputStream(fps);
			ooos.writeObject(s);
			fps.close();
			ooos.close();
			System.out.println("Serialization is done...");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
