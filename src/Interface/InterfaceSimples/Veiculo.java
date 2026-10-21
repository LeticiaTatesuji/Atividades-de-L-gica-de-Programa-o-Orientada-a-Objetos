package Interface.InterfaceSimples;

public class Veiculo implements Rastreavel {
    private String placa;
    private String modelo;
    private String localizacao;

    public Veiculo(String placa, String modelo, String localizacao) {
        this.placa = placa;
        this.modelo = modelo;
        this.localizacao = localizacao;
    }

    @Override
    public void rastrear() {
        System.out.println("Rastreamento de Veículo: ");
        System.out.println("Placa: "+ placa);
        System.out.println("Modelo: "+modelo);
        System.out.println("Localização: "+localizacao);
    }
}
