package Interface.InterfacesMultiplas;

public class MainImpressora {
    static void main(String[] args) {
        Impressora i1 = new Impressora("Brothers", false);

        i1.imprimir();
        i1.conectar();
        i1.imprimir();
        i1.desconectar();
    }
}
