package abstractInterfaceLab;

public class Duck extends Bird implements Insurable{

	public Duck(String name) {
		super(name);
	}

	@Override
	public String getPremium() {
		// TODO Auto-generated method stub
		return "15 pounds";
	}

	@Override
	public String expires() {
		// TODO Auto-generated method stub
		return "expires tomorrow, you better eat it soon";
	}

}
