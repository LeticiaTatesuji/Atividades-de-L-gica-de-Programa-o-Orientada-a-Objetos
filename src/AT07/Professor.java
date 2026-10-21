package AT07;

public class Professor extends Funcionario implements Registravel {
    private int qtdeHoras;
    private double valorHora;

    public Professor(String nome, String matricula, int qtdeHoras, double valorHora) {
        super(nome, matricula);
        this.qtdeHoras = qtdeHoras;
        this.valorHora = valorHora;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
    }

    @Override
    public double calcularSalario() {
        return valorHora * qtdeHoras;
    }

    @Override
    public void registrarPresenca() {
        System.out.println("Professor presente");
    }
}
