import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {
        double b,B,h, area;
        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (b+B) / 2 * h;
        Locale.setDefault(Locale.US);
        System.out.printf("A area é igual a = %.1f", area);
    }
}
