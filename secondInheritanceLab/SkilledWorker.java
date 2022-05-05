package moreInheritance;

import java.util.ArrayList;

public class SkilledWorker extends Employee{
	public SkilledWorker(String name, String jobTitle) {
		super(name, jobTitle);
	}

	ArrayList<String> skills = new ArrayList<String>();
	
	public void addSkill(String skill) {
		skills.add(skill);
	}
}
