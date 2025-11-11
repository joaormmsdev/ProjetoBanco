import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a,b,soma;

        a = sc.nextInt();
        b = sc.nextInt();

        soma = a + b;

        System.out.printf("A soma de %d e %d é igual a = %d", a,b,soma);
    }
}
