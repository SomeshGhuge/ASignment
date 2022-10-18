package String;

public class info {
	
	/*
	
	String in Java:---->
	
	String is the class that represents sequence of character. 
	Package is Java. Lang. 
	It’s a non-primitive data type.
	String class implements Serializable, comparable, char sequence interface.
	String is the immutable, once string object is created, it cannot changed but new string object is created. 
	For mutable class, you can use String buffer and String builder class.
	
	
	How to create the string object?
	1.	String literal
	2.	By new keyword
	
	
	1.	String literal:---->
	           It is created by using double quotes.
               Example- String s=” velocity”;

	 Each time when you create string literal, the JVM check string constant pool first,
	 if the string object is already present in the pool, reference to pooled instance is returned. 
	 If string does not present in the pool, new string instance is created and placed in pool.

	Example- String s1=”velocity”;
	         String s2=” velocity”;  //will not create the new instance.

	In the above example, only one object will be created, firstly JVM will
	 not find any string object with value “velocity” in the string constant pool,
	  so it will create new object. After that it will find string with value= “velocity” in pool,
	   it will not create the new object but will return reference to same instance.

	            		
    Why Java uses the concept of string literal.......?
	          
       To make the java more memory efficient 
	  (because no new object is created if it exist already in string constant pool.)
	          
	          
   2.	By new Keyword:------->>
   
	    Example- String s= new String(“pune”);
	           // create two objects 

	     In such case, JVM will create the new String object in normal(non-pool) heap memory
	      and literal “pune” will be placed in string constant pool. The variable s refer to object in heap(non-pool).
  
  
  
Important methods of string class:------->


1)public char charAt(int index);
Returns the character locating at specified index.

2)public String concat(String str);

3)public Boolean equals(Object obj);
Used for case sensitive comparision.

4)public Boolean equalsIgnoreCase(Strings);
For content comparison where case is not important.

5)public String substring(int begin);
Return the substring from begin index to end of the string.

6)public String substring(int begin, int end);
Returns the substring from begin index to end-1 index.

7)public int length();
Returns the number of characters present in the string.

8)public String replace(char old, char new);
To replace every old character with a new character.

9)public String to LowerCase();
Converts the all characters of the string to lowercase.

10)public String to UpperCase();
Converts the all characters of the string to uppercase002E

11)public String trim();
We can use this method to remove blank spaces present at beginning and 
end of The string but not blank spaces present at middle of the String.

12)public int indexOf(char ch);
It returns index of 1st occurrence of the specified character 
if the specified Character is not available then return-1.

13)public int lastIndexOf(Char ch);
It returns index of last occurrence of the specified character 
if the specifiedCharacter is not available then return -1

    */       		   

}
