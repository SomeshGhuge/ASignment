package Comparator_Interface;

//   Sort data by using salary


import java.util.Comparator;
public class SalaryComparator implements Comparator<Student> {
	@Override
	public int compare(Student employee1, Student emp2) {

	/*	if (employee1.salary == employee2.salary)
			return 0;
		else if (employee1.salary > employee2.salary)
			return 1;
		else
			return -1;              */
		return employee1.salary.compareTo(emp2.salary);
  }
	}
