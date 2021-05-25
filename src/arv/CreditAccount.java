package arv;

public class CreditAccount extends AbstractAccount {
	
	private double creditRate;
	private double amountDue = 0;
	private double creditLimit;
	
	public CreditAccount(double creditRate, double creditLimit) {
		super(0);
		this.creditRate = creditRate;
		this.creditLimit = creditLimit;
	}
	
	@Override
	public double withdraw(double amount) {
		
		if (amount <= 0) {
			throw new IllegalArgumentException("Can´t withdraw negative amount of money");
		}
		
		if (balance - amount - amountDue < creditLimit) {
			throw new IllegalArgumentException("Can´t withdraw more than credit limit");
		}
		
		balance -= amount;
		return amount;
	}
	
	
	public double applyInterest() {
		double base = amountDue;
		if (balance < 0) {
			base -= balance;
		}
		double interest = base * creditRate/12;
		amountDue += interest;
		return amountDue - balance;
	}

}
