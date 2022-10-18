package Serialization_Deserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeStudent {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("F:\\SOMESH\\Information Technology\\Softaware Course\\Java\\Velocity\\Java Backend Developer\\Practise\\w.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object o = ois.readObject(); // Read the object
			Student s = (Student) o;// convert to student
			System.out.println(s.getFirstname());
			System.out.println(s.getLastname());
			System.out.println(s.getCity());
			fis.close();
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
