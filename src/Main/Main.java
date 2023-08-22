package Main;
import Model.*;

public class Main {

    public static void main(String[] args) {
        
        Tarefa task = new Tarefa();
        
        task.setId(10);
        task.setNome("Rotinha Matinal");
        task.setDescricao("Tomar Café\nIr para Academia\nLanchar\nAlmoçar");
        
        System.out.println(task);

    }

}

/*
Nome do Projeto: Gerenciador de Tarefas Simples

Descrição:
Crie um aplicativo de linha de comando em Java que permita aos usuários gerenciar suas tarefas diárias.
O aplicativo deve permitir que os usuários adicionem, visualizem, atualizem e removam tarefas.
As tarefas podem ser armazenadas em um arquivo de texto simples ou em um banco de dados SQLite embutido.

Recursos Sugeridos:

1. Adicionar Tarefa: Os usuários podem adicionar uma nova tarefa, inserindo um título e uma descrição.

2. Listar Tarefas: Os usuários podem ver uma lista de todas as tarefas pendentes, incluindo seus títulos e datas de vencimento.

3. Atualizar Tarefa: Os usuários podem atualizar o título, a descrição ou a data de vencimento de uma tarefa existente.

4. Concluir Tarefa: Os usuários podem marcar uma tarefa como concluída e removê-la da lista de tarefas pendentes.

5. Remover Tarefa: Os usuários podem excluir uma tarefa da lista.

6. Salvar/Carregar Tarefas: Implemente uma funcionalidade que permita aos usuários salvar suas tarefas em um arquivo ou banco de dados e carregá-las novamente na próxima vez que o aplicativo for iniciado.

Desafios Adicionais:

1. Validação de Entrada: Garanta que os dados inseridos pelos usuários sejam validados adequadamente, evitando erros e entradas inválidas.

2. Manipulação de Datas: Trabalhe com datas para definir datas de vencimento e implementar recursos relacionados a datas, como exibir tarefas com base em sua data de vencimento.

3. Interface de Usuário Melhorada: Se você se sentir confortável com JavaFX ou Swing, considere criar uma interface gráfica para tornar o aplicativo mais amigável.

4. Ordenação e Filtros: Implemente recursos de ordenação e filtros para permitir que os usuários vejam tarefas em ordem alfabética, por data de vencimento, etc.

5. Notificações: Explore a possibilidade de adicionar notificações para tarefas com datas de vencimento próximas.

6. Backup Automático: Crie um sistema de backup automático para salvar periodicamente os dados das tarefas, evitando perda de dados.

7. Multiusuário: Se quiser se aventurar um pouco mais, adicione suporte a múltiplos usuários,
onde cada usuário tem sua própria lista de tarefas.

Lembre-se de que o objetivo principal é aprender e praticar suas habilidades em Java,
então não se preocupe se o projeto não ficar perfeito.
Conforme você trabalha nesse projeto, você ganhará mais experiência e confiança em programação.
 */
