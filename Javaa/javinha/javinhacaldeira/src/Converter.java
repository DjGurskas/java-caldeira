package src;

import java.util.Scanner;

//Exercicio 12
public class Converter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Escreva a quantia em dólar: ");
        double quantiaDolar = scan.nextDouble();

        System.out.print("Escreva a taxa de câmbio (Ex.: 5.0 para conversão para reais): ");
        double taxaCambio = scan.nextDouble();

        double valornaConversao = quantiaDolar * taxaCambio;

        System.out.println("O valor convertido foi: " + valornaConversao);

        scan.close();
    }
}
