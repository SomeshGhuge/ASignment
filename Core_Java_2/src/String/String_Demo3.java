package String;

public class String_Demo3 {
	/*  Note:
	1)	“==” operator compares reference or memory location of objects in a heap,
	     whether they point to the same location or not.
	     
	2)	The String class overrides the equals method it inherited from the Object
	 class and implemented logic to compare the two String objects character by 
	 character.
	 
	*/
	public static void main(String[] args) {
		
		String s1 = "velocity";
		String s2 = new String("pune");
		s2=s1;
		System.out.println(s1 == s2);//true
		System.out.println(s1.equals(s2));//true

	}}
