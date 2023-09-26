package src.aula5;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //armazena os números inteiros dentro do array
        int[] numeros = new int[5];

        // insere os números
        for (int i = 0; i <5; i++) {
            System.out.println("Digite o " + (i + 1) + " número inteiro: ");
            numeros[i] = scan.nextInt();
        }

        //calculando a soma
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        //média
        double media = (double) soma / 5;
        System.out.println("A soma de todos os números é: " + soma);
        System.out.println("A média de todos os números é: " + media);

        scan.close();
    }
}
