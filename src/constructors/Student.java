package constructors;

public class Student extends Person{
    private int age;
    private String studentNr;

    // When a class has a custom contructor, the default constructor won't be added.
    //Custom constructor
    public Student(String name, int age){
        this(name, age, "0");
    }
    // classes can have multiple constructors
    public Student (String name, int age, String studentNr){
        super(name);
        this.age = age;
        this.studentNr = studentNr;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
