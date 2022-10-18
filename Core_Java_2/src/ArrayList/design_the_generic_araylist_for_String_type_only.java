package ArrayList;

//3.	Program for design_the_generic_arraylist_for_String_type_only
import java.util.ArrayList;
public class design_the_generic_araylist_for_String_type_only {
        public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<String>();
		al.add("10");
		al.add("20");
		al.add("30");
		al.add("540");
		
		for(String str: al) {
			System.out.println(""+str);
	}}}
