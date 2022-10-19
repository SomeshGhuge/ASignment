package Comparator_Interface;
//Sort data by using Id

import java.util.Comparator;
public class IdComparator implements Comparator<Student> {
@Override
public int compare(Student emp1, Student emp2) {
	return emp1.id.compareTo(emp2.id);
}}