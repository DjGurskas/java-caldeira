package src.aula2;

//Exercício 01 Aula 02

import java.util.Scanner;
public class primeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número do intervalo inicial: ");
        int inicio = scan.nextInt();

        System.out.print("Digite o número do intervalo final: ");
        int finaly = scan.nextInt();

        System.out.println("Números primos no intervalo de " + inicio + " a " + finaly + ":");
        procurarPrimos(inicio, finaly);

        scan.close();
    }

    //verificando se é primo mesmo ou se é prima hahaha
   public static boolean primo(int number){
        if (number <= 1) {
            return false;
        }
        if (number == 2){
            return true;
        }
        if (number % 2 == 0){
            return false;
        }
        for (int i = 3; i <= Math.sqrt(number); i+= 2) { //retorna a raiz quadrada de um número
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    //encontrar e imprimir os primos
    public static void procurarPrimos(int inicio, int finaly) {
        for (int i = inicio; i <= finaly; i++) {
            if (primo(i)) { // primo passa pro i
                System.out.print(i + " ");
            }
        }
    }
}
