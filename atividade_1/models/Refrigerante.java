package atividade_1.models;

import atividade_1.utils.Produto;

public class Refrigerante implements Produto {
    private final Double PRICE = 5.00;

    private Integer quantidade;

    public Refrigerante(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public Double precoTotal() {
        return quantidade * PRICE;
    }
}
