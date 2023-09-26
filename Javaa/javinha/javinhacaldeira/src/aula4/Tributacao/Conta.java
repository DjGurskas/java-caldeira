package src.aula4.Tributacao;

interface Tributavel {
    double calculaTributos();
}

//hierarquia das classes
public class Conta {
    public double saldo;

    public void sacar(double valor){

        saldo -= valor;
    }
    public void depositar(double valor){

        saldo += valor;
    }
    public double obterSaldo(){

        return saldo;
    }
}

class Corrente extends Conta implements Tributavel {
    @Override
    public double calculaTributos() {
        return getSaldo() * 0.01;
    }

    public double getSaldo() {
        return saldo;
    }


    class Poupanca extends Conta implements Tributavel {
        @Override
        public double calculaTributos() {
            return 0;
        }

        class ImpostoDeRenda {
            private double totalTributos = 0;

            public void adicao(Tributavel tributavel) {
                totalTributos += tributavel.calculaTributos();
            }

            //calculaTributos() vai retornar o valor dos tributos para
            // cada classe que foi implementada a interface.
            public double getTotalTributos() {
                return totalTributos;
            }
        }

        class Seguro implements Tributavel {
            @Override
            public double calculaTributos() {
                return 42;
            }
        }

    }
}

