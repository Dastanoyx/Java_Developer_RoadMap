package oop;

public class Animal {
    //here for inheritance
    /*public String name;
    public String age;
    public int nrOfEyes;*/

    // note about the abstraction
    // allows for being able to use it without having to know the exact implementation

    // here for encapsulation
    // encapsulation is private properties combined with public getters and setters

    //Hiding a static memeber of a parent class
    // with a static memeber of the same name in a child class
    public static String type = "animal";
    private String name;
    private int age;
    private int nrOfEyes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public int getNrOfEyes() {
        return nrOfEyes;
    }

    public void setNrOfEyes(int nrOfEyes) {
        this.nrOfEyes = nrOfEyes;
    }

    public void eat(){
        System.out.println("Animal eating");
    }
}
