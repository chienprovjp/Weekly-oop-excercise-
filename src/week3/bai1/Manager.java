package week3.bai1;

public class Manager extends Employee {
    protected String department;

    public Manager() {
        super();
        System.out.println("3. Manager is created");
    }

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
        System.out.println("3. Manager is created");
    }
}
