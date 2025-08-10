package java8_com.jv;

import java.util.*;
import java.util.stream.Collectors;

public class ANameFinder {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Andrew", "David", "Alex");

        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Names starting with 'A':");
        filteredNames.forEach(System.out::println);

	}
}
