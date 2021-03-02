package atividade_1.models;

import atividade_1.utils.Produto;

import java.util.ArrayList;
import java.util.List;

public class ContaRestaurante {

    private Integer numeroMesa;
    private final List<Cliente> clientList = new ArrayList<>();
    private final List<Produto> productList = new ArrayList<>();

    public ContaRestaurante(Integer numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public Integer getNumeroMesa() {
        return numeroMesa;
    }

    public List<Cliente> getClient() {
        return clientList;
    }

    public List<Produto> getProducts() {
        return productList;
    }

    public void addClient(Cliente cliente) {
        clientList.add(cliente);
    }

    public void removeClient(Cliente cliente) {
        clientList.remove(cliente);
    }

    public void addProduct(Produto produto) {
        productList.add(produto);
    }

    @Override
    public String toString() {
        int totalClient = clientList.size();
        Double totalPrice = getTotalPrice();
        Double priceForClient = totalPrice / totalClient;
        StringBuilder sb = new StringBuilder();
        sb.append("Número da mesa: ").append(numeroMesa)
                .append("\nTotal de pessoas: ").append(totalClient)
                .append("\nPreço total: ").append(String.format("%.2f", totalPrice)).append("R$\n")
                .append("Preço por cliente: ").append(String.format("%.2f", priceForClient)).append("R$");


        return sb.toString();
    }

    private Double getTotalPrice() {
        Double total = 0.0;
        for (Produto p : productList) {
            total += p.precoTotal();
        }
        return total;
    }
}
