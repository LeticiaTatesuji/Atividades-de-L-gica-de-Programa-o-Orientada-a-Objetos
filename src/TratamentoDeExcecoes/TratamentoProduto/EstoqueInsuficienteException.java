package TratamentoDeExcecoes.TratamentoProduto;

public class EstoqueInsuficienteException extends Exception {
    public EstoqueInsuficienteException (String msg) {
        super(msg);
    }
}
