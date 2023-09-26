package src.aula4.Veiculos;

//Exercício 01: Veículo aula 04
public class Moto extends Veiculo {
    public Moto(String marca, String modelo, int ano) {

        super(marca, modelo, ano);
    }

    @Override
    public double calcularCustoViagem(int distancia) {

        return distancia * 0.15;
    }
}
