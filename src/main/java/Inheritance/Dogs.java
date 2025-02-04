package Inheritance;

public class Dogs extends DomesticAnimal { //child for animal parent class

    @Override
    public void sleep(){
        System.out.println("I Can sleep for 3 hours only");
    }

    public void bark(){
        System.out.println("I am barking");
    }

}
