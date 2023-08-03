package oop;

public class Cat extends Animal{

    public static String type = "Cat";

    //Overriding concept : same method signature in the child class
    // as you have in the parent class
    @Override
    public void eat(){
        System.out.println("Cat is eating");
    }
}
