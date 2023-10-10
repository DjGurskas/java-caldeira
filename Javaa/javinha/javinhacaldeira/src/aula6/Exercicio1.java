package src.aula6;

import java.util.Stack;

public class Exercicio1 {
    String titulo;
    String categoria;

    public Exercicio1(String titulo, String categoria) {
        this.titulo = titulo;
        this.categoria = categoria;
    }

    //@Override” é uma forma de garantir que
    // estamos na verdade sobrescrevendo um método e não criando um novo.
    @Override
    public String toString(){
        return
                "| Livro = " + "Titulo: " + titulo + " | " +
                        "Categoria: " + categoria + " |";
    }
}

