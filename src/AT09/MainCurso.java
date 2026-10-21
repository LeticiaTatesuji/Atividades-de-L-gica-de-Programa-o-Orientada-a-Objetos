package AT09;

public class MainCurso {
    static void main(String[] args) {
        CursoPresencial p1 = new CursoPresencial("Gastronomia", 80, 50.00, 150.00);
        CursoOnline o1 = new CursoOnline("Excel", 30, 20);

        System.out.println("\n===== CURSO PRESENCIAL =====");
        p1.exibirDados();
        System.out.println("Valor: R$" + p1.calcularValor());

        System.out.println("\n===== CURSO ONLINE =====");
        o1.exibirDados();
        System.out.println("Valor: R$" + o1.calcularValor());

        System.out.println("\n===== EMISSÃO DOS CERTIFICADOS =====");
        p1.emitirCertificado("Vitor");
        o1.emitirCertificado("Letícia");
    }
}
