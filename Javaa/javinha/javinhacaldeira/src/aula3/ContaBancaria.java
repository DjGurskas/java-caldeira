package src.aula3;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//Exercico 01 Aula 03
public class ContaBancaria {

    private String nome;
    private String cpf;
    private int idConta;
    private String banco;
    private String endereco;
    private double saldo;
    private int horaAtual;

    public static void main(String[] args) {
        String datetime = DateTimeFormatter.ofPattern("MMM DD YYYY, HH:MM:SS A")
                .format(LocalDateTime.now());
    }

    public void saque(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Error: Saldo insuficiente!");
        } System.out.println("Saldo atual: " + saldo);
    }
    public void deposito(double valor){
        this.saldo = saldo + valor;
    }

    public void pix(double valor){

    }
    public boolean transferencia(ContaBancaria destino,double valor){
        if(this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposito(valor);
            return true;
        } else {
            return false;
        }
    }

    public void verificarSaldo(){
    System.out.println("Saldo atual é: " + saldo);
    }

    public void verificarHorario(){
    }
    public void verificarInformacoes(){

    }
}
