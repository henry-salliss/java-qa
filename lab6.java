package day1;

import java.util.Scanner;

public class lab6 {
	public  int getInt(String prompt) {
		Scanner sc = new Scanner(System.in);
		System.out.println(prompt);
		int num = sc.nextInt();
		return num;
	}
	
	public  String getString(String prompt) {
		Scanner sc = new Scanner(System.in);
		System.out.println(prompt);
		String line = sc.nextLine();
		return line;
	}
	public void part1() {
		grades();
	}
	
	public void grades() {
		String[] names = new String[5];
		int[] marks = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter names of 5 students");
		
		for(int i = 0; i < names.length; i++) {
			names[i] = sc.nextLine();
		}
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("please enter the marks for these students");
		for(int i = 0; i< marks.length; i++) {
			marks[i] = sc.nextInt();
		}
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("here are their results");
		
		for(int i = 0; i< names.length; i++) {
			System.out.println(names[i] + " got " + marks[i] + " marks");
			String grade = calcGrade(marks[i]);
			System.out.println("therefore they achieved a " + grade);
		}
		
	}
	
	public String calcGrade(int examMark) {
		String grade;
		if(examMark < 50) {
			grade = "fail";
		}
		else if(examMark >= 50 && examMark <=60) {
			grade = "pass";
		}
		else if(examMark > 60 && examMark <= 70) {
			grade = "merit";
		}
		else {
			grade = "distinction";
		}
		
		return grade;
	}
	
	public void account() {
		int initialMoney = getInt("how much money have you started with");
		int interestRate = 5;
		int currentMoney = initialMoney;
		int years = 0;
		
		while(currentMoney < 200) {
			years += 1;
			currentMoney += (currentMoney * interestRate) / 100;
			System.out.println(currentMoney);
		}
		
		System.out.println("it will takes " + years + " years to accumulate " + currentMoney);
	}
	
	public void multiplicationTable() {
		System.out.println("");
		for(int col = 1; col < 11; col++) {
			for(int row = 1; row< 11; row++) {
				System.out.println(col * row);
			}
		}
	}
}

