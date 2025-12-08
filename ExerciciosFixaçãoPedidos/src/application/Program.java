package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.OrderItem;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Birth date (DD/MM/YYYY): ");
        String birthDateStr = sc.next();

        Date birthDate = sdf.parse(birthDateStr);

        Client client = new Client(name, email, null);
        

        System.out.println("How many utems to this order? ");
        Integer items = sc.nextInt();

        int n = items;
        for(int i = 0; i < n; i++){;
            System.out.println("Enter #" + (i+1));

            
            System.out.println("Product name: ");
            String productName = sc.next();

            System.out.println("Product price: ");
            double productPrice = sc.nextDouble();
            
            System.out.println("Quantity: ");
            Integer quantity = sc.nextInt();
            }
    }
}

