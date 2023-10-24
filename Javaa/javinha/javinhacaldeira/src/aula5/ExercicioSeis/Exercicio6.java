package src.aula5.ExercicioSeis;

import java.util.LinkedList;
import java.util.Scanner;

public class Exercicio6 {
     String nome;
     String local;
     String cpf;
     String dataEntrada;
     String dataSaida;

    public Exercicio6(String nome, String local, String cpf, String dataEntrada, String dataSaida) {
        this.nome = nome;
        this.local = local;
        this.cpf = cpf;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    public String getNome() {
        return nome;
    }

    public String getLocal() {
        return local;
    }

    public String getCPF() {
        return cpf;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Local: " + local + ", CPF: " + cpf +
                ", Entrada: " + dataEntrada + ", Saída: " + dataSaida;
    }

}

