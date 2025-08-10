package java8_com.jv;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CustomFilterChain {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Amanda", "Anna", "Bob", "Alex", "Jessica", "Alma", "David");
        Predicate<String> startsWithA = name -> name.startsWith("A");
        Predicate<String> endsWitha = name -> name.endsWith("a");
        List<String> startsAndEndsWithA = names.stream()
                .filter(startsWithA.and(endsWitha))
                .collect(Collectors.toList());
        List<String> startsOrEndsWithA = names.stream()
                .filter(startsWithA.or(endsWitha))
                .collect(Collectors.toList());

        System.out.println("Names starting with 'A' AND ending with 'a': " + startsAndEndsWithA);
        System.out.println("Names starting with 'A' OR ending with 'a': " + startsOrEndsWithA);
    }
}
