package org.example;

public class Calculadora {

    public double Soma(double num1, double num2) {
        return num1 + num2;
    }

    public double Subtrair(double num1, double num2) {
        return num1 - num2;
    }

    public double Multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    public double Divisao(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("O numero nao pode ser divisivel por 0");
        }
        else{
            return num1 / num2;
        }
    }

    //calculos mais "complexos"
    public double raizQuadrada (double num1){
        if (num1 < 0 ){
            throw new IllegalArgumentException("O numero nao pode ser negativo");
        }else {
            return Math.sqrt(num1);
        }
    }

    public double exponencial(double num1, double num2){
        return Math.pow(num1, num2);
    }

    public double porcentagem(double num1,  double num2){
        return (num1*num2)/100;
    }

    //calculos trigonometricos
    public double seno(double anguloGraus){
        double radianos = Math.toRadians(anguloGraus);
        return Math.sin(radianos);
    }

    public double coseno (double anguloGraus){
        double radianos = Math.toRadians(anguloGraus);
        return Math.cos(radianos);
    }

    public double tangente  (double anguloGraus){
        double radianos = Math.toRadians(anguloGraus);
        return Math.tan(radianos);
    }
}
