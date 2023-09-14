package src.aula2;

import java.util.Scanner;

//Exercicio 04 Aula 02
public class Calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char escolha = 0;

        do {
            System.out.print("Coloque o primeiro número: ");
            double number1 = scan.nextDouble();
            System.out.print("Coloque o segundo número: ");
            double number2 = scan.nextDouble();

            System.out.println(".:Calculadora:.");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Divisão");
            System.out.println("4 - Multiplicação");
            System.out.println("5 - Raiz");
            System.out.println("6 - Nenhuma das alternativas");
            int opcao = scan.nextInt();

            double answer = 0.0;

            switch (opcao) {
                case 1:
                    answer = number1 + number2;
                case 2:
                    answer = number1 - number2;
                case 3:
                    if (number2 != 0) { // != diferente
                        answer = number1 / number2;
                    } else {
                        System.out.println("Divisão zero!");
                        continue; //reinicia
                    }
                    break;
                case 4:
                    answer = number1 * number2;
                case 5:
                    if (number1 >= 0) {
                        answer = Math.sqrt(number1);
                    } else {
                        System.out.println("Não foi possível fazer com número negativo!");
                        continue;
                    }
                    break;
                case 6:
                    System.out.println("Você escolheu a opção Nenhuma das alternativas.");
                    break;
                default:
                    System.out.println("Opção inválida!");

            }

            System.out.println("Resultado: " + answer);

            // charAt(0) Retorna o caractere em uma localização específica em uma String.
            // O índice sempre começa a ser contado do número 0 (zero) em diante.
            System.out.print("Gostaria de continuar? (s/n) ");
            escolha = scan.next().charAt(0);
            
        } while (escolha == 's' || escolha == 'S');

        System.out.println("End!");
        scan.close();
    }
}

