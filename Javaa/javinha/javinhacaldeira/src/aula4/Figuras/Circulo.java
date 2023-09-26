package src.aula4.Figuras;

//Exercício 02: Figuras geométricas Aula04
class Circulo extends Formas {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}
