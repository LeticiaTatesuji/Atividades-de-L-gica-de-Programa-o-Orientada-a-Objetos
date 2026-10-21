package AT11;

public class MainVeiculo {
    static void main(String[] args) {
        Carro c1 = new Carro("ABC1D23", "Onix", 100, 4);
        Moto m1 = new Moto("XYZ9A87", "CG160", 60, 160);

        System.out.println("\n\n=== CARRO ===");
        c1.exibirDados();
        System.out.println();
        System.out.println("Portas: " + c1.getQtdePortas() + " portas");
        System.out.printf("Locação por 2 dias: R$%,.2f", c1.calcularLocacao(2));

        System.out.println("\n\n=== MOTO ===");
        m1.exibirDados();
        System.out.println();
        System.out.println("Cilindradas: " + m1.getCilindradas() + " cilindradas");
        System.out.printf("Locação por 5 dias: R$%,.2f", c1.calcularLocacao(5));

        System.out.println("\n\n=== OPERAÇÕES ===");
        c1.ligar();
        c1.desligar();
        m1.ligar();
        m1.desligar();

        System.out.println("Total de veículos criados: " + Veiculo.getTotalVeiculos());
    }
}
