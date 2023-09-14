package src.aula3;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

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
        Scanner scan = new Scanner(System.in);
        String datetime = DateTimeFormatter.ofPattern("MM DD YYYY, HH:MM:SS A")
                .format(LocalDateTime.now());


    }

    public void Conta(String nome, int idConta, String cpf, String banco,
    String endereco, double saldo, int horaAtual){
        this.nome=nome;
        this.idConta=idConta;
        this.cpf=cpf;
        this.banco=banco;
        this.endereco=endereco;
        this.saldo=saldo;
        this.horaAtual=horaAtual;

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

    public void setHoraAtual(){
    }
    public void verificarInformacoes(){

    }
}
