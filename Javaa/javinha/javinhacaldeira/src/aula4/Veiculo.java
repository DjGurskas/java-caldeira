package src.aula4;

//Exercício 01: Veículo aula 04
public abstract class Veiculo {

    String marca;
    String modelo;
    int ano;


    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;

        Carro carro = new Carro("BMW", "430i", 2017);
        Moto moto = new Moto("Honda", "CBR500R", 2021);
        int distancia = 100;


    }

    public  abstract double calcularCustoViagem(int distancia);
}


