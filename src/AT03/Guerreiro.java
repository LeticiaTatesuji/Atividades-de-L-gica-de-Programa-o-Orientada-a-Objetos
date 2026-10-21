package AT03;

public class Guerreiro extends Personagem{
    public Guerreiro(String nome, int nivel) {
        super(nome, nivel);
    }

    @Override
    String atacar() {
        return "Golde de espada!";
    }
}
