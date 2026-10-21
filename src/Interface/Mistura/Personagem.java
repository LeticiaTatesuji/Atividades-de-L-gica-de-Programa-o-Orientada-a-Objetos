package Interface.Mistura;

public abstract class Personagem {
    private String nome;
    private int nivel;

    public Personagem(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Nível: " + nivel);
    }

    public abstract void atacar();
}
