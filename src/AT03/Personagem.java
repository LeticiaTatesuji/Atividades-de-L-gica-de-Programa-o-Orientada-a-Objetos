package AT03;

public abstract class Personagem {
    public String tipo () {
        return getClass().getSimpleName();
    }
    String nome;
    int nivel;

    public Personagem(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    abstract String atacar();

    public void exibirStatus () {
        System.out.println("\n===== RESUMO DO PERSONAGEM ======");
        System.out.println(getClass().getSimpleName());
        System.out.println("Nome do personagem: "+nome);
        System.out.println("Nível do personagem: "+nivel);
    }
}
