package Controller;

import Model.Tarefa;
import Model.TarefaDAO;
import java.util.ArrayList;
import View.TelaInicial;

public class Controller {

    TarefaDAO db = new TarefaDAO();

    TelaInicial telaInicialView = null;

    // Construtor vazio
    public Controller() {
    }

    public Controller(TelaInicial telaInicial) {
        this.telaInicialView = telaInicial;
        // Atualiza a Tabela
        this.telaInicialView.atualizarTabela(this.listarTarefas(selectedFilter));
    }

    // Create
    public boolean criarTarefa(Tarefa task) {
        boolean isCreated = db.addTask(task);
        // Atualiza a Tabela
        this.telaInicialView.atualizarTabela(this.listarTarefas(selectedFilter));
        return isCreated;
    }

    // Read
    String selectedFilter = " ";
    public ArrayList<Tarefa> listarTarefas(String filter) {
        ArrayList<Tarefa> tarefas = db.getAllTasks(filter);
        this.selectedFilter = filter;
        return tarefas;
    }

    // Update
    public boolean editarTarefa(Tarefa task) {
        boolean isUpdated = db.updateTask(task);
        // Atualiza a Tabela
        this.telaInicialView.atualizarTabela(this.listarTarefas(selectedFilter));
        return isUpdated;
    }

    // Delete
    public void deletarTarefa(int id) {
        db.deleteTarefa(id);
        // Atualiza a Tabela
        this.telaInicialView.atualizarTabela(this.listarTarefas(selectedFilter));
    }
    
    // Definir ID para -1
    public void minusId(Tarefa task) {
        task.setId(-1);
    }

}
