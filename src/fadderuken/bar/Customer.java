package fadderuken.bar;

public class Customer extends Person {
	
	private static final double PERMILLE_PER_ALCOHOL_PERCENTLITER = 8.889;
	private Drink currentDrink;
	
	public Customer(int age, String firstName, String lastName) {
		super(age, firstName, lastName);
	}
	
	public void drink() {
		if (currentDrink == null) {
			throw new IllegalStateException("Cannot drink air. Go buy another drink");
		}
		double currentPermille = this.getPermille();
		this.setPermille(currentPermille + PERMILLE_PER_ALCOHOL_PERCENTLITER * currentDrink.getAmount() * currentDrink.getABV());
		currentDrink = null;
	}
	
	public void orderDrink(Barkeep barkeep, Drink requestedDrink) {
		try {
			currentDrink = barkeep.serve(this, requestedDrink);
		} catch (IllegalArgumentException | IllegalStateException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + ", current drink: " + currentDrink;
	}
}
