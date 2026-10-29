package AT13;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        if (titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException("O titular deve ser informado");
        }

        if (!Double.isFinite(saldoInicial) || saldoInicial < 0) {
            throw new IllegalArgumentException("O saldo inicial deve ser finito e não pode ser negativo");
        }
        this.titular = titular.trim();
        this.saldo = saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (!Double.isFinite(valor) || valor <= 0) {
            throw new IllegalArgumentException("O saque deve ser um valor finito e maior que zero");
        }

        if (valor > saldo) {
            throw new SaldoInsuficienteException("O valor solicitado supera o saldo disponível.");
        }

        saldo -= valor;
    }

    public void exibirDados() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$" + saldo);
    }
}
