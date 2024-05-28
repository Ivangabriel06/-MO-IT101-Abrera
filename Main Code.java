/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mo.it101.group.abrera;

/**
 *
 * @author Ivan Gabriel Abrera
 */
public class Main {
    public static void Main(String[] args) {
        
        Department dept = new Department();
        dept.setDepartmentID("D001");
        dept.setName("Engineering");

        Position position = new Position();
        position.setPositionID("P001");
        position.setTitle("Software Engineer");
        position.setDescription("Develops software solutions");

        Salary salary = new Salary();
        salary.setSalaryID("S001");
        salary.setBaseSalary(50000);
        salary.setBonuses(5000);
        salary.setDeductions(2000);

        Employee emp = new Employee();
        emp.setEmployeeID("E001");
        emp.setName("John Doe");
        emp.setDepartment(dept);
        emp.setPosition(position);
        emp.setSalary(salary);

        
        dept.addEmployee(emp);

        
        System.out.println("Employee ID: " + emp.getEmployeeID());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Department: " + emp.getDepartment().getName());
        System.out.println("Position: " + emp.getPosition().getTitle());
        System.out.println("Net Salary: " + emp.getSalary().calculateNetSalary());
    }
}
