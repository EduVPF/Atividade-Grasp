package org.example;

// Classe 3: GerenciadorPedidos - Controla as operações do sistema.
public class GerenciadorPedidos {
    private Pedido pedidoAtual;

    /**
     * GRASP Pattern: Controller (Controlador)
     *
     * Justificativa:
     * A classe GerenciadorPedidos atua como um controlador que recebe e delega as
     * operações do sistema (casos de uso) para as classes de domínio (Pedido).
     *
     * Onde foi aplicado:
     * A classe inteira é um Controller. A classe Main (UI) só fala com ela.
     *
     * Por que atende ao GRASP Controller:
     * O Controller lida com eventos do sistema. Em vez da classe Main (simulando a
     * interface) interagir diretamente com Pedido, o Controller (GerenciadorPedidos)
     * encapsula essa lógica e delega as tarefas. Isso isola a lógica de domínio
     * da lógica de interface, promovendo Baixo Acoplamento e Alta Coesão.
     */
    public void criarNovoPedido() {
        this.pedidoAtual = new Pedido();
        System.out.println("\n✅ Novo pedido criado com sucesso.");
    }

    public void adicionarItemAoPedido(String nomeProduto, int quantidade, double precoUnitario) {
        if (pedidoAtual != null) {
            // O Controller delega a ação para a instância de Pedido
            pedidoAtual.adicionarItem(nomeProduto, quantidade, precoUnitario);
            System.out.println("-> Item '" + nomeProduto + "' adicionado ao pedido.");
        } else {
            System.out.println("⚠️ Nenhum pedido ativo. Crie um novo pedido primeiro.");
        }
    }

    public void exibirDetalhesDoPedido() {
        if (pedidoAtual != null) {
            pedidoAtual.listarItens();
            System.out.println("===========================");
            System.out.println("TOTAL DO PEDIDO: R$" + pedidoAtual.getTotal());
            System.out.println("===========================");
        } else {
            System.out.println("⚠️ Nenhum pedido ativo.");
        }
    }
}