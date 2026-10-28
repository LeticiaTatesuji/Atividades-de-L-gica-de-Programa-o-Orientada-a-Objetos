package AT12;

public class Aluno {
    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirDados() {
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Idade: " + idade);
    }
}
