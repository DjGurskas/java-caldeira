package src.aula6;

import java.util.Stack;

//refazer
public class PilhadeLivros {
    public static void main(String[] args) {
        Stack<Exercicio1> pilha = new Stack<>();

        //inicializando a pilha dos livros
        pilha.push(new Exercicio1("Bis", "Doçura"));
        pilha.push(new Exercicio1("Coca-Cola", "Bebida sem fim"));
        pilha.push(new Exercicio1("Garrafinha d' água", "Bebida sem sal"));

        //imprime a pilha de livros
        System.out.println("Pilha de livros: ");
        chamarPilha(pilha);

        //imprime os livros com base na categoria
        String queroCategoria = "Doçura";
        System.out.println("\n Livros da Categoria: " + queroCategoria);
        imprimirCategoria(pilha, queroCategoria);

        //remove os livros até que a pilha esteja vazia.
        System.out.println("\n Remover livros da pilha: ");
        while (!pilha.isEmpty()) {
            Exercicio1 remocaoLivro = pilha.pop();
            System.out.println("Livro removido: " + remocaoLivro);
        }

    }

    private static void imprimirCategoria(Stack<Exercicio1> pilhando, String categoria) {
        for (Exercicio1 livro : pilhando) {
            if (livro.categoria.equals(categoria)) {
                System.out.println(livro);
                //Irá filtrar e exibir apenas os livros de uma
                //categoria específica.
            }
        }
    }

    private static void chamarPilha(Stack<Exercicio1> pilhando) {
        for (Exercicio1 livro : pilhando) {
            System.out.println(livro);
        }
    }
}
