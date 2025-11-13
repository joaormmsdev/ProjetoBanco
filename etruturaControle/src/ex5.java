
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int codigoItem, quantiaItem;
        double valorItem1,valorItem2,valorItem3,valorItem4,valorItem5,total;
        String nomeitem1, nomeitem2, nomeitem3, nomeitem4, nomeitem5;

        valorItem1 = 4.00;
        valorItem2 = 4.50;
        valorItem3 = 5.00;
        valorItem4 = 2.00;
        valorItem5 = 1.50;

        nomeitem1 = "Cachorro Quente"; 
        nomeitem2 = "X-Salada";
        nomeitem3 = "X-Bacon";
        nomeitem4 = "Torrada sinples";
        nomeitem5 = "Refrigerante";

        
        System.out.println("Codigo |  Especificação  |  Preço");
        System.out.println("  1      Cachorro Quente    R$ 4.00");
        System.out.println("  2      X-Salada           R$ 4.50  ");
        System.out.println("  3      X-Bacon            R$ 5.00  ");
        System.out.println("  4      Torrada simples    R$ 2.00 ");
        System.out.println("  5      Refrigerante       R$ 1.50 \n");


        System.out.println("Escreve o codigo do item que deseja: ");
        codigoItem = sc.nextInt();
        System.out.println("Escreve a quantia do item que deseja: ");
        quantiaItem = sc.nextInt();

        if (codigoItem > 5 || codigoItem < 1){
            System.out.println("\nERRO: esse item não existe na tabela");
        }
        else if (quantiaItem < 1){
            System.out.println("\nERRO: a quantia foi igual a 0");
        }
        else if (codigoItem == 1){
            total = valorItem1 * quantiaItem;
            System.out.printf("\nO total da compra de %d %s é %.2f", quantiaItem,nomeitem1,total);
        }
        else if (codigoItem == 2){
            total = valorItem2 * quantiaItem;
            System.out.printf("\nO total da compra de %d %s é %.2f", quantiaItem,nomeitem2,total);
        }
         else if (codigoItem == 3){
            total = valorItem3 * quantiaItem;
            System.out.printf("\nO total da compra de %d %s é %.2f", quantiaItem,nomeitem3,total);
        } else if (codigoItem == 4){
            total = valorItem4 * quantiaItem;
            System.out.printf("\nO total da compra de %d %s é %.2f", quantiaItem,nomeitem4,total);
        } else if (codigoItem == 5){
            total = valorItem5 * quantiaItem;
            System.out.printf("\nO total da compra de %d %s é %.2f", quantiaItem,nomeitem5,total);
        }


        sc.close();
    }
}
