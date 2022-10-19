package ArrayList;
//7. create_for_user_the_arraylist_defined_type_for_employee
import java.util.*;
public class create_for_user_the_arraylist_defined_type_for_employee {
      public static void main(String[] args) {
    	  ArrayList<Employee> arrayList = new ArrayList<Employee>();
          arrayList.add(new Employee(20, "ram", "25000"));
		  arrayList.add(new Employee(30, "sohan", "15000"));

//by using iterator
		  Iterator<Employee> itr = arrayList.iterator();
          while (itr.hasNext()) {
		  System.out.println("employee list>>" + itr.next());
		}
//by using for each loop
          for(Employee e1: arrayList) {
			System.out.println("data is>>"+e1);
		}}}


