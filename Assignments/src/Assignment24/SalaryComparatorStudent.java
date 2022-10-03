package Assignment24;

import java.util.Comparator;

public class SalaryComparatorStudent  implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.salary.compareTo(o2.salary);
	}

}
