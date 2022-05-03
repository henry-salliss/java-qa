package day1;

import java.util.Scanner;

public class lab5 {
	public  int getInt(String prompt) {
		Scanner sc = new Scanner(System.in);
		System.out.println(prompt);
		int num = sc.nextInt();
		return num;
	}
	public void grades() {
		int examMark = getInt("what was your exam mark?");
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
		
		System.out.println("you got a " + grade);
        // declare an array
        int[] grades;
        // create an array
        grades = new int[3];
        // declare and create array, if done like this we need to add the data later
        int[] ages = new int[4];
        // declare, create and initialise the array at once
        double[] salaries = [18000.50, 35500.80, 67250.50]
	}
}
