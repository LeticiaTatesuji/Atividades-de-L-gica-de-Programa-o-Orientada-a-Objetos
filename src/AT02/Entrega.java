package AT02;

public abstract class Entrega {
    public String tipo () {
        return getClass().getSimpleName();
    }

    protected String codigoPedido;

    public Entrega(String codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    abstract double calcularValorFrete ();

    public void exibirResumo () {
        System.out.println("===== RESUMO DA ENTREGA =====");
        System.out.println("Código do pedido: "+codigoPedido);
        System.out.println("Valor do frete: "+calcularValorFrete());
    }
}
