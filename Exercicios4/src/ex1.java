import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        for (int i = 0; i <= number; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }     
        scanner.close();
    }
}
}
