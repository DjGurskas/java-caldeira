package src.aula7.Exercicio1;

interface Desenhavel {
    void desenhar();
}


//implementando a interface
class Circulo implements Desenhavel {
    @Override
    public void desenhar() {
        System.out.println("Vou desenhar o círculo.");
    }
}

class Quadrado implements Desenhavel {
    @Override
    public void desenhar(){
        System.out.println("Vou desenhar o quadrado.");
    }
}
 class Principal {
    public static void main(String[] args) {

        Circulo circulo = new Circulo();
        circulo.desenhar();

        Quadrado quadrado = new Quadrado();
        quadrado.desenhar();
    }
}