import java.util.Scanner;

public class lab3part4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
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
	
	public  void theLunchQueue() {
		String mainCourse = getString("what would you like for lunch? fish, burgers or veg? ");
		int potatoes = getInt("how many potatoes would you like?");
		int sprouts = getInt("how many brussel sprouts would you like?");
		
		System.out.println("hello, your lunch is " + mainCourse + " with " + potatoes + " potatoes and " + sprouts + " brussel sprouts.");
	}
	
	public  void convertInputToStonesPounds(int pounds) {
		double stones = pounds % 14;
		System.out.println("your weight is " + stones + " stones");
	}
	
	public  void convertKgsToStonesPounds(int kg) {
		int pounds = kg * 2;
		convertInputToStonesPounds(pounds);

        double rate = (salary < 21000) ? 0.2 : 0.4
	}
}