package src.aula5.ExercicioCinco;

import java.util.LinkedList;
import java.util.Scanner;

public class Fila {
    public static void main(String[] args) {
        LinkedList<Exercicio5> Lafila = new LinkedList<>();
        Scanner scan = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n.:Fila de Impressão:.");
            System.out.println("1. Adicionar documento");
            System.out.println("2. Imprimir documento");
            System.out.println("3. Exibir fila de impressão");
            System.out.println("4. Sair\n");
            System.out.print("Escolha uma opção: \n");
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    adicionar(scan, Lafila);
                    break;
                case 2:
                    imprimir(Lafila);
                    break;
                case 3:
                    filinha(Lafila);
                    break;
                case 4:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Erro! Tente novamente.");
            }
        }
        while (opcao != 4);

        scan.close();
    }

    private static void adicionar(Scanner scan, LinkedList<Exercicio5> Lafila) {
        System.out.print("Nome do Documento: ");
        String nome = scan.nextLine();
        System.out.print("Número de páginas: ");
        int paginas = scan.nextInt();

        Exercicio5 impressao = new Exercicio5(nome, paginas);
        Lafila.add(impressao);
        System.out.println("Documento adicionado!");
    }

    private static void imprimir(LinkedList<Exercicio5> Lafila) {
        if (!Lafila.isEmpty()) {
            Exercicio5 paraImprimir = Lafila.poll();
            System.out.println("Imprimindo documento: \n" + paraImprimir);
        } else {
            System.out.println("A fila de impressão está vazia.");
        }
    }

    private static void filinha(LinkedList<Exercicio5> Lafila) {
        System.out.println("Fila de impressão atual:\n");
        for (Exercicio5 documentos : Lafila) {
            System.out.println(documentos);
        }
    }
}
