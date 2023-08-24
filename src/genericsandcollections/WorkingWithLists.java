package genericsandcollections;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("eggs");
        shoppingList.add("pasta");
        shoppingList.add("bananas");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(10);
        numbers.add(100);


        System.out.println(shoppingList);
        System.out.println(numbers);

        System.out.println(shoppingList.get(0));
        shoppingList.remove("pasta");
        System.out.println(shoppingList);
        boolean containBananas = shoppingList.contains("bananas");
        System.out.println(containBananas);
    }
}
