package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class ConexaoSQLite {

    private Connection conexao;

    public Connection getConexao() {
        return this.conexao;
    }

    //Método para realizar a conexão com o banco de dados
    public boolean conectar() {
        try {
            String url = "jdbc:sqlite:database/tarefas_db.db";

            this.conexao = DriverManager.getConnection(url);
            System.out.println("Conexão estabelecida com sucesso!");

            return true;
        } catch (SQLException e) {
            System.err.println("Erro ao estabelecer a conexão: " + e.getMessage());
            e.printStackTrace();

            return false;
        }
    }

    //Método para realiar a conexão com o banco de dados
    public boolean desconectar() {
        try {
            if (this.conexao != null && !this.conexao.isClosed()) {
                this.conexao.close();
                System.out.println("Conexão finalizada com sucesso!");
                return true;
            } else {
                System.out.println("Nenhuma conexão para fechar.");
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    //Cria um PreparedStatement com a consulta SQL dada
    public PreparedStatement criarPreparedStatement(String sql) {
        try {
            return this.conexao.prepareStatement(sql);
        } catch (SQLException e) {
            System.err.println("Erro ao criar PreparedSTMT");
            e.printStackTrace();
            return null;
        }
    }
}
