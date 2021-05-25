package arv;

public abstract class AbstractAccount {
	
	protected double balance = 0;
	private double rate;
	
	protected AbstractAccount(double rate) {
		this.rate = rate;
	}
	
	
	public double withdraw(double amount) {
		
		if (balance - amount < 0) {
			throw new IllegalArgumentException("Can´t withdraw more than you have on your account");
		}
		
		if (amount <= 0) {
			throw new IllegalArgumentException("Can´t withdraw negative amount of money");
		}
		
		
		balance -= amount;
		return amount;
	}
	
	public double deposit(double amount) {
		
		if (amount <= 0) {
			throw new IllegalArgumentException("Can´t deposit negative amount of money");
		}
		
		balance += amount;
		return balance;
	}
	
	public double nextYear() {
		balance += balance * rate;
		return balance;
	}
	
	public double getBalance() {
		return this.balance;
	}
}
