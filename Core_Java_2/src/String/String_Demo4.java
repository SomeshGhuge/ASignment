package String;



		
public class String_Demo4{

	public static void main(String[] args) {

		String s1 = "velocity";
		String s2 = new String("pune");
		System.out.println(s1 == s2);//false
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.hashCode());//2134260957
		System.out.println(s2.hashCode());//3452540

	}
}

