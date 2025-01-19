package test2_TestingMiniBytes;

import Encapsulation.Student;

public class EncapsulationTest {
    public static void main(String[] args) {

        Student student = new Student("Shlok", 5);
        student.setEmail("lord@gmail.com");
        System.out.println(student.fName);
        System.out.println(student.getEmail());


    }
}
