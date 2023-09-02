package functionalprogramming;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamIntermediateOperations {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Julia", "Danza", "Touchka", "Kayn", "Sparky");

        // filter: filters the stream based on a predicate.
        Stream<String> namesStartingWithA = names.stream().filter(name -> name.startsWith("D"));

        // map: applies a function to each element in the stream.
        Stream<Integer> nameLengths = names.stream().map(String::length);

        // flatMap: applies a function to each element in the stream and flattens the resulting streams into a single stream.
        List<List<String>> nestedNames = Arrays.asList(Arrays.asList("Kayn", "Gaara"), Arrays.asList("Julia", "Madara", "Danza"));
        Stream<String> flatNames = nestedNames.stream().flatMap(Collection::stream);

        // peek: performs an action on each element in the stream without modifying the stream.
        Stream<String> namesWithPeek = names.stream().peek(System.out::println);

        // limit: limits the stream to an certain number of elements.
        Stream<String> firstThreeNames = names.stream().limit(3);

        // skip: skips the first n elements in the stream.
        Stream<String> namesWithoutFirstTwo = names.stream().skip(2);

        // distinct: removes duplicate elements from the stream.
        Stream<String> distinctNames  = names.stream().distinct();

        // sorted: sorts the elements in the stream according to a comparator.
        Stream<String> sortedNames = names.stream().sorted(Comparator.naturalOrder());
    }
}
