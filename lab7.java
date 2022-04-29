package day1;

public class lab7 {
	public void start() {
		int[] numbers = {1,3,-5,7,0,4,6,8};
		
		sumArray(numbers);
		averageOfArray(numbers);
		maximumNumOfArray(numbers);
		minimumNumOfArray(numbers);
		findIndex(numbers);
	}
	
	public void sumArray(int[] numbers) {
		int sum = 0;
		for(int i = 0; i < numbers.length; i++) {
			sum+= numbers[i];
		}
		
		System.out.println(sum);
	}
	
	public void averageOfArray(int[] numbers) {
		int sum = 0;
		for(int i = 0; i < numbers.length; i++) {
			sum+= numbers[i];
		}
		
		int average = sum / numbers.length;
		
		System.out.println(average);
	}
	
	public void maximumNumOfArray(int[] numbers) {
		int maximum = 0;
		
		for(int num : numbers) {
			if(num > maximum) {
				maximum = num;
			}
			else {
				continue;
			}
		}
		
		System.out.println(maximum);
	}
	
	public void minimumNumOfArray(int[] numbers) {
		int minimum = 0;
		
		for(int num : numbers) {
			if(num < minimum) {
				minimum = num;
			}
			else {
				continue;
			}
		}
		
		System.out.println(minimum);
	}
	
	public void findIndex(int[] numbers) {
		int index = 0;
			for(int i = 0; i < numbers.length; i++) {
				if(numbers[i] == 0) {
					index = i;
				}
			}
		System.out.println(index);
	}
}
