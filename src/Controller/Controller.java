package Controller;

import Model.Tarefa;
import Model.TarefaDAO;
import java.util.ArrayList;
import View.TelaInicial;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;

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
    public boolean criarTarefa(Tarefa task) throws Exception {
        try {
            boolean isCreated = db.addTask(task);
            // Atualiza a Tabela
            this.telaInicialView.atualizarTabela(this.listarTarefas(selectedFilter));
            return isCreated;
        } catch (Exception e) {
            throw new Exception("Erro ao criar tarefa", e);
        }
    }

    // Read
    String selectedFilter = "";

    public ArrayList<Tarefa> listarTarefas(String filter) {
        try {
            ArrayList<Tarefa> tarefas = db.getAllTasks();
            ArrayList<Tarefa> tarefasFiltradas = new ArrayList<>();
            switch (filter.toLowerCase().trim()) {
                case "nome crescente" ->
                    Collections.sort(tarefas, Comparator.comparing(Tarefa::getNome));
                case "nome decrescente" ->
                    Collections.sort(tarefas, Comparator.comparing(Tarefa::getNome).reversed());
                case "primeira criada" ->
                    Collections.sort(tarefas, Comparator.comparing(Tarefa::getId));
                case "última criada" ->
                    Collections.sort(tarefas, Comparator.comparing(Tarefa::getId).reversed());
                default -> {
                    for (Tarefa tarefa : tarefas) {
                        if (tarefa.getNome().toLowerCase().contains(filter)) {
                            tarefasFiltradas.add(tarefa);
                        } else {
                            throw new Exception("Não foram encontradas tarefas com esse nome");
                        }
                    }
                    return tarefasFiltradas;
                }
            }

            this.selectedFilter = filter;
            return tarefas;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return listarTarefas("primeira criada");

    }

    // Update
    public boolean editarTarefa(Tarefa task) throws Exception {
        try {
            boolean isUpdated = db.updateTask(task);

            // Atualiza a Tabela
            this.telaInicialView.atualizarTabela(this.listarTarefas(selectedFilter));
            return isUpdated;
        } catch (Exception e) {
            throw new Exception("Erro ao editar tarefa", e);
        }
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
