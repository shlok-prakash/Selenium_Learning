package Inheritance;

public abstract class DomesticAnimal extends Animal{
    @Override
    public boolean isDomestic() {
        return true;
    }

    public abstract void sleep();
}
