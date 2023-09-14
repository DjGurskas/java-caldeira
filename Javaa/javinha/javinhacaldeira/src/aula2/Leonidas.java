package src.aula2;

import java.util.Scanner;

//Exercicio 07
public class Leonidas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int enemy = 300_000;

        System.out.println("Quantos soldados inimigos estamos enfrentando?");

        int solution;

        do {
            System.out.print("Estamos enfrentando: ");
            solution = scan.nextInt();

            if (solution < enemy) {
                System.out.println("Um pouco mais de inimigos!");
            } else if (solution > enemy) {
                System.out.println("Um pouco menos de inimigos!");
            } else {
                System.out.println("Exato! Estamos lutando contra " +
                        enemy + " soldados inimigos.");
            }
        } while (solution != enemy) ; // != diferente

        scan.close();
    }
}
