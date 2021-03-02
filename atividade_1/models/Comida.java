package atividade_1.models;

import atividade_1.utils.Produto;

public class Comida implements Produto {

    private final Double PRICE = 30.00;

    private Double quantidadeKg;

    public Comida(Double quantidade) {
        this.quantidadeKg = quantidade;
    }

    @Override
    public Double precoTotal() {
        return quantidadeKg * PRICE;
    }
}
