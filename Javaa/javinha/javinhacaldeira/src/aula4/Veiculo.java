package src.aula4;


public class Veiculo {

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

    public class Carro extends Veiculo{
    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public double calcularCustoViagem(int distancia) {
        return distancia * 0.20;
    }
}

    public class Moto extends Veiculo{
        public Moto(String marca, String modelo, int ano){
            super(marca, modelo, ano);
        }

        @Override
        public double calcularCustoViagem(int distancia) {
            return distancia * 0.15;
        }
    }
//@Override” é uma “annotation” que pode ser acrescentada a um método que foi sobreposto.
//é necessário para estender ou modificar a implementação abstrata. fonts: google

