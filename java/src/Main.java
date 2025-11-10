import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        
        int idade = 22;
        double altura = 1.74123;
        char sexo = 'F';
        String nome = "joão";
        double renda = 4000;

        Locale.setDefault(Locale.US);

        System.out.println("Sua nome é "+ nome);
        System.out.println("Sua idade é "+ idade);
        System.out.printf("sua altura é " + "%.2f%n",altura);
        System.out.println("Seu sexo é " + sexo);
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n",nome,idade,renda);


    }
}
