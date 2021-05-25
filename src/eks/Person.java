package eks;

import java.util.ArrayList;
import java.util.List;

public class Person implements Comparable<Person> {

	int age;
	String name;
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	
	@Override
	public int compareTo(Person o) {
		return this.age - o.age;
	}
	
	
	
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<Person>();
		
		
		persons.sort(null);
		
		
		
		persons.sort(new PersonComparator());
	
	}
}
