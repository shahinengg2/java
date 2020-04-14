package programming;

import java.util.List;
import java.util.function.Consumer;

public class FP01Functional {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		List<String> courses = List.of("Spring", "Spring Boot","API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
		//printAllNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
		//printAllNumbersInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
		
		printAllNumbersInListFunctional(numbers);
		printAllEvenNumbersInListFunctional(numbers);
		printAllOddNumbersInListFunctional(numbers);
		printAllCoursesInListFunctional(courses);
		printAllCoursesWithSpringInListFunctional(courses);
		printAllCourseWithAtleast4LettersInListFunctional(courses);		
		printAllEvenNumberSquareData(numbers);
		printAllOddNumberSquareData(numbers);
	}

	

	



	private static void printAllEvenNumberSquareData(List<Integer> numbers) {
		System.out.println("Printing all EVEN number with SQUARE VALUE...............");
		numbers.stream()
			   .filter(number->number%2==0)
			   .map(number->number*number)
			   .forEach(System.out::println);
		
	}
	
	private static void printAllOddNumberSquareData(List<Integer> numbers) {
		System.out.println("Printing all ODD number with SQUARE VALUE...............");
		numbers.stream()
			   .filter(number->number%2!=0)
			   .map(number->number*number)
			   .forEach(System.out::println);
		
	}







	private static void printAllNumbersInListFunctional(List<Integer> numbers) 
	{
		System.out.println("Printing all number...............");
		numbers.stream().forEach(System.out::println);
	}
	
	private static void printAllEvenNumbersInListFunctional(List<Integer> numbers) {
		System.out.println("Printing all EVEN number...............");
		numbers.stream()
				.filter(number -> number%2==0)
				.forEach(System.out::println);
	}

	private static void printAllOddNumbersInListFunctional(List<Integer> numbers) {
		System.out.println("Printing all ODD number...............");
		numbers.stream()
			   .filter(number ->number%2!=0)
			   .forEach(System.out::println);
		
	}
	
	private static void printAllCoursesInListFunctional(List<String> courses) {
		System.out.println("Printing all courses...............");
		courses.stream()
			.forEach(System.out::println);
	}
	
	private static void printAllCoursesWithSpringInListFunctional(List<String> courses) {
		System.out.println("Printing all String containing Spring...............");
		courses.stream()
			   .filter(course -> course.contains("Spring"))
			   .forEach(System.out::println);
	}
	
	private static void printAllCourseWithAtleast4LettersInListFunctional(List<String> courses) {
		
		System.out.println("Printing all courses containing at least 4 letters..............");
		courses.stream()
			   .filter(course->course.length()>=4)
			   .forEach(System.out::println);
	}

	private static void print(int number) {
		System.out.println(number);
	}	
	
	
	

	
	
	

}
