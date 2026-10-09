package week3.bai5;

public class FullTimeEmployee extends Employee {
    protected double baseSalary;
    protected double bonus;
    protected double penalty;

    public FullTimeEmployee(String name, double baseSalary, double bonus, double penalty) {
        super(name);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.penalty = penalty;
    }

    public FullTimeEmployee(String id, String name, String dob, double baseSalary, double bonus, double penalty) {
        super(id, name, dob);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.penalty = penalty;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (bonus - penalty);
    }

    @Override
    public String getType() {
        return "Full-time";
    }
}
