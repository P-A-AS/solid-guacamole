package eks;

import java.util.List;
import java.util.stream.Collectors;

public class StreamEksempel {

	
	public static void main(String[] args) {
		List<Integer> integers = List.of(1,2,3,4,5,6,7,8,9,10);
		
		
		List<Integer> evens = integers.stream()
					.filter(i -> i % 2 == 0)
					.collect(Collectors.toList());
		
		int sumEvens = evens.stream()
					.reduce(0, (sum, num) -> sum + num);
		
		
		System.out.println("Sum even: " + sumEvens);
		
		
		
		
		integers.forEach(System.out::print);
		
		//integers.forEach(i -> System.out.print(i));
		
		
		
		List<Integer> sorted = integers.stream()
				.filter(i -> i%2==0)
				.sorted((n1, n2) -> n2 - n1)
				.collect(Collectors.toList());
		
		System.out.println();
		System.out.println("sortert liste: " + sorted);
		
		
		
		List<Integer> squares = integers.stream()
				.map(i -> i*i)
				.collect(Collectors.toList());
		System.out.println(squares);
	}
}
