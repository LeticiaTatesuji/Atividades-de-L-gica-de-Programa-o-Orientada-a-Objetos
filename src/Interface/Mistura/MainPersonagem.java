package Interface.Mistura;

public class MainPersonagem {
    static void main(String[] args) {
        Guerreiro g1 = new Guerreiro("Arthur", 10);
        ArmadilhaMagica a1 = new ArmadilhaMagica("Uso de magia");

        System.out.println("Dados do Guerreiro");
        g1.exibirDados();

        System.out.println("Ataque do Personagem");
        Personagem p1 = g1;
        p1.atacar();

        System.out.println("Habilidade Especial");
        g1.usarHabilidade();
        a1.usarHabilidade();
    }
}
