package src.aula4;

//Exercício 02: Figuras geométricas Aula04
class Quadrado extends Formas {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
