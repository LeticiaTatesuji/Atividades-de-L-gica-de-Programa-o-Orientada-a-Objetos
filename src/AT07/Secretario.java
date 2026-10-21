package AT07;

public class Secretario extends Funcionario implements Registravel {
    private double salarioMensal;

    public Secretario(String nome, String matricula, double salarioMensal) {
        super(nome, matricula);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
    }

    @Override
    public double calcularSalario() {
        return salarioMensal;
    }

    @Override
    public void registrarPresenca() {
        System.out.println("Secretario presente");
    }
}
