package src.aula3.correcao;

public class BancoPrincipal {

    public static void main(String[] args) {
        ContaBancoCorrecao minhaConta = new ContaBancoCorrecao("João da Silva", "333.431.780-39", "12345",
                "Banco ABC", "Rua ABC, 123");

        minhaConta.verificarInformacoes();
        minhaConta.deduzirTaxaManutencaoMensal();
        minhaConta.deposito(500.0);
        minhaConta.saque(200.0);
        minhaConta.pix(300.0);

        ContaBancoCorrecao outraConta = new ContaBancoCorrecao("Maria da Silva", "844.814.340-07", "54321",
                "Banco XYZ", "Rua XYZ, 456");

        minhaConta.transferencia(outraConta, 400.0);
        minhaConta.verificarInformacoes();

        outraConta.verificarInformacoes();
        outraConta.deduzirTaxaManutencaoMensal();

        minhaConta.alterarEndereco("Nova Rua, 789");
        minhaConta.calcularJuros(1.5);

        minhaConta.verificarSaldo();
        minhaConta.exibirHistoricoTransacoes();

        minhaConta.encerrarConta();
        outraConta.encerrarConta();
    }
}
