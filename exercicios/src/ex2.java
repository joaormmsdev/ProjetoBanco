import java.util.Locale;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        double raio,pi,res ;

        pi = 3.14159;
        raio = sc.nextDouble();

        res = pi*(Math.pow(raio,2));
        
        System.out.printf("%.4f",res);
    }
}
