package AT09;

public class CursoPresencial extends Curso implements Certificavel {
    private double valorHora = 20.00;
    private double valorMaterial = 50.00;

    public CursoPresencial(String nome, int cargaHoraria, double valorHora, double valorMaterial) {
        super(nome, cargaHoraria);
        this.valorHora = valorHora;
        this.valorMaterial = valorMaterial;
    }

    @Override
    public double calcularValor() {
        return (getCargaHoraria() * valorHora) + valorMaterial;
    }

    @Override
    public void emitirCertificado(String nomeAluno) {
        System.out.println("CERTIFICADO");
        System.out.println("Certificamos que o aluno "+nomeAluno+" concluiu o curso presencial de "+getNome()+" com carga horária de "+getCargaHoraria()+ " horas.");
    }
}
