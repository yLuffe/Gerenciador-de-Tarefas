package Main;

import Database.ConexaoSQLite;
import View.TelaInicial;
import com.formdev.flatlaf.*;
import javax.swing.UIManager;

public class Main {

    public static void main(String[] args) {

        // Altera o nome dos botões de YES e NO do JOP para SIM e NÃO
        UIManager.put("OptionPane.yesButtonText", "Sim");
        UIManager.put("OptionPane.noButtonText", "Não");

        // Ativa o tema Darcula
        FlatDarculaLaf.setup();

        // Mostra a tela inicial
        new TelaInicial().setVisible(true);

        // Chamando banco de dados e conectando
        ConexaoSQLite connect = new ConexaoSQLite();
        connect.conectar();

        // Registrar o shutdown hook para desconectar a conexão
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            connect.desconectar();
        }));
    }

}
