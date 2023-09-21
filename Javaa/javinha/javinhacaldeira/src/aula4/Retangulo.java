package src.aula4;

//Exercício 02: Figuras geométricas Aula04
class Retangulo extends Formas {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;

    }

    @Override
    public double calcularArea() {
        return largura * altura;

    }
}
