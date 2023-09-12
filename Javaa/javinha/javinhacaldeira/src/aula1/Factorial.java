package src.aula1;

import java.util.Scanner;

//Exercicio 13

//não sabia o que era fatorial até fazer
public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro não negativo: ");
        int number = scan.nextInt();

        if (number < 0) {
            System.out.println("O número deve ser não negativo.");
        } else {
            long fatorial = calculateFactorial(number);

            System.out.println("O fatorial de " + number + " é: " + fatorial);
        }
        scan.close();
    }

    public static long calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            long fatorial = 1;
            for (int i = 2; i <= number; i++) {
                fatorial *= i;
            }
            return fatorial;
        }

    }

}

