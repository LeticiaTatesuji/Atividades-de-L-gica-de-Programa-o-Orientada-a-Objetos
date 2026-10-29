package AT15;

public class Livro extends MaterialBiblioteca implements Emprestavel {
    private boolean emprestado = false;

    public Livro(String titulo, String codigo) {
        super(titulo, codigo);
    }

    @Override
    public void emprestar() {
        if (emprestado) {
            throw new IllegalArgumentException("O livro já foi emprestado");
        }
        emprestado = true;
    }

    @Override
    public void devolver() {
        if (!emprestado) {
            throw new IllegalArgumentException("O livro já foi devolvido");
        }
        emprestado = false;
    }

    @Override
    void exibirSituacao () {
        if (emprestado) {
            System.out.println("Situação: Emprestado");
        } else {
            System.out.println("Situação: Disponível");
        }
    }
}
