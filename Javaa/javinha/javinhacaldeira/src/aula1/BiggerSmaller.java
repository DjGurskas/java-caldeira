package src.aula1;

import java.util.Scanner;

//Exercicio 03
public class BiggerSmaller {

    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        double number1 = numbers.nextDouble();

        System.out.print("Segundo número: ");
        double number2 = numbers.nextDouble();

        System.out.print("Terceiro número: ");
        double number3 = numbers.nextDouble();
    // maior
        double bigger = Math.max(number1, Math.max(number2, number3));
    // menor
        double smaller = Math.min(number1, Math.min(number2, number3));
    // média
        double average =  (number1 + number2 + number3) / 3.0;

        System.out.println("Maior número é: " + bigger);
        System.out.println("Menor número é: " + smaller);
        System.out.println("A média é: " + average);

        numbers.close();
    }
}
