package test2_TestingMiniBytes;

import constructor.Employee;

public class ClassObjectDemoTest {
    public static void main(String[] args) {
        //Create a Object ---> Create a new employee

        Employee shlok = new Employee();
        //constructor.Employee --> class Name
        //shlok --> Reference Variable
        //new constructor.Employee(); -> object
        //new --> keyword --> Create a new Object
        //constructor.Employee() --> Constructor

        shlok.id = 1;
        shlok.age = 23;
        shlok.lastname = "Prakash";

        System.out.print(shlok.firstName);
        System.out.print(shlok.firstName);
    }
}
