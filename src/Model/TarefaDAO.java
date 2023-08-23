package Model;

import Model.Tarefa;
import java.sql.*;
import Database.ConexaoSQLite;

public class TarefaDAO {
    
    private final ConexaoSQLite conexaoSQLite;
    
    public TarefaDAO(){
        conexaoSQLite = new ConexaoSQLite();
        conexaoSQLite.conectar();
    }
    
    // Create
    public void addTask(Tarefa task) {
        String sql = "INSERT INTO tb_tarefas (nome_task, desc_task) VALUES (?, ?)";
        try (PreparedStatement stmt = conexaoSQLite.criarPreparedStatement(sql)) {
            stmt.setString(1, task.getNome());
            stmt.setString(1, task.getDescricao());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Ler
    public Terefa getTaskById(int id) {
        String sql = "SELECT * FROM tb_tarefas WHERE id = ?";
        try (PreparedStatement stmt = conexaoSQLite.criarPreparedStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet resultSet = stmt.executeQuery()) {
                if (resultSet.next()) {
                    String nome = resultSet.getString("nome_task");
                    String descricao = resultSet.getString("desc_task");
                    return new Tarefa(id, nome, descricao);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    


}

//    // ArrayList simulando Banco de Dados
//    private ArrayList<Tarefa> listaTarefas = new ArrayList<>();
//
//    // Adicionar (Create)
//    public void addTarefa(Tarefa task) {
//        listaTarefas.add(task);
//    }
//
//    // Ler (Read)
//    public ArrayList<Tarefa> getListaTarefas() {
//        return listaTarefas;
//    }
//
//    // Atualizar (Update)
//    public void updateTarefa(String oldName, String newName, String descricao) {
//        int index = searchIndex(oldName);
//        if (index != -1) {
//            Tarefa task = listaTarefas.get(index);
//            task.setNome(newName);
//            task.setDescricao(descricao);
//        }
//    }
//
//    // Remover (Delete)
//    public void deleteTarefa(String nome) {
//        int index = searchIndex(nome);
//        if (index != -1) {
//            listaTarefas.remove(index);
//        }
//
//    }
//
//    // Procura Indice no Array por Nome
//    public int searchIndex(String nomeTarefa) {
//        for (int i = 0; i < listaTarefas.size(); i++) {
//            Tarefa tarefa = listaTarefas.get(i);
//            if (tarefa.getNome().equalsIgnoreCase(nomeTarefa)) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    public int searchIndex(int idTarefa) {
//        for (int i = 0; i < listaTarefas.size(); i++) {
//            Tarefa tarefa = listaTarefas.get(i);
//
//            if (tarefa.getId() == idTarefa) {
//                return i;
//            }
//        }
//        return -1;
//    }
