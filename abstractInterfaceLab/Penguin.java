package abstractInterfaceLab;

public class Penguin extends Bird implements Consumable{

	public Penguin(String name) {
		super(name);
	}
	
	@Override
	public String describeTaste() {
		// TODO Auto-generated method stub
		return getName() + " tastes frosty";
	}

	@Override
	public String isMainCourseDisk() {
		// TODO Auto-generated method stub
		return getName() + " :" + false;
	}

}
