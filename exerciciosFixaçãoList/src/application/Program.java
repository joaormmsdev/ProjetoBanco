package application;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Funcionario;

public class Program {

    public static Funcionario findById(List<Funcionario> list, int id) {
        for (Funcionario f : list) {
            if (f.getId() == id) {
                return f;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.println("Quantos funcionarios vai registrar? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Digite o ID do funcionario: ");
            int id = sc.nextInt();

            System.out.println("Digite o Nome do funcionario: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.println("Digite o salario do funcionario: ");
            double salary = sc.nextDouble();

            funcionarios.add(new Funcionario(id, name, salary));
        }

        System.out.println("Qual ID do funcionario que ira receber o aumento? ");
        int idFuncionario = sc.nextInt();

        Funcionario func = findById(funcionarios, idFuncionario);

        if (func == null) {
            System.out.println("Esse funcionario não existe.");
        } else {
            System.out.println("Digite a porcentagem do aumento: ");
            double porcentagem = sc.nextDouble();
            func.aumento(porcentagem);
        }

        System.out.println();
        System.out.println("Lista atualizada:");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }
}
