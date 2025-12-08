package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Worker;
import entities_enums.WorkerLevel;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Enter department's name: ");
        String departament = sc.nextLine();

        System.out.println("Enter wirker data: ");

        System.out.println("Name");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.println("Level");
        sc.nextLine();
        String level = sc.nextLine();

        System.out.println("Base Salary");
        sc.nextLine();
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(name, level.valueOf(level), baseSalary, new Departament(departament));


    }
}
