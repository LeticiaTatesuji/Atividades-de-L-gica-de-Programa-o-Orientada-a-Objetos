package AT03;

public class Mago extends Personagem{
    public Mago(String nome, int nivel) {
        super(nome, nivel);
    }

    @Override
    String atacar() {
        return "Lança feitiço!";
    }
}
