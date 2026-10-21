package AT06;

public class MainConectavel {
    static void main(String[] args) {
        Conectavel impressora = new Impressora("Brothers 1212w");
        Conectavel caixaDeSom = new CaixaDeSom("JBL");

        System.out.println("Impressora:");
        impressora.conectar();
        impressora.desconectar();

        System.out.println("Caixa de som:");
        caixaDeSom.conectar();
        caixaDeSom.desconectar();
    }
}
