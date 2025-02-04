package Inheritance;

public abstract class Animal {
    public int numbersOfEars=2;

    public abstract boolean isDomestic();

    public final void eat(){
        System.out.println("Eating");//all the child
    }

    public void run(){
        System.out.println("running");
    }

    public abstract void sleep(); // When a method does not have any body or implementation
}
