package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        while (true) {
            System.out.println("Calculadora: ");
            System.out.println("1. Somar");
            System.out.println("2. Subtrair");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Raiz Quadrada");
            System.out.println("6. Potência");
            System.out.println("7. Porcentagem");
            System.out.println("8. Seno (em graus)");
            System.out.println("9. Cosseno (em graus)");
            System.out.println("10. Tangente (em graus)");
            System.out.println("0. Sair");
            System.out.print("Escolha uma operação: ");

            try  {
                int op = scanner.nextInt();
                if (op == 0){
                    System.out.println("Saindo da calculadora");
                    break;
                }

                double num1 , num2 , resultado;

                switch (op) {
                    case 1://soma
                        System.out.println("Somar");
                        System.out.println("Digite o 1 numero: ");
                        num1 = scanner.nextDouble();
                        System.out.println("Digite o 2 numero: ");
                        num2 = scanner.nextDouble();
                        resultado = calculadora.Soma(num1, num2);
                        System.out.println("Resultado : "+resultado);

                    case 2: // Subtrair
                        System.out.print("Digite o primeiro número: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Digite o segundo número: ");
                        num2 = scanner.nextDouble();
                        resultado = calculadora.Subtrair(num1, num2);
                        System.out.println("Resultado: " + resultado);
                        break;

                    case 3: // Multiplicar
                        System.out.print("Digite o primeiro número: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Digite o segundo número: ");
                        num2 = scanner.nextDouble();
                        resultado = calculadora.Multiplicacao(num1,num2);
                        System.out.println("Resultado: " + resultado);
                        break;

                    case 4: // Dividir
                        System.out.print("Digite o dividendo: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Digite o divisor: ");
                        num2 = scanner.nextDouble();
                        resultado = calculadora.Divisao(num1,num2);
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 5: // Raiz Quadrada
                        System.out.print("Digite o número: ");
                        num1 = scanner.nextDouble();
                        resultado = calculadora.raizQuadrada(num1);
                        System.out.println("Resultado: " + resultado);
                        break;

                    case 6: // Potência
                        System.out.print("Digite a base: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Digite o expoente: ");
                        num2 = scanner.nextDouble();
                        resultado = calculadora.exponencial(num1, num2);
                        System.out.println("Resultado: " + resultado);
                        break;

                    case 7: // Porcentagem
                        System.out.print("Digite o valor total: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Digite o percentual (%): ");
                        num2 = scanner.nextDouble();
                        resultado = calculadora.porcentagem(num1, num2);
                        System.out.println("Resultado: " + resultado);
                        break;

                    case 8: // Seno
                        System.out.print("Digite o ângulo em graus: ");
                        num1 = scanner.nextDouble();
                        resultado = calculadora.seno(num1);
                        System.out.println("Resultado: " + resultado);
                        break;

                    case 9: // Coseno
                        System.out.print("Digite o ângulo em graus: ");
                        num1 = scanner.nextDouble();
                        resultado = calculadora.coseno(num1);
                        System.out.println("Resultado: " + resultado);
                        break;

                    case 10: // Tangente
                        System.out.print("Digite o ângulo em graus: ");
                        num1 = scanner.nextDouble();
                        resultado = calculadora.tangente(num1);
                        System.out.println("Resultado: " + resultado);
                        break;

                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                }
                } catch (InputMismatchException e) {
                System.out.println("Entrada invalidade, digite apenas numeros : ");
                scanner.next();
            }catch (IllegalArgumentException e) {
                System.out.println("Erro de calculo " + e.getMessage());
            }
        }
        scanner.close();
    }
}