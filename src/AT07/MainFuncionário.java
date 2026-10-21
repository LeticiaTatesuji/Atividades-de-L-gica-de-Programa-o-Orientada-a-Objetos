package AT07;

public class MainFuncionário {
    static void main(String[] args) {
        Professor p = new Professor("Letícia", "12345", 80, 40);
        Secretario s = new Secretario("Ana", "587894", 2500);

        System.out.println("Professor: ");
        p.exibirDados();
        System.out.println("Salário: " + p.calcularSalario());
        p.registrarPresenca();

        System.out.println("Secretario: ");
        s.exibirDados();
        System.out.println("Salário: " + s.calcularSalario());
        s.registrarPresenca();
    }
}
