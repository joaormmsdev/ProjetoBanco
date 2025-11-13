import java.util.Scanner;
public class ex7 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

         float x, y;

         x = sc.nextFloat();
         y = sc.nextFloat();

        if (x == 0 && y == 0){
            System.out.println("Origem");
        }
        else if (x > 0.1 && y > 0.1){
            System.out.println("Q1");
         }
         else if (x < 0 && y > 0){
            System.out.println("Q2");
         }
         else if (x < 0 && y < 0){
            System.out.println("Q3");
         }
         else if (x > 0 && y <0){
            System.out.println("Q4");
         }
         
    }
}
