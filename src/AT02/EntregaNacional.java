package AT02;

public class EntregaNacional extends Entrega{
    private double distancia = 5.00;

    public EntregaNacional(String codigoPedido, double distancia) {
        super(codigoPedido);
        this.distancia = distancia;
    }

    @Override
    double calcularValorFrete() {
        return distancia*1.5;
    }
}
