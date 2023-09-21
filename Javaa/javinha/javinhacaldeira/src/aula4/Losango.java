package src.aula4;

//Exercício 02: Figuras geométricas Aula04
class Losango extends Formas {
    private double diagonalMaior;
    private double diagonalMenor;

    public Losango(double Maior, double Menor) {
        this.diagonalMaior = Maior;
        this.diagonalMenor = Menor;
    }

    @Override
    public double calcularArea() {
        return (diagonalMaior * diagonalMenor) / 2;
    }
}
