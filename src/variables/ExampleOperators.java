package variables;

public class ExampleOperators {
    public static void main(String[] args){

        // arithmetic operators
        int x = 2;
        int y = 3;
        int z = x + y;
        System.out.println(z);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);

        // assignment operators
        int nr3 = 7;
        int nr4 = 70;
        nr3 -= nr4;
        System.out.println(nr3);


        // unary operators
        int nr5 = 8;
        nr5--;
        System.out.println(nr5);

        int nr6 = 3;
        System.out.println(-nr6);
        System.out.println(nr6 );

        int pre = 5;
        int post = 5;
        System.out.println(++pre);
        System.out.println(post++);
        System.out.println(post);

        // relational operators
        int small = 2;
        int big = 10;
        System.out.println(small <= big);
    }
}
