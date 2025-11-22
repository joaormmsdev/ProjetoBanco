package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class program3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Student student = new Student();

        System.out.println("Enter the student name: ");
        student.name = sc.nextLine();
        System.out.println("enter the grade of first exam: ");
        student.primeiroTrimestre = sc.nextDouble();
        System.out.println("enter the grade of secund exam: ");
        student.segundoTrimestre = sc.nextDouble();
        System.out.println("enter the grade of three exam: ");
        student.terceiroTrimestre = sc.nextDouble();

        if (student.mediaFinal() < 60){
            System.out.println(student + " Failed");
            double faltando = 60 - student.mediaFinal();
            System.out.printf("Missing %.2f points", faltando);
        }
        else{
            System.out.println(student + " Pass");
        }

    }
}