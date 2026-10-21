package AT02;

public class MainEntrega {
    static void main(String[] args) {
        Entrega el = new EntregaLocal("1234");
        Entrega en = new EntregaNacional("4567",10);

        System.out.println(el.tipo());
        el.exibirResumo();

        System.out.println(en.tipo());
        en.exibirResumo();
    }
}
