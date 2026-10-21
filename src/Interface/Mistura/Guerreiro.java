package Interface.Mistura;

public class Guerreiro extends Personagem implements HabilidadeEspecial {

    public Guerreiro(String nome, int nivel) {
        super(nome, nivel);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " realizando um ataque de espada");
    }

    @Override
    public void usarHabilidade() {
        System.out.println(getNome() + " executa golpe especial: Corte de espada");
    }
}
