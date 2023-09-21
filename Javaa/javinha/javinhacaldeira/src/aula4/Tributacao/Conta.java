package src.aula4.Tributacao;

public class Conta {
    private double saldo;

    public void sacar(double valor){
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Error: Saldo insuficiente!");
        }
        System.out.println("Saldo atual: " + saldo);
    }

    public void depositar(double valor){
        this.saldo = saldo + valor;
    }

    public void obterSaldo(){
        System.out.println("Saldo atual é: " + saldo);

    }


}

