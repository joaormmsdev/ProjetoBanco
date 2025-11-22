package application;

import java.util.Scanner;

import entities.Employee;

public class program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("enter the employee name: ");
        employee.name = sc.nextLine();
        System.out.println("enter the employee salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.println("enter the salary tax: ");
        employee.tax = sc.nextDouble();

        

        System.out.println("which percentage to increse salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);
 
        System.out.println(employee);
    }
}
