package Assignment24;
import java.util.*;
public class Student_Test {

	public static void main(String[]args) {
		List<Student> st =new ArrayList<Student>();
		st.add(new Student("1","Somesh","50000"));
		st.add(new Student("2","Yogesh","40000"));
		st.add(new Student("4","Mahesh","30000"));
		st.add(new Student("3","Ganesh","20000"));
		
		System.out.println("<--------------Before Sorting------------>");
		for(Student stu:st) {
			System.out.println(stu);
		//	System.out.println("Id is->"+stu.getId()+"Name is->"+stu.getName()+"Salary is->"+stu.getSalary());
			
		}
		System.out.println("<--------------After Sorting Salary------------>");	
	Collections.sort( st,new SalaryComparatorStudent() );
		for(Student stud:st) {
			System.out.println(stud);
		}
		System.out.println("<--------------After Sorting Name------------>");	
		Collections.sort( st,new StudentNameComparator() );
			for(Student stud:st) {
				System.out.println(stud);
			}
			
			System.out.println("<--------------After Sorting Id------------>");	
			Collections.sort( st,new StudentIdComparator() );
				for(Student stud:st) {
					System.out.println(stud);
				}
		
		}
	}

