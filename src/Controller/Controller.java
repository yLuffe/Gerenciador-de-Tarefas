package Controller;

import Model.Tarefa;
import Model.TarefaDAO;
import java.util.ArrayList;
import View.TelaInicial;

public class Controller {
    TarefaDAO db = new TarefaDAO();
    TelaInicial telaInicialView = null;
    public Controller(TelaInicial telaInicial ) {
        this.telaInicialView = telaInicial;
        this.telaInicialView.atualizarTabela(this.listarTarefas(false));
    }

    public ArrayList<Tarefa> listarTarefas(Boolean apenasConcluidas) {
        ArrayList<Tarefa> tarefas = db.getAllTasks();
        return tarefas;
    }

    public boolean editarTarefas(Tarefa task) {
        boolean isUpdated = db.updateTask(task);
        this.telaInicialView.atualizarTabela(this.listarTarefas(false));
        return isUpdated;
    }

    public boolean criarTarefa(Tarefa task) {
        boolean isCreated =  db.addTask(task);
        this.telaInicialView.atualizarTabela(this.listarTarefas(false));
        return isCreated;
    }

    public void deletarTarefa(int id) {
        db.deleteTarefa(id);
        this.telaInicialView.atualizarTabela(this.listarTarefas(false));
    }

}
