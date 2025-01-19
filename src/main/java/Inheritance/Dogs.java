package Inheritance;

public class Dogs extends Animal { //child for animal parent class

    @Override
    public void eat(){
        System.out.println("I am a dog and I eat pedigree");
    }

    @Override
    public void sleep(){
        System.out.println("I Can sleep for 3 hours only");
    }

    public void bark(){
        System.out.println("I am barking");
    }

}
