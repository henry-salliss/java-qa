package moreInheritance;

import java.util.ArrayList;

public class Manager extends Employee{

	ArrayList<Employee> employees = new ArrayList<Employee>();
	
	public Manager(String name, String jobTitle) {
		super(name, jobTitle);
	}
	
	public void addEmployee(Employee emp) {
		employees.add(emp);
		
	}
	
	public void getInfo() {
		super.getInfo();
		for(Employee e :employees) {
			e.getInfo();
		}
	}
}
