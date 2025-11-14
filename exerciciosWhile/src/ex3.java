import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int combustivel,alcool,gasolina,diesel;
        alcool = 0 ;
        diesel = 0;
        gasolina = 0;
        
        while (true) {
           
            System.out.println("Qual combustivel ira colocar?");
            System.out.println("1 - Alcool \n2 - Gasolina\n3 - diesel");
            combustivel = sc.nextInt();
            

            if (combustivel <1 || combustivel > 4){
                System.out.println("valor invalido");
                continue;
            }
            else if (combustivel == 1){
                System.out.println("Colocado alcool");
                alcool+= 1;
            }
            else if (combustivel == 2){
                System.out.println("Colocado gasolina");
                gasolina +=1;
            }
            else if (combustivel == 3){
                System.out.println("Colocado diesel");
                diesel += 1;
            }
            else if (combustivel == 4){
                System.err.println("\nMuito Obrigado");
                System.out.printf("Alcool: %d \n",alcool);
                System.out.printf("Gasolina: %d \n", gasolina);
                System.out.printf("Diesel: %d \n", diesel);
                break;
            }
        }
        
    }
}
