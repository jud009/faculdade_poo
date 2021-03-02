package atividade_1.models;

import atividade_1.utils.Produto;

public class Cerveja implements Produto {

    private final Double PRICE = 10.00;

    private Integer quantidade;

    public Cerveja(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public Double precoTotal() {
        return quantidade * PRICE;
    }
}
