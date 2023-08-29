package lambdaexpressions;

public class Main {
    public static void main(String[] args) {
        Calculator c1 = (x, y) -> x + y ;
        Calculator c2 = (x, y) -> x - y ;
        System.out.println(c1.calculate(3,5));
        System.out.println(c2.calculate(3,5));
        Calculator c3 = (x,y) -> {
            System.out.println("Hello from the lambda expression");
            return x * y;
        };
        System.out.println(c3.calculate(3,5));

        Printer p1 = s -> System.out.println("Printer says: " + s);
        p1.print("Hello!");

        NumberProvider np1 = () -> 42;
        System.out.println(np1.provider());
    }
}
