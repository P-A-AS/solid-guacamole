package fadderuken.bar;

public abstract class Drink {
	private final double ABV;
	private final double amount;
	
	protected Drink(double ABV, double amount) {
		this.ABV = ABV;
		this.amount = amount;
	}
	
	public double getABV() {
		return ABV;
	}
	
	public double getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		return this.getClass().getName().split("\\.")[2];
	}
}
