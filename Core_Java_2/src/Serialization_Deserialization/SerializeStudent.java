package Serialization_Deserialization;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeStudent {

	public static void main(String[] args) {

		Student s = new Student();
		s.setFirstname("ajay");
		s.setLastname("pawar");
		s.setCity("pune");

		try {
			FileOutputStream fos = new FileOutputStream("F:\\\\SOMESH\\\\Information Technology\\\\Softaware Course\\\\Java\\\\Velocity\\\\Java Backend Developer\\\\Practise\\\\w.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s);//set the object
			fos.close();
			oos.close();
			System.out.println("Serialization is done...");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
