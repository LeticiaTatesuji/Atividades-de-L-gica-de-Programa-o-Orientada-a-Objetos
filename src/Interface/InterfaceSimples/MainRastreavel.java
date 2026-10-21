package Interface.InterfaceSimples;

public class MainRastreavel {
    static void main(String[] args) {
        Encomenda e1 = new Encomenda("1234", "Londrina");
        Veiculo v1 = new Veiculo("ABC123D4", "Azera", "Cambé");

        e1.rastrear();
        v1.rastrear();
        consultarLocalizacao(e1);
        consultarLocalizacao(v1);
    }

    public static void consultarLocalizacao (Rastreavel item) {
        item.rastrear();
        System.out.println();

    }
}
