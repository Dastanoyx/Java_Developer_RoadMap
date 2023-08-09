package enums;

public class App {
    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.SUNDAY;
        DayOfWeek day2 = DayOfWeek.FRIDAY;

        if (day == day2){
            System.out.println("The same day!");
        } else {
            System.out.println("Not the same day!");
        }

        // built-in methods toString(), ordinal(), values()
        System.out.println(day.ordinal());
    }
}
