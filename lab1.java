public class lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 21;
		String name = "Henry Salliss";
		String phoneNumber = "07305824438";
		double salary = 18000;
		boolean drivingLicense = true;
		System.out.println(age + name + phoneNumber + salary + drivingLicense);
//		
		int number = 5;
		System.out.println("Initial Value: " + number);

		// Task 1
		// - double it using the '*' operator
		// - now double it again using the '*=' operator
		number = 2 * number;
		number *= 2;
		System.out.println("\n1. After doubling it twice: " + number);

		// Task 2
		// - add 3 to it using the '+' operator
		// - now add 3 to it using the '+=' operator
		number = number + 3;
		number += 3;
		System.out.println("\n2. After adding 3 twice: " + number);

		// Task 3 - subtract 12 from it using an appropriate 'compound' operator
		number -= 12;
		System.out.println("\n3. After subtracting 12: " + number);

		// Task 4 - divide the number (ought to be 14 now) by 3
		// what do you think the answer is
		number /= 3;
		System.out.println("\n4. After dividing by 3: " + number);

		// Task 5 write 4 different statements that all do the same thing
		// namely 'add 1 to the number' 
		number = number + 1;
		number += 1;
		number++;
		++number;
		System.out.println("\n5. After adding 1 four times: " + number);

		// Task 6 decrement by 1 the value of number
		number--;
		System.out.println("\n6. After decrementing once: " + number);
		// Task 7 put the remainder when dividing by 3 into 'remainder'
		int remainder = 0;
		remainder = number % 3;
		System.out.println("\n7. Remainder when dividing by 3 is :" + remainder);

		// Task 8 
		// decide what it will print before uncommenting the println()

		int a = 2, b = 3, c = 5;
		double d1, d2, d3, d4;

		d1 = a + b * c / 2;
		d2 = (a + b * c) / 2;
		d3 = (a + b) * c / 2;
		d4 = (a + b) * (c / 2);
		 System.out.println("\n8. Values: " + d1 + " : " + d2 + " : " + d3
		 + " : " + d4);
		// Type your answer here--> 9.5, 8.5, 12.5, 12.5
		// Task 9

		int p, q;
		p = 10;
		q = 10;
		p += q++; //21
		
		int n = 5;
		int d = n /2; // has to be double otherwise will not work
		System.out.println(d);

		// Decide what the next line will print
		 System.out.println("\n9. Result is: " + (p + q)); 
		// Answer-->31

		// Task 10 – Uncomment the code below 
		System.out.println("\n11.");

		// Decide what the following 4 lines will print
		// The 4th one might surprise you

		 System.out.println("fred" + 3 + 4); // Answer--> fred 7
		 System.out.println(3 + 4 + "fred"); // Answer--> 34fred
		 System.out.println("" + 3 + 4); // Answer-->34
		 System.out.println(3 + ' ' + 4); // Answer-->3 '4'

	}

}