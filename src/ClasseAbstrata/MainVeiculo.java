package ClasseAbstrata;

public class MainVeiculo {
    static void main(String[] args) {
        Veiculo c1 = new Carro();
        Veiculo b1 = new Bicicleta();

        System.out.println(c1.tipo());
        c1.mover();

        System.out.println(b1.tipo());
        b1.mover();
    }
}
