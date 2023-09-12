package src;

import java.util.Scanner;

//Exercicio 11
public class Vogal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Escreva uma palavra ou frase: ");
        String entrada = scan.nextLine().toLowerCase();

        int contador = 0;

        for (int i = 0; i < entrada.length(); i++) {
            char letras = entrada.charAt(i);
            if (letras == 'a' || letras == 'e'||
                    letras == 'i' || letras == 'o' || letras == 'u') {
                contador++;
            }
        }

        System.out.println("O número de vogais é: " + contador);

        scan.close();
    }
}
