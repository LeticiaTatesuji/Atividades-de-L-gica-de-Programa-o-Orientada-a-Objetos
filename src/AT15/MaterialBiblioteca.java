package AT15;

public abstract class MaterialBiblioteca {
    private final String titulo;
    private final String codigo;

    public MaterialBiblioteca(String titulo, String codigo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("O título deve ser informado");
        }

        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("O código deve ser informado");
        }

        this.titulo = titulo.trim();
        this.codigo = codigo.trim();
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void exibirDados() {
        System.out.println("Título: " + titulo);
        System.out.println("Código: " + codigo);
    }

    abstract void exibirSituacao();
}
