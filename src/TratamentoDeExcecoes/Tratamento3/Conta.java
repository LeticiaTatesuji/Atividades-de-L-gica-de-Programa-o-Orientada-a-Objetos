package TratamentoDeExcecoes.Tratamento3;

public class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente. Saldo: "+saldo+"\nSaque: "+valor);
        }
        saldo -= valor;
    }

    public double getSaldo () {
        return saldo;
    }
}
