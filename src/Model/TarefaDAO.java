package Model;

import Model.Tarefa;
import java.util.*;

public class TarefaDAO {

    // ArrayList simulando Banco de Dados
    private ArrayList<Tarefa> listaTarefas = new ArrayList<>();

    // Adicionar (Create)
    public void addTarefa(Tarefa task) {
        listaTarefas.add(task);
    }

    // Ler (Read)
    public ArrayList<Tarefa> getListaTarefas() {
        return listaTarefas;
    }
    
    // Atualizar (Update)
    public void updateTarefa(String oldName, String newName, String descricao) {
        int index = searchIndex(oldName);
        if (index != -1) {
            Tarefa task = listaTarefas.get(index);
            task.setNome(newName);
            task.setDescricao(descricao);
        }
    }

    // Remover (Delete)
    public void deleteTarefa(String nome) {
        int index = searchIndex(nome);
        if (index != -1) {
            listaTarefas.remove(index);
        }

    }

    // Procura Indice no Array por Nome
    public int searchIndex(String nomeTarefa) {
        for (int i = 0; i < listaTarefas.size(); i++) {
            Tarefa tarefa = listaTarefas.get(i);
            if (tarefa.getNome().equalsIgnoreCase(nomeTarefa)) {
                return i;
            }

        }
        return -1;
    }

}
