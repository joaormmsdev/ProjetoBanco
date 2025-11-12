
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, horasTrabalhadas;
        double valorHora, salario;

        System.out.println("Seu numero de registro: ");
        numero = sc.nextInt();

        System.out.println("Seu numero de horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();

        valorHora = 5.50;

        salario = valorHora * horasTrabalhadas;

        System.out.println("Registro de funcionario:");
        System.out.printf("Funcionario João - Numero %d \n", numero);
        System.out.printf("Horas trabalhadas no mes: %d Horas \n", horasTrabalhadas);
        System.out.printf("Salario mes de novembro: %.2f", salario);


    }
}
