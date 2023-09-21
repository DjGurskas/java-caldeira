package src.aula3;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//Exercico 01 Aula 03
public class ContaBancaria {

    private String nome;
    private String cpf;
    private int idConta;
    private String banco;
    private String endereco;
    private double saldo;
    private Date horaAtual;


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    }


    public void Conta(String nome, int idConta, String cpf, String banco,
                      String endereco, double saldoInicial, Date horaAtual) {
        this.nome = nome;
        if (validarCPF(cpf)) {
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("CPF inválido!!");
            //lança um novo argumento inválido (usado em casos onde recebe um input inválido)
            //pode ser usado até em e-mail
        }
        this.idConta = idConta;
        this.banco = banco;
        this.endereco = endereco;
        this.saldo = saldoInicial;
        this.horaAtual = new Date();

    }

    public void saque(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Error: Saldo insuficiente!");
        }
        System.out.println("Saldo atual: " + saldo);
    }

    public void deposito(double valor) {

        this.saldo = saldo + valor;
    }

    public void pix(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Transferência pix realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para pix.");
        }
    }

    public void verificarHorario() {
        SimpleDateFormat hours = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Horário atual: " + hours.format(horaAtual));
        // SDF é uma definição que espera uma data que contenha dia/mês/ano
        // ou horário que contenha hora/minutos/segundos
    }

    public boolean transferencia(ContaBancaria destino, double valor) {
        if (saldo >= valor) {
            this.saldo -= valor;
            destino.deposito(valor);
            return true;
        } else {
            return false;
        }
    }

    public void verificarSaldo() {

        System.out.println("Saldo atual é: " + saldo);
    }

    public void verificarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Banco: " + banco);
        System.out.println("ID Conta: " + idConta);
        System.out.println("Endereço: " + endereco);
    }

    private boolean validarCPF(String CPF){
        if (cpf.length() != 11){
            return false;
        }

        for (char validar : cpf.toCharArray()) { //tá verificando se todos os caracteres são números
            if (!Character.isDigit(validar)) {
                return false;
            }
        }
      return true;
    }

}

//fazer as tarefas adicionais

