package AT09;

public class CursoOnline extends Curso implements Certificavel {
    private double valorHora = 15.00;

    public CursoOnline(String nome, int cargaHoraria, double valorHora) {
        super(nome, cargaHoraria);
        this.valorHora = valorHora;
    }

    @Override
    public double calcularValor() {
        return getCargaHoraria() * valorHora;
    }

    @Override
    public void emitirCertificado(String nomeAluno) {
        System.out.println("CERTIFICADO");
        System.out.println("Certificamos que o aluno "+nomeAluno+" concluiu o curso online de "+getNome()+" com carga horária de "+getCargaHoraria()+ " horas.");
    }
}
