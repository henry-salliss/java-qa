package abstractInterfaceLab;

public class Fish extends Animal implements Insurable, Consumable{
	String name;
	
	public Fish(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String describeTaste() {
		// TODO Auto-generated method stub
		return getName() + " tastes fishy";
	}

	@Override
	public String isMainCourseDisk() {
		// TODO Auto-generated method stub
		return getName() + " :" + true;
	}

	@Override
	public String getPremium() {
		// TODO Auto-generated method stub
		return "45 quid";
	}

	@Override
	public String expires() {
		// TODO Auto-generated method stub
		return "expires next week";
	}
	
}
