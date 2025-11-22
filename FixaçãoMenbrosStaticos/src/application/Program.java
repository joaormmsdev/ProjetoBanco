package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("What is the dollar price?");
        double dolar = sc.nextDouble();

        System.out.printf("How many dollars will be bought?");
        double valorProduto = sc.nextDouble();

        double total = CurrencyConverter.valorPagar(valorProduto, dolar);

        
        System.out.printf("Amonunt to be paid in reais = %.2f%n", total);
        
    }
}
