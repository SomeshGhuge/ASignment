package Array;

/*
 

Properties file in Java.....?

Properties file is nothing but simple configuration file called 
as .property file or it is the simple file with .
properties extension and it contain the key value formatted data.
The properties object contains key and value pair both as a string. 
The java.util.Properties class is the subclass of Hashtable.
It can be used to get property value based on the property key. 
The Properties class provides methods to get data from the properties
file and store data into the properties file. Moreover, 
it can be used to get the properties of a system.

Why........?

In standalone or web application, data is frequently changing is
 like username, password, url, driver, etc. so every time
  it is very difficult to modify in java that becomes very complex.
   So to overcome this problem, we should go for .properties file.
   
Recompilation is not required if the information is 
changed from a properties file: If any information is changed
 from the properties file, you don't need to recompile the java class.
  It is used to store information which is to be changed frequently.


Program for properties file in Java.
*/

import java.io.FileInputStream;
import java.util.Properties;

public class Properties_File {

	public static void main(String[] args) {

		
		try {
			FileInputStream fis = new FileInputStream("F:\\SOMESH\\Information Technology\\Softaware Course\\Java\\Velocity\\Java Backend Developer\\Practise\\r.txt");
			// locate the properties file

			Properties p= new Properties();
			p.load(fis);
			// load properties file by using load () of properties class
			String username = p.getProperty("username");
			String password = p.getProperty("password");

			// get the data by using getProperty()

			System.out.println("Username is=" + username);
			System.out.println("Password is=" + password);

		} catch (Exception e) {
			e.printStackTrace();
		}

		// print data on console

	}
}

