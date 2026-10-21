package Interface.SerVivo;

public class Animal implements SerVivo {

    public boolean vivo = true;

    @Override
    public void mover() {

    }

    @Override
    public void comer(int massa) {
        System.out.printf("Vivo: %s",this.vivo ? "Sim" : "Não");

    }

    @Override
    public void info() {

    }
}
