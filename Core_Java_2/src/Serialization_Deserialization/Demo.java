package Serialization_Deserialization;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class Demo {
	public static void main(String args[]) throws Exception {
		SerializableTest d1 = new SerializableTest();
		
		System.out.println("Serialization started");
		FileOutputStream fos = new FileOutputStream("F:\\SOMESH\\Information Technology\\Softaware Course\\Java\\Velocity\\Java Backend Developer\\Practise\\q.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		System.out.println("Serialization ended");
		
		System.out.println("Deserialization started");
   		FileInputStream fis = new FileInputStream("F:\\\\SOMESH\\\\Information Technology\\\\Softaware Course\\\\Java\\\\Velocity\\\\Java Backend Developer\\\\Practise\\\\q.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		SerializableTest d2 = (SerializableTest) ois.readObject();
		System.out.println("Deserialization ended");
		
		
		System.out.println(d2.i + "................" + d2.j);
	}
}
