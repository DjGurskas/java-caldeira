package src.aula1;

import java.util.Scanner;

//Exercicio 04
public class Salary {
    public static void main(String[] args) {
        double menorSalario = 1320.0;

        Scanner salario = new Scanner(System.in);

        System.out.print("Digite seu salário: ");
        double salarioUser = salario.nextDouble();

    // calcula
        double quantidade = salarioUser / menorSalario;

        System.out.println("O individuo ganha: " + quantidade);

        salario.close();
    }
}
