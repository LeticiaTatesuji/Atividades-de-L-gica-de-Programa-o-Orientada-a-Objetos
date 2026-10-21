package AT10;

public class MainEntrega {
    static void main(String[] args) {
        EntregaBicicleta b1 = new EntregaBicicleta("ABC1234",5);
        EntregaCaminhao c1 = new EntregaCaminhao("DEF5678",20);

        System.out.println("\n===== ENTREGA POR BICICLETA =====");
        b1.exibirDados();
        System.out.println("Frete: R$"+b1.calcularFrete());
        b1.rastrear();

        System.out.println("\n===== ENTREGA POR CAMINHÃO =====");
        c1.exibirDados();
        System.out.println("Frete: R$"+c1.calcularFrete());
        c1.rastrear();
    }
}
