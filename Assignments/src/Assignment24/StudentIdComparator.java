package Assignment24;
import java.util.*;
public class StudentIdComparator implements Comparator<Student> {
public static void main(String[] args) {
		try {
		
	}catch(Exception e) {
		System.out.println(e);
		e.printStackTrace();
	}

}

@Override
public int compare(Student o1, Student o2) {
	// TODO Auto-generated method stub
	return o1.id.compareTo(o2.id);
}}
