package Interface.Mistura;

public class ArmadilhaMagica implements HabilidadeEspecial {
    private String descricao;

    public ArmadilhaMagica(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void usarHabilidade() {
        System.out.println(descricao + " ativa uma explosão mágica");
    }
}
