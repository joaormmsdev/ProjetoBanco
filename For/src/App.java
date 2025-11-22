public class App {
    public static void main(String[] args) throws Exception {
        

        int n, i;

        n = 3;
        
        int soma = 0;
        for (i = 0;i<n; i++){
            int x = i + 1;
            soma = soma + x;
            System.out.println("Soma parcial: " + soma);
        }    
    }
}
