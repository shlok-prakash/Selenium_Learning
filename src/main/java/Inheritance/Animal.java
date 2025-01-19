package Inheritance;

public abstract class Animal {
    public int numbersOfEars=2;

    public void eat(){
        System.out.println("Eating");
    }

    public void run(){
        System.out.println("running");
    }

    public abstract void sleep(); // When a method does not have any body or implementation
}
