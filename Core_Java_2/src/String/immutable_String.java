package String;

/* Q. Why String is immutable?
    String is the immutable, once string object is created, 
    it cannot change but new string object is created.
    Example:----->  */


public class immutable_String {
   public static void main(String[] args) {
	String s = "ram";
    s.concat("patil");// concat() method appends the string at the end
    System.out.println(s);// will print ram because strings are immutable objects
			
    }
}
