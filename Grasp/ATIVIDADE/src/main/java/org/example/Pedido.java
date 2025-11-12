package org.example;

import java.util.ArrayList;
import java.util.List;

// Classe 2: Pedido
public class Pedido {
    private List<ItemPedido> itens;

    public Pedido() {
        this.itens = new ArrayList<>();
    }

    /**
     * GRASP Pattern: Creator (Criador)
     *
     * Justificativa:
     * A classe Pedido é a responsável por criar instâncias de ItemPedido.
     *
     * Onde foi aplicado:
     * No método adicionarItem(), a classe Pedido cria um novo objeto ItemPedido.
     *
     * Por que atende ao GRASP Creator:
     * O princípio do Creator sugere que a classe B deve ser responsável por criar A
     * se B "agrega" A, "contém" A ou "usa/inicializa" A.
     * Aqui, Pedido (B) agrega/contém uma coleção de ItemPedido (A),
     * tornando-o o criador ideal e mantendo o baixo acoplamento.
     */
    public void adicionarItem(String nomeProduto, int quantidade, double precoUnitario) {
        // Aplicação do Creator: Pedido cria o ItemPedido
        ItemPedido novoItem = new ItemPedido(nomeProduto, quantidade, precoUnitario);
        this.itens.add(novoItem);
    }

    public double getTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void listarItens() {
        System.out.println("--- Itens do Pedido ---");
        for (ItemPedido item : itens) {
            System.out.println(item);
        }
    }
}