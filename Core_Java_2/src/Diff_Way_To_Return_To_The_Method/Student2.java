package Diff_Way_To_Return_To_The_Method;
// here we get data from student1 class
//
public class Student2 {
	public static Student1 getStudentDetails() {
		int id =1;
		String Firstname = "Somesh";
		String Lastname = "Ghuge";
		int score=7;
	return new Student1(id,Firstname,Lastname,score);
	//// return multiple values from object here
		}
	
	public static void main(String[]args) {
		Student1 st = getStudentDetails();
		System.out.println("Students id is -->"+st.id);
		System.out.println("Students name is -->"+st.Firstname+" "+st.Lastname);
	
		System.out.println("Students Score is -->"+st.score);
	}
	

}
