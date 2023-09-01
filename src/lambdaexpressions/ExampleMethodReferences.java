package lambdaexpressions;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ExampleMethodReferences {
    public static void main(String[] args) {
        // reference to a static method
        Function<Integer, String> nrToHexString = i -> Integer.toHexString(i);
        Function<Integer, String> nrToHexStringMethodReference = Integer::toHexString;
        System.out.println(nrToHexStringMethodReference.apply(256));

        // reference to an instance method of a particular object
        String prefix = "Hello ";
        Function<String, String> greet = s -> prefix + s;
        Function<String, String> greetMethodReference  = prefix::concat;
        System.out.println(greetMethodReference.apply("you"));

        // reference to an instance method of an arbitray object of a particular type
        BiFunction<String, String, Integer> stringComparator = (s1, s2) -> s1.compareToIgnoreCase(s2);
        BiFunction<String, String, Integer> stringComparatorMethodReference = String::compareToIgnoreCase;
        System.out.println(stringComparatorMethodReference.apply("Hi", "hi"));

        // reference to a constructor
        Supplier<ArrayList<String>> listSupplier = ArrayList::new;
        ArrayList<String> names = listSupplier.get();
        names.add("Maaike");
        System.out.println(names.get(0));
    }
}
