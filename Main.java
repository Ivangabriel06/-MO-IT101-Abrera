/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mo.it101.group.abrera;

/**
 *
 * @author Ivan Gabriel Abrera
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");
        Employee emp = new Employee();

     
        emp.setID("10001");
        emp.setFullName("Smith", "John");
        emp.setBasicSalary(90000);
        emp.setRiceSubsidy(1500);
        emp.setPhoneAllowance(2000);
        emp.setClothingAllowance(1000);
        emp.setHourlyRate(535.71);

      
        UserInput payrollUser = new UserInput();
        
        String qID = payrollUser.validateID(scanner);
        
        emp.displayInfo();

        scanner.close();
    }
}

class UserInput {
    public String validateID(Scanner scanner) {
        System.out.println("TASK 7: Enter Employee ID: (e.g. 10001)");
        String userInput = scanner.nextLine();
        return userInput.equals("10001") ? userInput : validateID(scanner);
    }
}

class Employee {
    private String ID;
    private String lastName;
    private String firstName;
    private double basicSalary;
    private double riceSubsidy;
    private double phoneAllowance;
    private double clothingAllowance;
    private double hourlyRate;

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setFullName(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void setRiceSubsidy(double riceSubsidy) {
        this.riceSubsidy = riceSubsidy;
    }

    public void setPhoneAllowance(double phoneAllowance) {
        this.phoneAllowance = phoneAllowance;
    }

    public void setClothingAllowance(double clothingAllowance) {
        this.clothingAllowance = clothingAllowance;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void displayInfo() {
        System.out.println("Last Name: " + lastName +
                "\nFirst Name: " + firstName +
                "\nBasic Salary: " + basicSalary +
                "\nRice Subsidy: " + riceSubsidy +
                "\nPhone Allowance: " + phoneAllowance +
                "\nClothing Allowance: " + clothingAllowance +
                "\nHourly Rate: " + hourlyRate);
    }
}