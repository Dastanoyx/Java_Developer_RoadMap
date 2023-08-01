package workingwithstrings;

public class ExampleStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Yassin");
        sb.append(" loves Java");

        String s = sb.toString();

        StringBuilder sb1 = new StringBuilder("Hello");
        sb.append(", ");
        sb1.append("World");
        sb1.append("!");
        String greeting = sb1.toString();

    }
}
