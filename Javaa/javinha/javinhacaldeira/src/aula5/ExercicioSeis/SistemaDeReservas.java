package src.aula5.ExercicioSeis;


import java.util.LinkedList;
import java.util.Scanner;

public class SistemaDeReservas {
    public static void main(String[] args) {
        LinkedList<Exercicio6> listaReserva = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Fazer reserva");
            System.out.println("2. Cancelar reserva");
            System.out.println("3. Exibir lista de reservas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scan.nextLine();
                    System.out.print("Local de destino: ");
                    String local = scan.nextLine();
                    System.out.print("CPF: ");
                    String cpf = scan.nextLine();
                    System.out.print("Data de entrada: ");
                    String dataEntrada = scan.nextLine();
                    System.out.print("Data de saída: ");
                    String dataSaida = scan.nextLine();

                    Exercicio6 reserva = new Exercicio6(nome, local, cpf, dataEntrada, dataSaida);
                    listaReserva.add(reserva);
                    System.out.println("Reserva de passagem realizada com sucesso.");
                    break;
                case 2:
                    System.out.println("Lista de reservas atual:");
                    for (int i = 0; i < listaReserva.size(); i++) {
                        System.out.println((i + 1) + ". " + listaReserva.get(i));
                    }
                    System.out.print("Digite o número da reserva a ser cancelada: ");
                    int numeroReserva = scan.nextInt();
                    if (numeroReserva >= 1 && numeroReserva <= listaReserva.size()) {
                        listaReserva.remove(numeroReserva - 1);
                        System.out.println("Reserva de passagem cancelada.");
                    } else {
                        System.out.println("Número de reserva inválido.");
                    }
                    break;
                case 3:
                    System.out.println("Lista de reservas atual:");
                    for (int i = 0; i < listaReserva.size(); i++) {
                        System.out.println((i + 1) + ". " + listaReserva.get(i));
                    }
                    break;
                case 4:
                    System.out.println("Saindo do programa.");
                    scan.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
