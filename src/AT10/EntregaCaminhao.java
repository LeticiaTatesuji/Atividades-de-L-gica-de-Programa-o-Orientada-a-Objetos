package AT10;

public class EntregaCaminhao extends Entrega implements Rastreavel {
    private double valorKm = 5.00;
    private double taxaFixa = 30.00;

    public EntregaCaminhao(String codigo, int distanciaKm) {
        super(codigo, distanciaKm);
    }

    @Override
    public double calcularFrete() {
        return (getDistanciaKm() * valorKm) + taxaFixa;
    }

    @Override
    public void rastrear() {
        System.out.println("\n===== RASTREANDO ENTREGA =====");
        System.out.println("Código da entrega: " + getCodigo());
        System.out.println("Meio de transporte: Caminhão");
    }
}
