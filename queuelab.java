public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		buy();
//		processBaskets();
//		System.out.println(baskets);
		
		Zoo z = new Zoo();
		
	}
	
	static ArrayDeque<ShoppingBasket> baskets = new ArrayDeque<>();
	
	static void buy() {
		ShoppingBasket sb1 = new ShoppingBasket("Milk", 1, 2.5);
		ShoppingBasket sb2 = new ShoppingBasket("Chocolate", 3, 3);
		ShoppingBasket sb3 = new ShoppingBasket("Brioche", 10, 0.5);
		baskets.push(sb1);
		baskets.push(sb2);
		baskets.push(sb3);
		System.out.println(baskets);
	}
	
	static void processBaskets() {
		for(ShoppingBasket basket :baskets) {
			basket.getDetails();
			baskets.remove(basket);
		}
		
	}

}


public class ShoppingBasket {
	String productName;
	int quantity;
	double price;
	
	public ShoppingBasket(String productName, int quantity, double price) {
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}
	
	public void getDetails() {
		System.out.println("product: " + productName);
		System.out.println("Quantity: " + quantity);
		System.out.println("Price: " + price);
	}
}


package lab11;

import java.util.HashMap;

public class Zoo {
	HashMap<String, Integer> animalMap = null;
	String[] originalAnimals = {"Zebra", "Lion", "Buffalo"};
	String[] newAnimals = {"Zebra", "Gazelle", "Buffalo", "Zebra"};
	
	public Zoo() {
		animalMap = new HashMap<>();
		addAnimals(originalAnimals);
		addAnimals(newAnimals);
		
	}
	
	public void addAnimals(String[] animals) {
		for(String animal :animals) {
			if(!animalMap.containsKey(animal)) {
				animalMap.put(animal, 1);				
			}
			else {
				animalMap.put(animal, animalMap.get(animal) + 1);
			}
		}
		System.out.println(animalMap);
	}
}
