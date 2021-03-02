package atividade_1.models;

import atividade_1.utils.Produto;

public class Sobremesa implements Produto {
    private final Double PRICE = 6.00;

    private Integer quantidade;

    public Sobremesa(Integer unidades) {
        this.quantidade = unidades;
    }

    @Override
    public Double precoTotal() {
        return quantidade * PRICE;
    }
}
