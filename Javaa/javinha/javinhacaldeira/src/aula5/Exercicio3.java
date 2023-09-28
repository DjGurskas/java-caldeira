package src.aula5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {
    private String titulo;
    private String data;
    private String descricao;

    public Exercicio3(String titulo, String data, String descricao){
        this.titulo = titulo;
        this.data = data;
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getData() {
        return data;
    }
    public String getDescricao(){
        return descricao;
    }

    @Override
    public String toString(){
        return " Tarefa" + "\nTitulo: " + titulo + "\nData: " + data +
                "\nDescrição: " + descricao;
    }
}


 class ListaTarefas3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Exercicio3> listarTarefas = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n.:Menu:.");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Remover Tarefa");
            System.out.println("3. Listar Todas as Tarefas");
            System.out.println("4. Sair\n");
            System.out.print("Escolha a opção: ");
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    adicionar(scan, listarTarefas);
                    break;
                case 2:
                    remover(scan, listarTarefas);
                    break;
                case 3:
                    listar(listarTarefas);
                    break;
                case 4:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Erro! Tente novamente.");
            }
        } while (opcao != 4);

        scan.close();
    }

    private static void adicionar(Scanner scan, ArrayList<Exercicio3> listarTarefas) {
        System.out.print("Título da tarefa: ");
        String titulo = scan.nextLine();
        System.out.print("Data da tarefa: ");
        String data = scan.nextLine();
        System.out.print("Descrição da tarefa: ");
        String descricao = scan.nextLine();

        Exercicio3 nova = new Exercicio3(titulo, data, descricao);
        listarTarefas.add(nova);

        System.out.println("Tarefa adicionada!");
    }

    private static void remover(Scanner scan, ArrayList<Exercicio3> listarTarefas) {
        System.out.println("Lista de Tarefas:\n");
        listar(listarTarefas);

        System.out.print("Digite a tarefa que vai ser removida:  ");
        int tarefaid = scan.nextInt();

                if(tarefaid >= 0 && tarefaid <listarTarefas.size()) {
                    Exercicio3 tarefaRemovida = listarTarefas.remove(tarefaid);
                    System.out.println("Tarefa removida: " + tarefaRemovida);
                } else {
                    System.out.println("Erro! Nenhuma opção selecionada.");
                }
    }

    private static void listar(ArrayList<Exercicio3> listarTarefas) {
        if (listarTarefas.isEmpty()) {
            System.out.println("A lista está vazia.");
        } else {
            System.out.println("Lista de Tarefas:");
            for (int i = 0; i < listarTarefas.size(); i++) {
                System.out.println(i + "º" + listarTarefas.get(i));
            }
        }
    }

}