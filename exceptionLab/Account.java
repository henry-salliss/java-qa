package ExceptionLab;

public class Account {
	int id;
	double balance;
	String owner;
	
	public Account(int id, double balance, String owner) {
		this.id = id;
		this.balance = balance;
		this.owner = owner;
	}
	
	public void withdraw(double amount) {
		if(amount > balance) {
			throw new IllegalArgumentException("cant take more than you have");
		}
		else {
			balance -= amount;
			System.out.println("new balance: " + balance);			
		}
	}
	
	public void deposit(double amount) {
		balance += amount;
		System.out.println("new balance: " + balance);
	}
	
	public void close() {
		System.out.println("account " + id + " is closed");
	}
	
	public void getDetails() {
		System.out.println("id: " + id + "\nbalance: " + balance + "\nowner: " + owner);
	}
	

}
