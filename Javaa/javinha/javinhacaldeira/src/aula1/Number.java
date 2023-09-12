package src.aula1;

//Exercicio 02
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);

        System.out.print("Primeiro número: ");

        double number1 = numbers.nextDouble();

        System.out.print("Segundo número: ");

        double number2 = numbers.nextDouble();

        numbers.close();

        System.out.println("Primeiro número é: " + number1);
        System.out.println("Segundo número é: " + number2);

    }
}
