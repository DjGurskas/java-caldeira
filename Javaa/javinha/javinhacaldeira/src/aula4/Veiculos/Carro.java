package src.aula4.Veiculos;

//Exercício 01: Veículo aula 04
public class Carro extends Veiculo {
    public Carro(String marca, String modelo, int ano) {

        super(marca, modelo, ano);
    }

    @Override
    public double calcularCustoViagem(int distancia) {

        return distancia * 0.20;
    }
}
//@Override” é uma forma de garantir que
// estamos na verdade sobrescrevendo um método e não criando um novo.
