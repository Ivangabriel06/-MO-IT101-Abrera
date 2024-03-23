/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mo.it101.group.abrera;

/**
 *
 * @author Ivan Gabriel Abrera
 */
import java.util.Scanner;

public class MOIT101GroupAbrera {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String employeeID = "10001";
        String fullName = "Smith, John";
        double hourlyRate = 535.71;

        System.out.println("Employee ID: " + employeeID);
        System.out.println("Full Name: " + fullName);
        System.out.println("Hourly Rate: $" + hourlyRate);

        System.out.println("Do you want to proceed with the payroll? (Y/N)");
        String userConfirmation = scanner.nextLine();

        if (userConfirmation.equalsIgnoreCase("Y")) {

            double totalHoursWorked = 80; // 40 hours per week

            double grossSalary = totalHoursWorked * hourlyRate;
            System.out.println("Gross Salary: $" + grossSalary);

            double sssContribution = 150;
            double philhealthContribution = 100;
            double totalDeductions = sssContribution + philhealthContribution;

            double netSalary = grossSalary - totalDeductions;
            System.out.println("Net Salary: $" + netSalary);
        } else {
            System.out.println("Payroll processing canceled.");
        }

        scanner.close();
    }
}
