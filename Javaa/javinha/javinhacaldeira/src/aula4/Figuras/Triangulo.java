package src.aula4.Figuras;

import src.aula4.Figuras.Formas;

//Exercício 02: Figuras geométricas Aula04
class Triangulo extends Formas {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}
