package entities;

import java.util.List;

public class Funcionario {
    private int id;
    private String nome;
    private double salario;


    public Funcionario(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getSalario() {
        return salario;
    }


    public void setSalario(double salario) {
        this.salario = salario;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public static Funcionario findById(List<Funcionario> list, int id) {
    for (Funcionario f : list) {
        if (f.getId() == id) {
            return f;
        }
    }
    return null; // não achou
    }


    public double aumento(double porcentagem){
        return salario += salario * porcentagem/100;
    }

    @Override
    public String toString() {
       
        return id + ", " + nome + ", " + salario;
    }


}

