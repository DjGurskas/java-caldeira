package src.aula1;

import java.util.Scanner;

//Exercicio 05
public class Hours {
    public static void main (String[] args) {
        Scanner hours = new Scanner(System.in);

        System.out.print("Insira a hora: ");
        int hora = hours.nextInt();

        System.out.print("Insira os minutos: ");
        int minutos = hours.nextInt();

        System.out.print("Insira os segundos: ");
        int segundos = hours.nextInt();

        if (hora < 0 || hora > 23 || minutos < 0 ||
                minutos > 59 || segundos < 0 || segundos > 59) {
            System.out.println("INVÁLIDO. Verifique se inseriu os dados corretamente.");
            return;
        }

        int passouMeiaNoite = hora * 3600 + minutos * 60 + segundos;

        int faltandoMeiaNoite = 86400 - passouMeiaNoite;

        System.out.println("Segundos passados desde 0h00min00s: " + passouMeiaNoite + " segundos.");
        System.out.println("Segundos faltando para meia-noite: " + faltandoMeiaNoite + " segundos.");

        hours.close();
    }
}
