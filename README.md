Atividade: Princípios GRASP em Java
Um projeto simples em Java para demonstrar a aplicação prática dos padrões GRASP, focado nos princípios Creator (Criador) e Controller (Controlador).

🎯 Objetivo da Atividade
Este sistema foi desenvolvido como parte de uma atividade acadêmica com o objetivo de consolidar o entendimento e a aplicação prática dos princípios GRASP.

A atividade exigia o desenvolvimento de um pequeno sistema em Java aplicando ao menos dois padrões GRASP, com comentários explicativos no código justificando as escolhas de design.

🛠️ Tecnologias
Java (SDK 11+)

Maven (Para estrutura do projeto)

🧠 Princípios GRASP Aplicados
O núcleo da atividade era demonstrar como os padrões GRASP melhoram o design do software, promovendo Baixo Acoplamento e Alta Coesão.

1. Creator (Criador)
Onde? Aplicado na classe Pedido.

Por quê? O método adicionarItem(...) dentro da classe Pedido é responsável por criar as instâncias de ItemPedido. Isso atende ao princípio do Creator, pois a classe Pedido:

Agrega e contém os objetos ItemPedido.

Tem as informações de inicialização necessárias (passadas por parâmetro).

Manter a criação de ItemPedido dentro de Pedido torna o design lógico e centraliza a responsabilidade, em vez de deixar outra classe (como a Main ou o Controller) se preocupar com isso.

2. Controller (Controlador)
Onde? Aplicado na classe GerenciadorPedidos.

Por quê? Esta classe atua como a fachada ou ponto de entrada para os "casos de uso" do sistema (como criarNovoPedido, adicionarItemAoPedido).

A classe Main (que simula a interface do usuário) comunica-se apenas com o Controller (GerenciadorPedidos).

A Main não conhece a existência das classes de domínio (Pedido, ItemPedido).

O Controller recebe a requisição e delega a tarefa para a classe de domínio apropriada (Pedido).

Isso isola a lógica de negócios da interface, promove Baixo Acoplamento e torna o sistema mais fácil de manter e testar.

⚡ Como Executar
O projeto é uma aplicação de console simples.

Clone este repositório.

Abra o projeto em sua IDE favorita (ex: IntelliJ IDEA, VS Code com Java Extension Pack, Eclipse).

Aguarde a IDE carregar as dependências do Maven (se houver).

Localize o arquivo src/main/java/org/example/Main.java.

Execute o método main().

🖥️ Resultado Esperado
Ao executar a classe Main, você verá a seguinte saída no console, demonstrando que o sistema processou os pedidos corretamente:


## 🖥️ Resultado Esperado

Ao executar a classe `Main`, você verá a seguinte saída no console, demonstrando que o sistema processou os pedidos corretamente:

```bash
✅ Novo pedido criado com sucesso.
-> Item 'Notebook XYZ' adicionado ao pedido.
-> Item 'Mouse sem fio' adicionado ao pedido.
-> Item 'Teclado Mecânico' adicionado ao pedido.
--- Itens do Pedido ---
Notebook XYZ (x1) - R$3500.0
Mouse sem fio (x2) - R$171.0
Teclado Mecânico (x1) - R$400.0
===========================
TOTAL DO PEDIDO: R$4071.0
===========================
TOTAL DO PEDIDO: R$4071.0
===========================
