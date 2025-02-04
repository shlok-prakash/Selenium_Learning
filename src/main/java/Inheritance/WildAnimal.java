package Inheritance;

public abstract class WildAnimal extends Animal {

    @Override
    public boolean isDomestic() {
        return false;
    }

    public abstract void sleep();
}
