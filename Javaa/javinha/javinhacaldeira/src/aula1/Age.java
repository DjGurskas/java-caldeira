package src.aula1;

import java.util.Scanner;

//Exercicio 06
public class Age {
    public static void main(String[] args) {
        Scanner ages = new Scanner(System.in);

        System.out.print("Qual é a sua idade? ");
        int age = ages.nextInt();

        if (age < 16) {
            System.out.println("Você não pode votar.");
        } else if (age >= 16 && age <= 17 || age > 65) {
            System.out.println("O voto é opcional.");
        } else {
            System.out.println("O voto é obrigatório.");
        }

        ages.close();
    }
}
