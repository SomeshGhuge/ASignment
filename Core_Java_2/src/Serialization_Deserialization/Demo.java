package Serialization_Deserialization;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class Demo {

	public static void main(String[]args)throws Exception {
		SerializableTest test = new SerializableTest();
		System.out.println("<------Serialization is started-------->");
		
		FileOutputStream fos = new FileOutputStream("F:\\SOMESH\\IT sector   JAVA Course\\Java\\Velocity\\Java Backend Developer\\Practise\\a.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(test);
		System.out.println("<------Serialization is ended---------->");
		
		
		System.out.println("<------Deserialization is started------>");
		FileInputStream fis = new FileInputStream("F:\\SOMESH\\IT sector   JAVA Course\\Java\\Velocity\\Java Backend Developer\\Practise\\a.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Serializable test2=(SerializableTest)ois.readObject();
		System.out.println("<------Deserialization is ended-------->");
		
		System.out.println(test.i+".........."+test.j);
	
	}
}
