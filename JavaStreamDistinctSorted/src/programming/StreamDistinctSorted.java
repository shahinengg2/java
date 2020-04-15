package programming;

import java.util.List;

public class StreamDistinctSorted {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		System.out.println("............Distinct Result...........");
		numbers.stream().distinct().forEach(System.out::println);
		
		System.out.println("............Sorted Result...........");
		numbers.stream().sorted().forEach(System.out::println);
		
		System.out.println("............Distinct and Sorted Result...........");
		numbers.stream().distinct().sorted().forEach(System.out::println);
	}
}
