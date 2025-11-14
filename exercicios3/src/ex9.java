import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double extra;

        int minutos = sc.nextInt();
        
        if (minutos < 100){
            System.out.println("valor pago: R$ 50.00");
        }
        else{
            extra = 50 + (minutos - 100) * 2;
            System.out.printf("Valor pago: R$ %.2f",extra);
        }

        sc.close();
    }
}
