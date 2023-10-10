package src.aula7.Exercicio2;


import java.util.Scanner;

enum DiaSemana {
    SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
}
public class Semana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o dia da semana (ex: SEGUNDA, TERCA): ");
        String input = scan.nextLine().toUpperCase(); //converte para maiúsculas

        //converte para o enum correspondente
        DiaSemana selecionarDia = null;
        try {
            selecionarDia = selecionarDia.valueOf(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Incorreto! Digite conforme os exemplos.");
            System.exit(1); //adorei
        }

        switch (selecionarDia) {
            case SEGUNDA:
                System.out.println("Vamo lá! Tá só começando...");
                break;
            case TERCA:
                System.out.println("Tá com pressa que acabe? Ainda nem chegou no meio da semana.");
                break;
            case QUARTA:
                System.out.println("Só mais um pouco, meio caminho andado.");
                break;
            case QUINTA:
                System.out.println("Tá quase no melhor dia da semana");
                break;
            case SEXTA:
                System.out.println("AE!! Eu disse que iria melhorar, esse é o melhor dia!!");
                break;
            case SABADO:
                System.out.println("Dia de comemorar, relaxar e beber com moderação!");
                break;
            case DOMINGO:
                System.out.println("Dia de descansar e lembrar que amanhã já é Segunda-feira =( ");
                break;
            default:
                System.out.println("Erro!");
        }
        scan.close();
    }
}