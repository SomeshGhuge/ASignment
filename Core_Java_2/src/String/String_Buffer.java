package String;
/*
String Buffer:--->

It provides us with a way to use mutable strings in java. 
These strings are safe to be used by multiple threads simultaneously.
In order to give this advantage to the StringBuffer, 
the implementation of this class becomes less time efficient.      */

public class String_Buffer {
	public static void main(String[] args) {
		

	StringBuffer a= new StringBuffer("Hello");
	System.out.println(a);
	//updating the string
	a.append(" World");// add privious word and latest word
	System.out.println(a);
	}
}
