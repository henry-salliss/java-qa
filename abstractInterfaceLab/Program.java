package abstractInterfaceLab;

public class Program {

	public static void main(String[] args) {
		Duck d1 = new Duck("ducky");
		Penguin p1 = new Penguin("pingu");
		Fish f1 = new Fish("nemo");
		Animal[] animals = {d1,p1,f1};
		processAnimals(animals);
	}
	
	static public void processAnimals(Animal[] animals) {
		for(Animal a :animals) {
			if(a instanceof Consumable) {
				Consumable c = (Consumable)a;
				String taste = c.describeTaste();
				String isMain = c.isMainCourseDisk();
				System.out.println(taste);
				System.out.println(isMain);
				System.out.println();
			}
			if(a instanceof Insurable) {
				Insurable i = (Insurable)a;
				String expires = i.expires();
				String premium = i.getPremium();
				System.out.println(expires);
				System.out.println(premium);
				System.out.println();
			}
		}
	}

}
