import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int x;
        char i;
        String y;
        double c;

        
        y = sc.next();
        x = sc.nextInt();
        c = sc.nextDouble();
        i = sc.next().charAt(0);


        System.out.println("Voce digitou: " + y);
        System.out.println("Voce digitou: " + x);
        System.out.println("Voce digitou: " + c);
        System.out.println("Voce digitou: " + i);
        
        sc.close();
    }
}
