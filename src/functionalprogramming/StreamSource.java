package functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamSource {
    public static void main(String[] args) {
        // Creating a stream from a collection
        List<String> names = Arrays.asList("Yassin", "Danza", "Julia");
        Stream<String> namesStream = names.stream();

        // Creating a stream from an array
        String[] namesArrays = {"Yassin", "Danza", "Julia"};
        Stream<String> namesArrayStream = Arrays.stream(namesArrays);

        // Creating a stream using the Stream.iterate() method
        Stream<Integer> infiniteStream  = Stream.iterate(0, n -> n + 1 );

        // Creating a stream using the Stream.generate() method
        Stream<Double> randomNumbersStream = Stream.generate(Math::random);
    }
}
