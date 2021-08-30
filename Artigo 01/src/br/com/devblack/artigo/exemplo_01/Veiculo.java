package br.com.devblack.artigo.exemplo_01;

public class Veiculo {

    private final String modelo;
    private final String marca;
    private Placa placa;

    public Veiculo(final String modelo, final String marca){
        this.modelo = modelo;
        this.marca = marca;
    }

    public void setPlaca(final Placa placa) {
        this.placa = placa;
    }

}