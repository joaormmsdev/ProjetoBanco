import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double teste1, teste2, teste3, media;
            for (int x = 1; x <= n; x++){
                System.out.println("\nAluno" + x);
                System.out.println("Primeiro teste");
                teste1 = sc.nextDouble();
                System.out.println("\nSegundo teste");
                teste2 = sc.nextDouble();
                System.out.println("\nTerceiro teste");
                teste3 = sc.nextDouble();

                media = (teste1 * 2.0 + teste2 * 3.0 + teste3 * 5.0) / 10.0;
                System.out.printf("Média: %.2f%n", media);
            }
        }
    }

