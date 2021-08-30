package br.com.devblack.artigo.exemplo_01;

import java.util.Arrays;

public class Emplacamento {

    private final String numeracaoPlaca;
    private String cidade;
    private static final String[] PLACAS_INDISPONIVEIS = {"ABC-1234","EFG-1234","XYZ-1234"};

    private Emplacamento(final String numeracaoPlaca){
        this.numeracaoPlaca = numeracaoPlaca;
    }

    private Placa gerarPlaca(){

        if (Arrays.asList(PLACAS_INDISPONIVEIS).contains(this.numeracaoPlaca)){
            throw new RuntimeException("Não foi possivel gerar placa "+this.numeracaoPlaca);
        }

       return new Placa(this.numeracaoPlaca, this.cidade);
    }

    public static void emplacar(final Veiculo veiculo, final String numeracaoPlaca, final String cidade){
        Emplacamento emplacamento = new Emplacamento(numeracaoPlaca);
        emplacamento.cidade = cidade;
        veiculo.setPlaca(emplacamento.gerarPlaca());
    }
}