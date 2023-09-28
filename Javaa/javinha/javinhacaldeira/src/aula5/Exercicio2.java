package src.aula5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();

        // Random é um método estático disponibilizado pela classe Math da linguagem Java.
        // Esse método retorna números aleatórios do tipo double,
        // mas apenas aqueles incluídos no intervalo de 0.0 até 1.0.
        //fonts: google

        //cria um array de 10 numeros aletórios
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = ran.nextInt(100) + 1;
        }
        System.out.println("Gerador de Array: " + Arrays.toString(numbers));

        System.out.print("Digite o número para verificação: ");
        int verify = scan.nextInt();


        //Stream é uma sequência de dados que é processada em tempo real.
        // Ele é muito útil quando precisamos manipular dados que estão
        // sendo gerados ou consumidos em tempo real.
        boolean found = Arrays.stream(numbers)
                        .anyMatch(num -> num == verify);
        //Verica se há algum número no array que é igual ao número fornecido,
        // e armazene esse resultado na variável.

        if (found) {
            System.out.println("O número " + verify + " está no array");
        } else {
            System.out.println("O número " + verify + " não está no array");
        }
        scan.close();
    }
}
