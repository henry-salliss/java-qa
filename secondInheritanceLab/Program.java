package moreInheritance;

public class Program {

	public static void main(String[] args) {
		Car c1 = new Car("mazda", 50);
		Car c2 = new Car("ford", 40);
		RacingCar rc1 = new RacingCar("mclaren", 120, "henry", 2);
		RacingCar rc2 = new RacingCar("ferrari", 140, "tobi", 2);
		Car[] cars = {c1,c2,rc1,rc2};
		processCars(cars);
		
		Manager m1 = new Manager("henry", "g thang");
		Employee e1 = new Employee("tobi", "CEO");
		Employee e2 = new Employee("molly", "social media admin");
		Employee e3 = new Employee("Richard", "Sales director");
		
		m1.addEmployee(e1);
		m1.addEmployee(e2);
		m1.addEmployee(e3);
		
		SkilledWorker s1 = new SkilledWorker("annabel", "midwife");
		s1.addSkill("baby delivery");
		s1.addSkill("medical aptitude");
		s1.addSkill("medical admin");
		
		m1.addEmployee(s1);
		m1.getInfo();
		
		
		
	}
	
	public static void processCars(Car[] cars) {
		for(Car car :cars) {
			car.getToSixty();
			car.accelerate(2);
			String model = car.getModel();
			int speed = car.getSpeed();
			System.out.println("model: " + model + " speed: " + speed);
			
			if(car instanceof RacingCar) {
				RacingCar rc = (RacingCar)car;
				String driver = rc.getDriver();
				System.out.println("driver: " + driver);
			}
		}
	}

	
}
