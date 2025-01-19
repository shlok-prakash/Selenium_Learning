package test;

import constructor.Employee;

public class DemoTest {
    public static void main(String[] args) {

        //variables ---> What they possess
        //methods ---> what they can do
        //class ---> class is basically a template on which you can create multiple objects

        new Employee(); //Anonymous Object ---> nameless object or variable less object //Implicit Return Type.
        Employee employee = new Employee();
        System.out.println(employee.id);
        System.out.println(employee.companyName);
        System.out.println(employee.isPermanentEmployee);
        employee.work(); //I am calling the methods or else accessing that method
        // System.out.println(employee.isPermanentEmployee);
        //System.out.println("age = " + employee.age);
        System.out.println("**************************************************");

        Employee shlok = new Employee(1, "Shlok", "Prakash", true );
        System.out.println("Employee Id : " + shlok.id);
        System.out.println("Employee's company Name : " +shlok.companyName);
        System.out.println("Employee lastName : " +shlok.lastname);
        System.out.println("Employee firstName : " +shlok.isPermanentEmployee);
        System.out.println("**************************************************");


        Employee virat = new Employee(1, "Virat", "Kohli",37, "amazon", true);
        System.out.println("Employee's Age : " + virat.age);
        virat.work();



    }
}
