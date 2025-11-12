
import java.util.Locale;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigoPeca1, numeroPeca1, codigoPeca2, numeroPeca2;
        double valorPeca1,valorPeca2,totalCompra ; 
         
        valorPeca1 = 5.30;
        valorPeca2 = 5.10;

        codigoPeca1 = 12;
        codigoPeca2 = 16;

        numeroPeca1 = 1;
        numeroPeca2 = 2;

        totalCompra = ((numeroPeca1 * valorPeca1) + (numeroPeca2 * valorPeca2));
        Locale.setDefault(Locale.US);
        System.out.printf("Valor a pagar: R$ %.2f", totalCompra);

        
    }
}
