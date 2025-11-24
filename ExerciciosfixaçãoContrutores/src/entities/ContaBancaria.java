package entities;

public class ContaBancaria {
    private int numeroConta;
    private String holder;
    private double balance;

    // Construtor com depósito inicial
    public ContaBancaria(String name, int numeroConta, double incialDeposit){
        this.holder = name;
        this.numeroConta = numeroConta;
        deposito(incialDeposit);
    }

    public ContaBancaria(String name, int numeroConta){
        this.holder = name;
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getBalance(){
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String name){
        this.holder = name;
    }

    // MÉTODO DEPOSITAR
    public void deposito(double amout){
        balance += amout;
    }

    // MÉTODO SACAR
    public void saque(double amount){
        balance -= (amount + 5.0); // taxa de 5
    }

    public String toString(){
        return "\nAccount " 
        + numeroConta + 
        ", Holder: " 
        + holder +
        ", Balance: $ " 
        + String.format("%.2f", balance);
    }
}
//.