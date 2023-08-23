package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class ConexaoSQLite {

    //Variável para armazenar uma conexão com banco de dados
    private Connection conexao;

    public Connection getConexao() {
        return this.conexao;
    }

    //Conexão com o banco de dados
    public boolean conectar() {

        try {
            String url = "jdbc:sqlite:database/tarefas_db.db";

            this.conexao = DriverManager.getConnection(url);

        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }
        System.out.println("Conectado!");
        return true;
    }

    //Desconexão do banco de dados
    public boolean desconectar() {

        try {
            if (this.conexao.isClosed() == false) {
                this.conexao.close();
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }
        System.out.println("Desconectado!");
        return true;
    }

    //Cria um objeto Statement para consultas SQL
    public Statement criarStatement() {
        try {
            return this.conexao.createStatement();
        } catch (SQLException e) {
            return null;
        }
    }
    
    //Cria um PreparedStatement com a consulta SQL dada
    public PreparedStatement criarPreparedStatement(String sql){
        try{
            return this.conexao.prepareStatement(sql);
        }catch(SQLException e){
            return null;
        }
    }
}
