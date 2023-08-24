package Model;

import java.sql.*;
import Database.ConexaoSQLite;
import java.util.ArrayList;

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
    public boolean updateTask(Tarefa task) {
        String sql = "UPDATE tb_tarefas SET nome_task = ?, desc_task = ? WHERE id_task = ? ";
        try (PreparedStatement stmt = conexaoSQLite.criarPreparedStatement(sql)) {
            stmt.setString(1, task.getNome());
            stmt.setString(2, task.getDescricao());
            stmt.setInt(3, task.getId());

            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
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

    public ArrayList<Tarefa> getAllTasks() {
        ArrayList<Tarefa> tarefas = new ArrayList<>();
        String sql = "SELECT * FROM tb_tarefas";
        
        try (PreparedStatement stmt = conexaoSQLite.criarPreparedStatement(sql); ResultSet resultSet = stmt.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id_task");
                String nome = resultSet.getString("nome_task");
                String descricao = resultSet.getString("desc_task");
                Tarefa tarefa = new Tarefa(id, nome, descricao);
                tarefas.add(tarefa);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tarefas;
    }
}
