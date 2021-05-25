package fadderuken.bar;

public class Barkeep extends Person {
	
	private static int nextEmployeeId = 0;
	private final int employeeId;
	
	
	public Barkeep(int age, String firstName, String lastName) {
		super(age, firstName, lastName);
		
		employeeId = nextEmployeeId;
		nextEmployeeId++;
	}

	public Drink serve(Person customer, Drink requestedDrink) {
		if (customer instanceof Barkeep) {
			throw new IllegalArgumentException("Cannot serve drinks to working barkeeps.");
		}
		if (customer.getAge() < 20 && requestedDrink.getABV() >= 0.22 || customer.getAge() < 18 && requestedDrink.getABV() > 0) {
			throw new IllegalArgumentException("Sorry, you are not old enough for this drink.");
		}
		if (customer.getPermille() > 2 && requestedDrink.getABV() > 0) {
			throw new IllegalStateException("You are too drunk!");
		}
		
		return requestedDrink;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", employeeID: " + employeeId;
	}
	
	public static void main(String[] args) {
		System.out.println(Barkeep.nextEmployeeId);
		Barkeep barkeep = new Barkeep(21, "Anders", "Robstad");
	}
}
