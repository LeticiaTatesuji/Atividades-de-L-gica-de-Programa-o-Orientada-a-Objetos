package Interface.FiguraGeometrica;

public class Retangulo implements FiguraGeometrica {
    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double area() {
        return largura * altura;
    }

    @Override
    public double perimetro() {
        return 2 * (altura + largura);
    }
}
