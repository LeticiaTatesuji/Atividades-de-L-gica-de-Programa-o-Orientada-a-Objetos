package AT13;

public class Main {
    static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("Letícia", 500.00);
        String[] entradas = {"100", "600", "-50", "abc"};

        for (int i = 0; i < entradas.length; i++) {
            System.out.println((i + 1) + "ª tentativa - saque: R$" + entradas[i]);

            try {
                double valor = Double.parseDouble(entradas[i]);
                c1.sacar(valor);
                ;
                System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            } catch (NumberFormatException e) {
                System.out.println("Erro: valor digitado não é um número válido.");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (SaldoInsuficienteException e) {
                System.out.println("Erro: " + e.getMessage());
            } finally {
                System.out.println("Saldo atual: R$" + c1.getSaldo());
                System.out.println();
            }
        }
        c1.exibirDados();
    }
}
