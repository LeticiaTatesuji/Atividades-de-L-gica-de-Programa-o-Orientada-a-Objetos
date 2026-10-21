package AT10;

public class EntregaBicicleta extends Entrega implements Rastreavel {
    private double valorKm = 2.00;

    public EntregaBicicleta(String codigo, int distanciaKm) {
        super(codigo, distanciaKm);
    }

    @Override
    public double calcularFrete() {
        return getDistanciaKm() * valorKm;
    }

    @Override
    public void rastrear() {
        System.out.println("\n===== RASTREANDO ENTREGA =====");
        System.out.println("Código da entrega: " + getCodigo());
        System.out.println("Meio de transporte: Bicileta");
    }
}
