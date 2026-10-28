package TratamentoDeExcecoes.Tratamento3;

public class Personalizada {
    static void main(String[] args) {
        Conta c1 = new Conta(1000.0);

        try {
            c1.sacar(1500.0);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro de negócio: "+e.getLocalizedMessage());
        }


        System.out.println(c1.getSaldo());
    }
}
