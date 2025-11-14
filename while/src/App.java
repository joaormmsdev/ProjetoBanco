public class App {
    public static void main(String[] args) throws Exception {
        int x = 1;
        while (x <= 10){
        System.out.println("Ola");
        x+=1;
        if (x == 5){
            break;
        }
        else{
            continue;
        }
        }
    }
}
