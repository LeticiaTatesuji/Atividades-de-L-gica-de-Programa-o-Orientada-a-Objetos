package AT11;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String placa, String modelo, double valorDiaria, int cilindradas) {
        super(placa, modelo, valorDiaria);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    @Override
    double calcularDiaria() {
        return getValorDiaria() + 20.00;
    }

    @Override
    public void ligar() {
        System.out.println("Moto " + getModelo() + " ligada");
    }

    @Override
    public void desligar() {
        System.out.println("Moto " + getModelo() + " desligada");

    }
}
