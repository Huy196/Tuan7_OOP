package Th1;

public class Employee extends Person{
    public Employee(){
        this("Employee overloading its tasks !");
        System.out.println("Person performing its tasks !");
    }

    public Employee(String s) {
        System.out.println(s);
    }
}
