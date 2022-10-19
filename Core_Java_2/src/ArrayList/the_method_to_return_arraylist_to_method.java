package ArrayList;
//9. Design the_method_to_return_arraylist to_method


import java.util.ArrayList;
public class the_method_to_return_arraylist_to_method {

	public ArrayList getEmployeedata() {
		
		ArrayList arrayList= new ArrayList();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		return arrayList;
	}
	
	public static void main(String[] args) {
		the_method_to_return_arraylist_to_method all=new the_method_to_return_arraylist_to_method();
		System.out.println(all.getEmployeedata());
	}
}
