
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        if(x == 0){
            System.out.println("o numero é 0");
        }
        else if (x % 2 == 0){
            System.out.println("o numero é par");
        }
        else{
            System.out.println("o numero é impar");
        }

        sc.close();
    }
}
