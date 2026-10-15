package week4.bai3;

import java.util.Scanner;

interface IWorkable {
    void work();
}

abstract class Employee implements IWorkable {
    protected String id;
    protected String name;
    protected double baseSalary;

    public Employee(String id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public abstract double calculatePay();

}

class OfficeWorker extends Employee {
    public OfficeWorker(String id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }

    @Override
    public double calculatePay() {
        return baseSalary;
    }

    @Override
    public void work() {
        System.out.println("Soạn thảo văn bản");
    }
}

class Technician extends Employee {
    private double overtimeHours;

    public Technician(String id, String name, double baseSalary, double overtimeHours) {
        super(id, name, baseSalary);
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double calculatePay() {
        return baseSalary + overtimeHours * 20000;
    }

    @Override
    public void work() {
        System.out.println("Lắp đặt thiết bị");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            String type = scanner.next();
            String id = scanner.next();
            String name = scanner.next();
            double baseSalary = scanner.nextDouble();

            if (type.equalsIgnoreCase("O")) {
                employees[i] = new OfficeWorker(id, name, baseSalary);
            } else if (type.equalsIgnoreCase("T")) {
                double overtime = scanner.nextDouble();
                employees[i] = new Technician(id, name, baseSalary, overtime);
            }
        }

        double totalPay = 0;
        for (Employee emp : employees) {
            double pay = emp.calculatePay();
            totalPay += pay;
            System.out.println(emp.getName() + " - Pay: " + pay);
            emp.work();
            System.out.println();
        }

        System.out.println("Total Pay = " + totalPay);
        scanner.close();
    }
}