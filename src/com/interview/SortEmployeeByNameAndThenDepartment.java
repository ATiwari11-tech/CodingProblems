package com.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
	String name;
	String deptName;

	Employee(String name, String deptName) {
		this.name = name;
		this.deptName = deptName;
	}

	public String toString() {
		return name + ":" + deptName;
	}
}

public class SortEmployeeByNameAndThenDepartment {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Manik","Recruitment"));
		employees.add(new Employee("Akshay","IT"));
		employees.add(new Employee("Akshay","Ops"));
		employees.add(new Employee("Priyanka","Admin"));
		employees.add(new Employee("Rahul","HR"));
		System.out.println("Before Sorting:"+employees);
		System.out.println("After Sorting");
		Collections.sort(employees,new MyComparator());
		System.out.println(employees);
	}

}

class MyComparator implements Comparator<Employee>
{
	public int compare(Employee e1, Employee e2)
	{
		String name1 = e1.name;
		String name2 = e2.name;
		if(name1.equals(name2))
			return -e1.deptName.compareTo(e2.deptName);
		return name1.compareTo(name2);
	}
}
