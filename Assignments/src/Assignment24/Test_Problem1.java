package Assignment24;
import java.util.*;

public class Test_Problem1 {
public static void main(String[]args) {
	List<Problem1_Employee > al =new ArrayList<Problem1_Employee>();
	al.add(new Problem1_Employee(1,"Somesh","Pune"));
	al.add(new Problem1_Employee(2,"Yogesh","Latur"));
	al.add(new Problem1_Employee(3,"Mahesh","Solapur"));
	
	System.out.println("<-------------------Before Sorting--------------->");
	
	for(Problem1_Employee emp : al) {
		System.out.println("Your name is "+emp.getName()+"-----> Your Id is "+emp.getId()+" ----->Your City is "+emp.getCity());
	}
	
	System.out.println("<------------------After Sorting---------------->");
	Collections.sort(al);
	for(Problem1_Employee emp : al) {
		System.out.println("Your name is "+emp.getName()+"----> Your Id is "+emp.getId()+"-----> Your City is "+emp.getCity());
	}
	
}
}
