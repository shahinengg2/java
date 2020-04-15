package programming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamFunctionalInterface {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		System.out.println("###############   Using Stream and Lamda Expression ##############");
		
		numbers.stream().filter(x -> x%2 == 0).map(x -> x * x).forEach(System.out::println);
		
		
		System.out.println("###############   Using Stream and Functional Interfaces implementation ##############");
		
		Predicate<Integer> isEvenPredicate = x -> x%2 == 0;
		
		Function<Integer, Integer> squareFunction = x -> x * x;
		
		Consumer<Integer> sysoutConsumer = System.out::println;
		
		numbers.stream()
			   .filter(isEvenPredicate)
			   .map(squareFunction)
			   .forEach(sysoutConsumer);
		

		System.out.println("###############   Using Stream and Customized Functional Interfaces implementation ##############");
		Predicate<Integer> isEvenPredicate2 = new Predicate<Integer>() {
			//x -> x%2 == 0;
			@Override
			public boolean test(Integer x) {				
				return x%2==0;
			}
		};
		
		Function<Integer, Integer> squareFunction2 = new Function<Integer, Integer>(){
			//x -> x * x;
			@Override
			public Integer apply(Integer x) {				
				return x * x;
			}
		};
		
		Consumer<Integer> sysoutConsumer2 = new Consumer<Integer>() {
			//System.out::println;			
			@Override
			public void accept(Integer x) {				
				System.out.println(x);
			}			
		};
		
		numbers.stream()
			   .filter(isEvenPredicate2)
			   .map(squareFunction2)
			   .forEach(sysoutConsumer2);
		

	}

}
