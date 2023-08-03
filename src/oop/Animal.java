package oop;

public class Animal {
    //here for inheritance
    /*public String name;
    public String age;
    public int nrOfEyes;*/

    // here for encapsulation
    // encapsulation is private properties combined with public getters and setters
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
