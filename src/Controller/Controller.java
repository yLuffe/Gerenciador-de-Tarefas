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
        this.telaInicialView.atualizarTabela(this.listarTarefas(false));
    }

    // Create
    public boolean criarTarefa(Tarefa task) {
        boolean isCreated = db.addTask(task);
        this.telaInicialView.atualizarTabela(this.listarTarefas(false));
        return isCreated;
    }

    // Read
    public ArrayList<Tarefa> listarTarefas(Boolean apenasConcluidas) {
        ArrayList<Tarefa> tarefas = db.getAllTasks();
        return tarefas;
    }

    // Update
    public boolean editarTarefa(Tarefa task) {
        boolean isUpdated = db.updateTask(task);
        this.telaInicialView.atualizarTabela(this.listarTarefas(false));
        return isUpdated;
    }

    // Delete
    public void deletarTarefa(int id) {
        db.deleteTarefa(id);
        this.telaInicialView.atualizarTabela(this.listarTarefas(false));
    }
    
    // Definir ID para -1
    public void minusId(Tarefa task) {
        task.setId(-1);
    }

}
