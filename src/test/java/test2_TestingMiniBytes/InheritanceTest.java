package test2_TestingMiniBytes;

import Inheritance.Animal;
import Inheritance.Cat;
import Inheritance.Dogs;

public class InheritanceTest {
    public static void main(String[] args) {

//        Cat cat = new Cat();
//        cat.eat();
//        cat.run();
//        System.out.println(cat.numbersOfEars);
//        cat.sleep();
//
//        Dogs dog = new Dogs();
//        dog.eat();
//        dog.run();
//        System.out.println(dog.numbersOfEars);
//
//        Animal dog2;
//        Animal dog3;  //after abstract method
//
//        dog2 = new Dogs();
//        dog3 = new Cat();
//        dog2.eat();
//        dog2.run();
//        System.out.println(dog2.numbersOfEars);
//
//        //dog2.sleep(); ---> //this will throw an error since the implementation is in the child class.
//        //so we use abstract class
//
//        dog2.sleep();
//        dog3.sleep();

        //SUMMARY
            // we use inheritance ---> similarities in the classes
            //not only using this code reusability
            //IS A RELATIONSHIP
            //object with parent reference type -->  liberty to create child object at run time
            // method overriding  --> Method in parent class --> don't want that behaviour --> child is implementing its own behaviour
            //method overriding --> over ride the method present in parent class and provide its own implementation --- >>> Dynamic Polymorphism
            //method overloading --> same method name with different number of parameter  ---->>> static polymorphism
            //

        Dogs dog = new Dogs();
        dog.eat();
        dog.sleep();

        Animal dog2 = new Dogs(); // Upcasting --> implicitly
        dog2.eat();
        dog2.sleep();

        ((Dogs)dog2).bark(); //downcasting

    }
}



