package TratamentoDeExcecoes.Tratamento2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Informe o numerador: ");
            int a = sc.nextInt();
            System.out.print("Informe o denominador: ");
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Resultado: "+result);
        } catch (ArithmeticException e) { //e é um objeto
            System.out.println("Não é possível dividir por zero");
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Informe um número!");
        }
    }
}
