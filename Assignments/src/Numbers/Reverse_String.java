package Numbers;
import java.util.*;
public class Reverse_String {
	public String getReverseString(String reverse) {
		String a=" ";
		for(int i=0;i<reverse.length();i++) {
			char ch=reverse.charAt(i);
			a=ch+a;
		}
		return a;
}
	public static void main(String[]args) {

		Reverse_String p=new Reverse_String();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your string");
		String reverse = scanner.nextLine();
		String str2=p.getReverseString(reverse);
		System.out.println("Your reverse string is \n "+str2);
	}
}
