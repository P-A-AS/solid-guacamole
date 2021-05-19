package fadderuken;

public class BeerBong {
	private double capacity;
	private double amount;
	
	public BeerBong(double capacity) {
		this.capacity = capacity;
	}
	
	public void fill(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Cannot fill 0 or negative");
		}
		if (this.amount + amount > capacity) {
			throw new IllegalStateException("Please do not spill the beer!");
		}
		this.amount += amount;
	}
	
	public void chug() {
		System.out.println("BONSKI!");
		amount = 0;
	}
	
	
	
	public static void main(String[] args) {
		BeerBong bong = new BeerBong(1);
		bong.fill(0.5);
		bong.fill(0.33);
		bong.fill(0.33);
		bong.chug();
	}
}
