package Model;

import java.sql.*;
import Database.ConexaoSQLite;

public class TarefaDAO {

    private final ConexaoSQLite conexaoSQLite;

    public TarefaDAO() {
        conexaoSQLite = new ConexaoSQLite();
        conexaoSQLite.conectar();
    }

    // Create
    public boolean addTask(Tarefa task) {
        String sql = "INSERT INTO tb_tarefas (nome_task, desc_task) VALUES (?, ?)";
        try (PreparedStatement stmt = conexaoSQLite.criarPreparedStatement(sql)) {
            stmt.setString(1, task.getNome());
            stmt.setString(2, task.getDescricao());
            stmt.executeUpdate();

            return true; // Inserido com Sucesso
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Falha ao Inserir
        }
    }

    // Read
    public Tarefa getTaskById(int id) {
        String sql = "SELECT * FROM tb_tarefas WHERE id_task = ?";
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
        return null;
    }

    // Update
    public void updateTask(Tarefa task) {
        String sql = "UPDATE tb_tarefas SET nome_task = ?, desc_task = ? WHERE id_task = ? ";
        try (PreparedStatement stmt = conexaoSQLite.criarPreparedStatement(sql)) {
            stmt.setString(1, task.getNome());
            stmt.setString(2, task.getDescricao());
            stmt.setInt(3, task.getId());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Delete
    public void deleteTarefa(int id) {
        String sql = "DELETE FROM tb_tarefas WHERE id_task = ?";
        try (PreparedStatement stmt = conexaoSQLite.criarPreparedStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
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
