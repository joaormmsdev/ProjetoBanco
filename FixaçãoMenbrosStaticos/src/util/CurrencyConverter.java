package util;

public class CurrencyConverter {
    public static double IOF = 0.06;

    public static double valorPagar(double valorProduto, double dolar){
        return (valorProduto * dolar) + (valorProduto * dolar * IOF);
    }

}
