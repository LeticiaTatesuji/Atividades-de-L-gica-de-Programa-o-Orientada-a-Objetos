package ClasseAbstrata;

public class Carro extends Veiculo {
    @Override
    void mover() { //sobrescrita
        System.out.println("ClasseAbstrata.Carro em movimento");
    }
}
