package AT12;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        String idade;

        System.out.print("Informe seu nome: ");
        nome = sc.next();

        System.out.print("Informe sua idade: ");
        idade = sc.next();

        try {
            int idadeNum = Integer.parseInt(idade);
            Aluno a1 = new Aluno(nome, idadeNum);
            a1.exibirDados();
        } catch (NumberFormatException e) {
            System.out.println("Idade inválida! Digite um número inteiro.");
        } finally {
            System.out.println("Tentativa de cadastro finalizada");
        }
        sc.close();
    }
}
