package entities;

public class Student {
    public String name;
    public double primeiroTrimestre;
    public double segundoTrimestre;
    public double terceiroTrimestre;

    public double mediaFinal(){
        return (primeiroTrimestre + segundoTrimestre + terceiroTrimestre);
    }

    public String toString(){
        return "\nName: " + name +
        "\nGrade1: " + String.format("%.2f", primeiroTrimestre) +
        "\nGrade2: " + String.format("%.2f", segundoTrimestre) +
        "\nGrade3: " + String.format("%.2f", terceiroTrimestre) + 
        "\n\nFinal Grade = " + String.format("%.2f", mediaFinal());
    }
}
