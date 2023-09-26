package src.aula4.Figuras;
import java.util.ArrayList;
import java.util.List;


//Exercício 02: Figuras geométricas Aula04

//reformatar o codigo
public abstract class Formas{
    public abstract double calcularArea();

    public static void main(String[] args) {
        List<Formas> formas = new ArrayList<>();

        formas.add(new Retangulo(5.0, 3.0));
        formas.add(new Circulo(2.0));
        formas.add(new Triangulo(4.0, 5.0));
        formas.add(new Quadrado(4.0));
        formas.add(new Losango(6.0, 8.0));

        for (Formas formato : formas) {
            System.out.println("Área da forma: " + formato.calcularArea());
        }
    }
}


