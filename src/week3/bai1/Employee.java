package week3.bai1;

public class Employee extends Person {
    protected double salary;

    public Employee() {
        super("Unknown");
        System.out.println("2. Employee is created");
    }

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
        System.out.println("2. Employee is created");
    }
}
