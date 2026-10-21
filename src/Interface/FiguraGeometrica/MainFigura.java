package Interface.FiguraGeometrica;

public class MainFigura {
    static void main(String[] args) {
        FiguraGeometrica circulo = new Circulo(5);
        FiguraGeometrica retangulo = new Retangulo(5, 4);

        System.out.println("Retângulo: ");
        System.out.println("Área: "+retangulo.area());
        System.out.println("Perímetro: "+retangulo.perimetro());

        System.out.println("Círculo: ");
        System.out.println("Área: "+circulo.area());
        System.out.println("Perímetro: "+circulo.perimetro());



    }
}
