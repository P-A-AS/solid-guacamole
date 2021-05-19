package fadderuken.bar;

public abstract class Person {
	private int age;
	private String firstName;
	private String lastName;
	private double permille;
	
	protected Person(int age, String firstName, String lastName) {
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.permille = 0.0;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getPermille() {
		return permille;
	}

	public void setPermille(double permille) {
		this.permille = permille;
	}

	@Override
	public String toString() {
		return String.format("%s %s, permille: %s", firstName, lastName, permille);
	}
}
