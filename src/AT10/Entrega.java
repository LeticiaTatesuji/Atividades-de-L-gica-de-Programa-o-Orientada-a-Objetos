package AT10;

public abstract class Entrega {
    private String codigo;
    private double distanciaKm;

    public Entrega(String codigo, double distanciaKm) {
        this.codigo = codigo;
        this.distanciaKm = distanciaKm;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(double distanciaKm) {
        if (distanciaKm >= 0) {
            this.distanciaKm = distanciaKm;
        } else {
            System.out.println("Erro: a distância não pode ser menor que zero");
        }
    }

    public void exibirDados() {
        System.out.println("\nDADOS DA ENTREGA");
        System.out.println("Código da entrega: " + codigo);
        System.out.println("Distância em km: " + distanciaKm + "km");
    }

    public abstract double calcularFrete();
}
