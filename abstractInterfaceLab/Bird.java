package abstractInterfaceLab;

abstract public class Bird extends Animal implements Consumable{
	String name;
	
	public Bird(String name) {
		this.name = name;
		super.animalType = AnimalType.Bird;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String describeTaste() {
		// TODO Auto-generated method stub
		return getName() + " tastes cracking";
	}

	@Override
	public String isMainCourseDisk() {
		// TODO Auto-generated method stub
		return getName() + " : " + true;
	}
}
