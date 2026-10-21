package AT11;

public class Carro extends Veiculo {
    private int qtdePortas;

    public Carro(String placa, String modelo, double valorDiaria, int qtdePortas) {
        super(placa, modelo, valorDiaria);
        this.qtdePortas = qtdePortas;
    }

    public int getQtdePortas() {
        return qtdePortas;
    }

    @Override
    double calcularDiaria() {
        return getValorDiaria() + 50.00;
    }

    @Override
    public void ligar() {
        System.out.println("Carro " + getModelo() + " ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Carro " + getModelo() + " desligado");
    }
}
