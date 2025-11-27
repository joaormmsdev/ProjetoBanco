package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Quartos;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int quarto = 10;

        Quartos[] vect = new Quartos[quarto];

        while(true){
            System.out.println("How many rooms will be rented? ");
            int reservas = sc.nextInt();

            for (int i = 0; i<reservas; i++){
                System.out.println("\nRent #" + (i+1));

                System.out.println("how your name: ");
                sc.nextLine();
                String name = sc.nextLine();
                
                System.out.println("how your email: ");
                String email = sc.next();
                
                System.out.println("how your room: ");
                int room = sc.nextInt();

                vect[room] = new Quartos(name, email, room);
            }

            System.out.println("How need mor rooms? 2-yes 1-no");
            int verifi = sc.nextInt();
            if (verifi == 1){
                break;
            }
        }

        System.out.println("\nBusy rooms: ");
        for (int i = 0; i <10; i++){
            if (vect[i] != null){
                System.out.println(vect[i]);
            }
        }
    }
    
}
