package TratamentoDeExcecoes.Tratamento1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = 0;

        try {
            System.out.println("Informe um valor inteiro: ");
            valor = sc.nextInt();
            System.out.println("Você informou: "+valor);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Informe um número.");
        } finally {
            System.out.println("Finalizando o sistema");
            sc.close(); //fecha o scanner para deixar a memoria em aberto
        }
    }
}
