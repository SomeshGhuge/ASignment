package Comparator_Interface;

//  Sort data by using name

import java.util.Comparator;
public class NameComparator implements Comparator<Student> {
	@Override
	public int compare(Student emp1, Student emp2) {
		return emp1.name.compareTo(emp2.name);
}}
