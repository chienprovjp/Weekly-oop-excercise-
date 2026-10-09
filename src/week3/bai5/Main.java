package week3.bai5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int n = scanner.nextInt();
        scanner.nextLine();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine().trim();
            while (line.isEmpty() && scanner.hasNextLine()) {
                line = scanner.nextLine().trim();
            }

            char type = line.charAt(0);
            int firstQuote = line.indexOf('"');
            int lastQuote = line.lastIndexOf('"');
            String name = line.substring(firstQuote + 1, lastQuote);
            String rest = line.substring(lastQuote + 1).trim();
            String[] parts = rest.split("\\s+");

            if (type == 'F' || type == 'f') {
                double baseSalary = Double.parseDouble(parts[0]);
                double bonus = Double.parseDouble(parts[1]);
                double penalty = Double.parseDouble(parts[2]);
                employees[i] = new FullTimeEmployee(name, baseSalary, bonus, penalty);
            } else if (type == 'P' || type == 'p') {
                double workingHours = Double.parseDouble(parts[0]);
                double hourlyRate = Double.parseDouble(parts[1]);
                employees[i] = new PartTimeEmployee(name, workingHours, hourlyRate);
            }
        }

        for (Employee emp : employees) {
            if (emp != null) {
                System.out.println(emp.getName() + " - " + emp.getType() + " - " + emp.calculateSalary());
            }
        }

        scanner.close();
    }
}
