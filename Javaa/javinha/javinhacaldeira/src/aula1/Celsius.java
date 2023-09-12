package src.aula1;

import java.util.Scanner;

// Exercicio 10
public class Celsius {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scan.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit + "ªF.");

        scan.close();
    }
}
