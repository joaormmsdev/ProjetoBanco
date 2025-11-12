
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A,B,C;

        // A = 3.0;
        // B = 4.0;
        // C = 5.2;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        // questão A - a área do triângulo retângulo que tem A por base e C por altura

        double areaTrianguloRetangulo = (A * C) / 2;

        System.out.printf("Triangulo: %.3f \n", areaTrianguloRetangulo);

        // questão B - a área do círculo de raio C. (pi = 3.14159) 
        
        double pi = 3.14159;
        double areaCirculo = (Math.pow(C, 2)*pi);

        System.out.printf("Circulo: %.3f \n", areaCirculo);

        // questão C - a área do trapézio que tem A e B por bases e C por altura. 

        double areaTrapezio = ((A + B) * C) / 2;

        System.out.printf("Trapezio: %.3f \n", areaTrapezio);

        // questão D - a área do quadrado que tem lado B.

        double areaQuadrado = Math.pow(B, 2);

        System.out.printf("Quadrado: %.3f \n", areaQuadrado);

        // questão E -  a área do retângulo que tem lados A e B

        double areaRetangulo = A * B;

        System.out.printf("Retangulo: %.3f", areaRetangulo);
    }
}
