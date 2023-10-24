package src.aula5.ExercicioCinco;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Exercicio5 {
    String nome;
    int paginas;

    public Exercicio5(String nome, int paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome(){
        return nome;
    }

    public int getPaginas(){
        return paginas;
    }

    @Override
    public String toString(){
        return  "\nDocumento: " + nome + "\nPáginas: " + paginas;
    }

}

