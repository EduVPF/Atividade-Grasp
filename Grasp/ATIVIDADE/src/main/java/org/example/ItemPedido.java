package org.example;

// Classe 1: ItemPedido - Representa um item em um pedido.
public class ItemPedido {
    private String nomeProduto;
    private int quantidade;
    private double precoUnitario;

    public ItemPedido(String nomeProduto, int quantidade, double precoUnitario) {
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public double getSubtotal() {
        return quantidade * precoUnitario;
    }

    @Override
    public String toString() {
        return nomeProduto + " (x" + quantidade + ") - R$" + getSubtotal();
    }
}