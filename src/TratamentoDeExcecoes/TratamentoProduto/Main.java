package TratamentoDeExcecoes.TratamentoProduto;

public class Main {
    static void main(String[] args) {
        try {
            Produto p = new Produto("Mouse", 10);
            p.exibirDados();
//            p.vender(5);
//            p.vender(4);
//            p.vender(2);
        } catch (IllegalArgumentException e) {
            System.out.println("Não possível cadastrar o produto"+e.getMessage());
        } finally {
            System.out.println("Finalizando o programa");
        }
    }

    //public static void tentarVender (Produto produto);
}
