import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a,b,soma;

        a = sc.nextInt();
        b = sc.nextInt();

        soma = a + b;

        System.out.printf("A soma de %d + %d = %d ",a,b,soma);
    }
}
