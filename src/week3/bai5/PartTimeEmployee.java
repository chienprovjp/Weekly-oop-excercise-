package week3.bai5;

public class PartTimeEmployee extends Employee {
    protected double workingHours;
    protected double hourlyRate;

    public PartTimeEmployee(String name, double workingHours, double hourlyRate) {
        super(name);
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }

    public PartTimeEmployee(String id, String name, String dob, double workingHours, double hourlyRate) {
        super(id, name, dob);
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return workingHours * hourlyRate;
    }

    @Override
    public String getType() {
        return "Part-time";
    }
}
