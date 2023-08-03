package oop;


// extends for Inheritance
// which mean that the class dog have the ability to inherit properties and methods from a parent class.
public class Dog extends Animal{
    public static String type = "Dog";


    @Override
    public void eat( ){
        System.out.println("Dog is eating");
    }
    // Overloading providing multiple methods with the same name,
    // but different signatures due to a different parameter list.
    public void eat(String food){
        System.out.println("Dog is eating " + food);
    }

    public void bark(){
        System.out.println("woof woof");
    }
}
