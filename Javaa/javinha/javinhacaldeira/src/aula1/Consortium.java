package src.aula1;

import java.util.Scanner;

//Exercicio 07
public class Consortium {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual a sua idade? ");
        int age = scan.nextInt();

        System.out.print("Qual seu salário mensal? ");
        double salary = scan.nextDouble();

        if (age >= 18 && salary >= 2000.0) {
            System.out.println("Você pode comprar um automóvel.");
        } else {
            System.out.println("Você não pode comprar um automóvel. ");
        }

        scan.close();
    }
}
