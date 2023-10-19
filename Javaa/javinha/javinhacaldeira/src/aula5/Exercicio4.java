package src.aula5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio4 {
    private String nome;
    private String dataValidade;

    public Exercicio4(String nome, String dataValidade){
        this.nome = nome;
        this.dataValidade = dataValidade;
    }

    public String getTitulo() {
        return nome;
    }
    public String getData() {
        return dataValidade;
    }

    @Override
    public String toString(){
        return ".:Lista de Compras:." + "\nProduto: " + nome + "\nData de Validade: " + dataValidade;
    }
}


class ListadeCompras {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Exercicio4> listarCompras = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n.:Lista de Compras:.");
            System.out.println("1. Adicionar Produtos");
            System.out.println("2. Remover Produtos");
            System.out.println("3. Listar Todas os Produtos");
            System.out.println("4. Sair\n");
            System.out.print("Escolha a opção: ");
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    adicionar(scan, listarCompras);
                    break;
                case 2:
                    remover(scan, listarCompras);
                    break;
                case 3:
                    listar(listarCompras);
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

    private static void adicionar(Scanner scan, ArrayList<Exercicio4> listarCompras) {
        System.out.print("Nome do Produto: ");
        String nome = scan.nextLine();
        System.out.print("Data da Validade: ");
        String dataValidade = scan.nextLine();

        Exercicio4 nova = new Exercicio4(nome, dataValidade);
        listarCompras.add(nova);

        System.out.println("Produto adicionado!");
    }

    private static void remover(Scanner scan, ArrayList<Exercicio4> listarCompras) {
        System.out.println("Lista de Compras:\n");
        listar(listarCompras);

        System.out.print("Digite o produto que vai ser removido:  ");
        int tarefaid = scan.nextInt();

        if(tarefaid >= 0 && tarefaid <listarCompras.size()) {
            Exercicio4 tarefaRemovida = listarCompras.remove(tarefaid);
            System.out.println("Tarefa removida: " + tarefaRemovida);
        } else {
            System.out.println("Erro! Nenhuma opção selecionada.");
        }
    }

    private static void listar(ArrayList<Exercicio4> listarCompras) {
        if (listarCompras.isEmpty()) {
            System.out.println("A lista está vazia.");
        } else {
            System.out.println("Lista de Produtos:");
            for (int i = 0; i < listarCompras.size(); i++) {
                System.out.println(i + "º" + listarCompras.get(i));
            }
        }
    }

}