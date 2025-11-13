
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b;

        a = sc.nextInt();
        b = sc.nextInt();

        if (a == 0 || b == 0){
            System.out.println("não pode se dividir por 0");
        }
        else if (a % b == 0 || b % a == 0) {
            System.out.println("São multiplos");
        }
        else{
            System.out.println("não sao multiplos");
        }

        sc.close();
    }
}
