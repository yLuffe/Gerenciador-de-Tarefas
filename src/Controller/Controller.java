package Controller;

import Model.Tarefa;
import Model.TarefaDAO;
import java.util.ArrayList;

public class Controller {

    public ArrayList<Tarefa> listarTarefas() {
        ArrayList<Tarefa> tarefas = new TarefaDAO().getAllTasks();
        return tarefas;
    }

    public void editarTarefas(Tarefa task) {
        new TarefaDAO().updateTask(task);
    }

    public void criarTarefa(Tarefa task) {
        new TarefaDAO().addTask(task);
    }

}
