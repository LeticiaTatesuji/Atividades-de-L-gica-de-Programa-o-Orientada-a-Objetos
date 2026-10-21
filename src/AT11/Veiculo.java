package AT11;

public abstract class Veiculo implements Operavel {
    private final String placa;
    private String modelo;
    private double valorDiaria;
    private static int totalVeiculos;
    public static final String NOME_LOCADORA = "Tatesuji's Car";

    public Veiculo(String placa, String modelo, double valorDiaria) {
        this.placa = placa;
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
        totalVeiculos++;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setValorDiaria(double valorDiaria) {
        if (valorDiaria > 0) {
            this.valorDiaria = valorDiaria;
        } else {
            throw new IllegalArgumentException("O valor da diária deve ser maior que zero.");
        }
    }

    abstract double calcularDiaria();

    public void exibirDados() {
        System.out.println("Locadora: " + NOME_LOCADORA);
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.printf("Diária: R$%,.2f", calcularDiaria());
    }

    public double calcularLocacao(int dias) {
        if (dias > 0) {
            return calcularDiaria() * dias;
        } else {
            throw new IllegalArgumentException("A quantidade de dias deve ser maior que zero.");
        }
    }

    public static int getTotalVeiculos() {
        return totalVeiculos;
    }
}
