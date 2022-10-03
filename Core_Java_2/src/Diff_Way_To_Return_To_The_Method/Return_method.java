package Diff_Way_To_Return_To_The_Method;
// here we get output of costomised method return type

public class Return_method {

	String name="Somesh";
	int id = 1;
	String city= "Latur";
	
	public Return_method m1() {
		Return_method R = new Return_method();
		System.out.println(R);
		return R;
	}
	
	public static void main(String[]args) {
		Return_method RM = new Return_method();
		RM.m1();// here we get output as hashcode
		// to solve this problem we must have to use string to string method
	}

	@Override
	public String toString() {
		return "Return_method [name=" + name + ", id=" + id + ", city=" + city + "]";
	}// By using this we get proper ans menas id name city not hashcode
	
}
