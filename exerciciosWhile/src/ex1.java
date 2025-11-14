import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int senha = 2002;
        int valor = 0;
        while (true){
            valor = sc.nextInt();
            if (valor == senha){
                System.out.println("Senha correta");
                break;
            }
            else{
                System.out.println("senha irrada");
            }
            
        }
    }
}
