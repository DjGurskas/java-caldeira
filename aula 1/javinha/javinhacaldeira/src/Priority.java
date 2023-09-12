package src;

import java.util.Scanner;

//Exercicio 08
public class Priority {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(".:Escolha uma opção:.");
        System.out.println("1 - Gestante");
        System.out.println("2 - Idosos");
        System.out.println("3 - Pessoa com Deficiência (PCD)");
        System.out.println("4- Nenhuma das alternativas");
        System.out.print("Digite o número da opção: ");
        int opcao = scan.nextInt();

        boolean priorityQueue = false;



        switch (opcao) {
            case 1:
                System.out.println("Você escolheu a opção Gestante.");
                priorityQueue = true;
                break;
            case 2:
                System.out.println("Você escolheu a opção Idosa.");
                priorityQueue = true;
                break;
            case 3:
                System.out.println("Você escolheu a opção PCD.");
                priorityQueue = true;
                break;
            case 4:
                System.out.println("Você escolheu a opção Nenhuma das alternativas.");
                break;
            default:
                System.out.println("Incorreto.");
        }

        if (priorityQueue) {
            System.out.println("Você possui direito à fila prioritária!");
        } else {
            System.out.println("Você não possui direito à fila prioritária!");
        }

        scan.close();

    }
}
