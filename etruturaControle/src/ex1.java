
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x == 0){
            System.out.println("o numero é 0");
        }
        else if (x > 0){
            System.out.println("o numero não é negativo");
        }
        else{
            System.out.println("O numero é negativo");
        }


        sc.close();
    }
}
