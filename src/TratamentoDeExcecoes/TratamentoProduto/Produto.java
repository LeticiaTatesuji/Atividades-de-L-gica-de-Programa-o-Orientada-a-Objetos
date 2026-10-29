package TratamentoDeExcecoes.TratamentoProduto;

public class Produto {
    private String nome;
    private int qtde;

    public Produto(String nome, int qtde) {
        if (nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("O nome do produto deve ser informado");
        }

        if (qtde < 0) {
            throw new IllegalArgumentException("O estoque inicial não pode ser negativo");
        }
        this.nome = nome.trim();
        this.qtde = qtde;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public void vender (int qtde) throws EstoqueInsuficienteException {
        if (qtde <= 0) {
            throw new IllegalArgumentException("A quantidade da venda deve ser maior que zero");
        }

        if (qtde > this.qtde) {
            throw new EstoqueInsuficienteException("Estoque insuficiente.");
        }

        this.qtde -= qtde;
    }

    public void exibirDados () {
        System.out.println("Produto: "+nome);
        System.out.println("Estoque: "+qtde);
    }
}
