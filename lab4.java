package day1;

import java.util.Scanner;

public class lab4 {
	public  int getInt(String prompt) {
		Scanner sc = new Scanner(System.in);
		System.out.println(prompt);
		int num = sc.nextInt();
		return num;
	}
	
	public void part1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Price of bag please?");
		double priceOfBag = sc.nextDouble();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("How much money do you have?");
		double money = sc2.nextInt();
		
		if(priceOfBag < 0) {
			System.out.println("Price must be positive number");
		}
		else if(priceOfBag == 0) {
			System.out.println("Price cant be 0");
		}
		else {
			double numOfBag = money / priceOfBag;
			System.out.println("if the price of bags is " + priceOfBag + " and you have " + money + " then you can afford " + numOfBag + " bags");
		}
		
		if(money < 0) {
			System.out.println("money must be a positive number");
		}
		else if(money == 0) {
			System.out.println("come back with your pocket money");
		}
		else {
		double numOfBag = money / priceOfBag;
		System.out.println("if the price of bags is " + priceOfBag + " and you have " + money + " then you can afford " + numOfBag + " bags");
			
		}
		
	}
	
	public void part2() {
		boolean summer = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("is it summer time?");
		String answer = sc.nextLine();
		if(answer.equals("yes")) {
			summer = true;
		}
		
		boolean sunny= false;
		Scanner sc2 = new Scanner(System.in);
		System.out.println("is it sunny?");
		String answerTwo = sc2.nextLine();
		
		if(answerTwo.equals("yes")) {
			sunny = true;
		}
		
		if(summer && sunny) {
			System.out.println("eat outside its summer!");
		}
		else if(summer && !sunny) {
			System.out.println("do an outdoors hobby its summer but not sunny");
		}
		else if(!summer && sunny) {
			System.out.println("take a walk its sunny even though its not summer");
		}
		else {
			System.out.println("eat inside its not nice outside today :(");
		}
		
		
	}
}
