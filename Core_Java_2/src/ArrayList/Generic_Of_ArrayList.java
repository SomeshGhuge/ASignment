package ArrayList;

//2. Program for design generic arraylist for Integer type only
import java.util.ArrayList;
public class Generic_Of_ArrayList {
	        public static void main(String[] args) {
			ArrayList<Integer> al= new ArrayList<Integer>();
			al.add(10);
			al.add(20);
			al.add(30);
			
			for(int i: al) {
				System.out.println(""+i);
			
	}
	}}



