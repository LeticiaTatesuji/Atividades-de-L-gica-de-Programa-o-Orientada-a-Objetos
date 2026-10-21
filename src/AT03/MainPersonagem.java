package AT03;

public class MainPersonagem {
    static void main(String[] args) {
        Personagem g = new Guerreiro("Thor", 10);
        Personagem m = new Mago("Dumbledore", 50);

        g.exibirStatus();
        System.out.println(g.atacar());

        m.exibirStatus();
        System.out.println(m.atacar());
    }
}
