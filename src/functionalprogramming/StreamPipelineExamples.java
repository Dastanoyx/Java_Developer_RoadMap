package functionalprogramming;

import java.util.*;
import java.util.stream.Collectors;

public class StreamPipelineExamples {
    public static void main(String[] args) {
        // Example 1 : Filtering and collecting a list of names
        List<String> names = Arrays.asList("Danza", "Julia", "Touchka", "Kayn", "Sparky");
        List<String> namesStartingWithD = names.stream()
                .filter(name -> name.startsWith("D"))
                .collect(Collectors.toList());
        System.out.println(namesStartingWithD);

        // Example 2 : Finding the longest name
        Optional<String> longestName = names.stream()
                .max(Comparator.comparingInt(String::length));
        System.out.println(longestName);

        // Example 3 : Transforming a list of strings into a set of integers
        Set<Integer> uniqueIntegers = names.stream()
                .map(String::length)
                .distinct()
                .collect(Collectors.toSet());
        System.out.println(uniqueIntegers);

        // Example 4 : Concatenating strings with a custom separator
        String concatenatedNames = names.stream()
                .collect(Collectors.joining(", "));
        System.out.println(concatenatedNames);
    }
}
