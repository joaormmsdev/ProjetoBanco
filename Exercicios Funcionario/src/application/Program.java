package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Worker;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Enter department's name: ");
        String departament = sc.nextLine();

        System.out.println("Enter wirker data: ");
        sc.nextLine();
        String name = sc.nextLine();
        sc.nextLine();
        String level = sc.nextLine();
        sc.nextLine();
        double baseSalary = sc.nextInt();


    }
}
