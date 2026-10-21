package Interface.InterfacesMultiplas;

public class Impressora implements Conectavel, Imprimivel {
    private String modelo;
    private boolean conectada;

    public Impressora(String modelo, boolean conectada) {
        this.modelo = modelo;
        this.conectada = conectada;
    }

    @Override
    public void conectar() {
        conectada = true;
        System.out.println(modelo + " conectada ao WI-FI");
    }

    @Override
    public void desconectar() {
        conectada = false;
        System.out.println(modelo + " desconectada ao WI-FI");
    }

    @Override
    public void imprimir() {
        if (!conectada) {
            System.out.println("Não é possível imprimir: Impressora desconectada");
            return;
        }
        System.out.println(modelo + " imprimindo");

    }
}
