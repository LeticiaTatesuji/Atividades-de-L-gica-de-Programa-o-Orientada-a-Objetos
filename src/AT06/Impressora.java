package AT06;

public class Impressora implements Conectavel {
    private String modelo;

    public Impressora(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void conectar() {
        System.out.println("Impressora conectada por USB");
    }

    @Override
    public void desconectar() {
        System.out.println("Impressora desconectada");
    }
}
