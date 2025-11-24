package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ContaBancaria account;

        System.out.print("Digite o numero da conta: ");
        int numeroConta = sc.nextInt();

        System.out.print("Digite o nome do titular da conta: ");
        sc.nextLine(); // limpa buffer
        String name = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        if (response == 'y' || response == 'Y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new ContaBancaria(name, numeroConta, initialDeposit);
        } else {
            account = new ContaBancaria(name, numeroConta);
        }

        
        System.out.println(account);
        
        System.out.println("Enter a deposit value: ");
        double valorDepsito = sc.nextDouble();
        account.deposito(valorDepsito);

        System.out.println("Updated accont data: ");
        System.out.println(account);

        if (account.getBalance() > 0){
            System.out.print("Enter a withdraw value: ");
            double valorSaque = sc.nextDouble();
            
            // Garante que o valor é válido
            while (valorSaque > account.getBalance()) {
                System.out.println("Not enough balance.");
                System.out.print("Enter a withdraw value: ");
                valorSaque = sc.nextDouble();
            }

            // Agora sim, saque válido
            account.saque(valorSaque);

            System.out.println("Updated account data: ");
            System.out.println(account);
        }

        sc.close();
    }
}