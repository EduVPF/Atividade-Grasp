package org.example;

// Classe Principal para Demonstração (Entry point)
public class Main {
    public static void main(String[] args) {
        // O Ponto de entrada (Main) interage APENAS com o Controller (GerenciadorPedidos).
        // Isso demonstra o Baixo Acoplamento entre a camada de "interface" e a
        // camada de "domínio".
        GerenciadorPedidos controller = new GerenciadorPedidos();

        // 1. Uso do Controller: Inicia um caso de uso "Criar Pedido"
        controller.criarNovoPedido();

        // 2. Uso do Controller: Inicia casos de uso "Adicionar Item"
        controller.adicionarItemAoPedido("Notebook XYZ", 1, 3500.00);
        controller.adicionarItemAoPedido("Mouse sem fio", 2, 85.50);
        controller.adicionarItemAoPedido("Teclado Mecânico", 1, 400.00);

        // 3. Uso do Controller: Inicia caso de uso "Ver Detalhes do Pedido"
        controller.exibirDetalhesDoPedido();
    }
}