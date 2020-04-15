package programming;

import java.util.Comparator;
import java.util.List;

public class JavaStreamComparator {

	public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot","API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
		
		System.out.println("............String sorted...........");
		courses.stream().sorted().forEach(System.out::println);

		System.out.println("............sorting using naturalOrder...........");
		courses.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		
		System.out.println("............sorting using reverseOrder...........");
		courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		System.out.println("............sorting using Custom Sort...........");
		courses.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println);
	}

}
