package Assignemnt09;

//1. Write the Java program in which create the multiple objects 
//and display the count of number of objects created into class.

public class countobject {
	static int countoobject;
	 countobject() {
		countoobject++;
		
	}
	public static void getcountobjectt() {
		System.out.println("The number of objects are---->"+countoobject);
	}
	public static void main(String[]args) {
		countobject asdf=new countobject();
		countobject asdf1=new countobject();
		countobject asdf2=new countobject();
		countobject asdf3=new countobject();
		getcountobjectt();
		 
	}
	

}
