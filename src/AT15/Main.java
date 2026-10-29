package AT15;

public class Main {
    static void main(String[] args) {
        Livro l1 = new Livro("A culpa é das estrelas", "ABX34R5");
        Emprestavel emprestavel = l1;

        l1.exibirDados();
        l1.exibirSituacao();

        System.out.println("Primeira tentativa: emprestar");
        try {
            emprestavel.emprestar();
            System.out.println("Empréstimo realizado com sucesso!");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            l1.exibirSituacao();
            System.out.println();
        }

        System.out.println("Segunda tentativa: emprestar novamente");
        try {
            emprestavel.emprestar();
            System.out.println("Empréstimo realizado com sucesso!");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            l1.exibirSituacao();
            System.out.println();
        }

        System.out.println("Terceira tentativa: devolver");
        try {
            emprestavel.devolver();
            System.out.println("Devolução realizada com sucesso!");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            l1.exibirSituacao();
            System.out.println();
        }

        System.out.println("Terceira tentativa: devolver novamente");
        try {
            emprestavel.devolver();
            System.out.println("Devolução realizada com sucesso!");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            l1.exibirSituacao();
        }
    }
}
