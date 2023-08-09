package enums;

// Enums set of named constants,
// special type of class that has a fixed number of instances.
// representing a set of values.
// Values of the enum are written in UPPERCASE
/*public enum DayOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}*/

// Enums with members
public enum DayOfWeek {
    MONDAY("Monday", 1),
    TUESDAY("Tuesday" , 2),
    WEDNESDAY("Wednesday", 3),
    THURSDAY("Thursday", 4),
    FRIDAY("Friday", 5),
    SATURDAY("Saturday", 6),
    SUNDAY("Sunday", 7);

    private final String fullName;
    private final int nrOfDay;

    DayOfWeek(String fullName, int nrOfDay){
        System.out.println("In constructor enum: " + fullName);
        this.fullName = fullName;
        this.nrOfDay = nrOfDay;
    }

    public String getFullName(){
        return this.fullName;
    }

    public boolean isWeekend(){
        return this == SATURDAY || this == SUNDAY;
    }

    // Just when i deep dive to understand Enum I create this because Enums are actually classes
    /*public static void main(String[] args) {
        System.out.println("Run our enums!");
    }*/
}
