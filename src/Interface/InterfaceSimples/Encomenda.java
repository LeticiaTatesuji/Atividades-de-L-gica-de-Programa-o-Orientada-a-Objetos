package Interface.InterfaceSimples;

public class Encomenda implements Rastreavel {
    private String codigo;
    private String localizacao;

    public Encomenda(String codigo, String localizacao) {
        this.codigo = codigo;
        this.localizacao = localizacao;
    }

    @Override
    public void rastrear() {
        System.out.println("Rastreamento de Encomenda");
        System.out.println("Código: "+ codigo);
        System.out.println("Localização: "+localizacao);
    }
}
