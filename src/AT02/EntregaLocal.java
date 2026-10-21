package AT02;

public class EntregaLocal extends Entrega{
    public EntregaLocal(String codigoPedido) {
        super(codigoPedido);
    }

    @Override
    double calcularValorFrete() {
        return 10;
    }
}
