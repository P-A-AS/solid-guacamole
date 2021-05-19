package fadderuken.bar;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Bar {
	private final Collection<Person> coronaRegistry = new HashSet<Person>();
	private final Set<Customer> customers = new HashSet<Customer>();
	
	
	public static void main(String[] args) {
		Bar bar = new Bar();
		
		Barkeep barkeep = new Barkeep(32, "Karl Gunnar", "Hanssen");
		
		Customer petter = new Customer(21, "Petter Charles", "Redfern");
		Customer anders = new Customer(21, "Anders", "Robstad");
		
		bar.customers.add(petter);
		bar.customers.add(anders);

		bar.coronaRegistry.add(barkeep);
		bar.coronaRegistry.addAll(bar.customers);
		
		// Bargjestene starter dagen hardt med shots, og følger opp med noe øl
		bar.customers.forEach(customer -> customer.orderDrink(barkeep, new Fireball()));
		bar.customers.forEach(Customer::drink);
		bar.customers.forEach(customer -> customer.orderDrink(barkeep, new Beer()));
		
		// Anders chugger pilsen direkte
		anders.drink();
		
		// Statusrapport
		bar.customers.forEach(System.out::println);
		
		// Shottekonkurranse
		for (Customer customer : bar.customers) {
			for (int i = 0; i < 10; i++) {
				customer.orderDrink(barkeep, new Fireball());
				customer.drink();
			}
		}
		
		// Statusrapport
		bar.customers.forEach(System.out::println);
				
		// Petter går bananas på pilsen og starter waterfall med seg selv
		petter.orderDrink(barkeep, new Beer());
		petter.drink();
		petter.orderDrink(barkeep, new Beer());
		petter.drink();
		petter.orderDrink(barkeep, new Beer());
		petter.drink();
		petter.orderDrink(barkeep, new Beer());
		petter.drink();
		petter.orderDrink(barkeep, new Beer());
		petter.drink();
		petter.orderDrink(barkeep, new Beer());
		petter.drink();
	}
}
