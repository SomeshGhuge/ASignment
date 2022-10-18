package String;

public class String_Builder {
/*  String Builder:----->
	 
	StringBuilder also provides us with mutable strings 
	but here we lack thread safety.
    It cannot be used by multiple threads simultaneously. 
    Since the class is not applying this extra feature like StringBuffer,
    it becomes faster than it.    */
   
	public static void main(String[] args) {
	StringBuilder a= new StringBuilder("String");
	System.out.println(a);
	//updating the string
	a.append(" Articles");
	System.out.println(a);
	}
}
