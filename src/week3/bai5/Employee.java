package week3.bai5;

public abstract class Employee {
    protected String id;
    protected String name;
    protected String dob;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String id, String name, String dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public abstract double calculateSalary();

    public abstract String getType();
}
