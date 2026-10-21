package ClasseAbstrata;

public abstract class Veiculo {
    public String tipo () { //metodo concreto
        return getClass().getSimpleName(); //pega a classe e o nome dela
    }

    abstract void mover();

}
