import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int dentro = 0;
        int fora = 0;

        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            if (x >= 10 && x <= 20){
                System.err.println("in");
                dentro += 1;
            }else{
                System.out.println("out");
                fora += 1;
            }
        }
        System.out.println(dentro + " in");
        System.out.println(fora + " out");
        scanner.close();
    }       
}