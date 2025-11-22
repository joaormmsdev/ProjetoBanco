import java.util.Scanner;

public class ex4 {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int x = 1; x <= n; x++){
            int fatorialDecrecente = n;
            fatorialDecrecente += fatorialDecrecente * (n - x);
            System.out.println(fatorialDecrecente);
            }      
        int fatorial = 1;

        for (int x = 1; x <= n; x++) {
            fatorial *= x;        // multiplica pelo próximo número
            System.out.println(fatorial);
            }

        }
}
