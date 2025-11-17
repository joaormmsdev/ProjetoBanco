
import java.util.Scanner;

public class Funcoes {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    int a,b,c;

    System.out.println("Enter three numbers: ");
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();

    if (a > b && a > c){
        System.out.println("maior: " + a);
    }
    else if(b > a && b > c){
        System.out.println("maior: " + b);
    }
    else{
        System.out.println("maior: " + c);
    }
    }
}
