package src.aula2;

import java.util.Scanner;

// Exercício 02 - Aula 02

public class Consortiumm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual a sua idade? ");
        int age = scan.nextInt();

        System.out.print("Qual seu salário mensal? ");
        double salary = scan.nextDouble();

        System.out.print("Quantos carros você deseja comprar? ");
        int car = scan.nextInt();

        if (age >= 18 && salary >= 2000.0 && car == 1) {
            System.out.println("Você pode comprar um automóvel.");
        } else {
            System.out.println("Você não pode comprar um automóvel. ");
        }

        scan.close();

    }
}
