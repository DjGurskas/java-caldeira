package src.aula3;

//Exercício 2 Aula 3
public class Circulo {
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * raio;
    }

    public static void main(String[] args){
        Circulo umCirculo = new Circulo(5.0);
        Circulo doisCirculo = new Circulo(3.0);

        //primeiro
        System.out.println("Primeiro Círculo - Raio: " + umCirculo.raio);
        System.out.println("Área: " + umCirculo.calcularArea());
        System.out.println("Circunferência do Círculo: " + umCirculo.calcularCircunferencia());

        //segundo
        System.out.println("Primeiro Círculo - Raio: " + doisCirculo.raio);
        System.out.println("Área: " + doisCirculo.calcularArea());
        System.out.println("Circunferência do Círculo: " + doisCirculo.calcularCircunferencia());
    }
}

//fazer as tarefas adicionais