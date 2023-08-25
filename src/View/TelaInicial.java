package View;

import Database.ConexaoSQLite;
import Model.Tarefa;
import Model.TarefaDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class TelaInicial extends javax.swing.JFrame {

    Tarefa objectTask = new Tarefa(-1, null, null);

    public TelaInicial() {
        initComponents();
        atualizarTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTasks = new javax.swing.JTable();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jCreateTask = new javax.swing.JButton();
        jUpdateTask = new javax.swing.JButton();
        jDeleteTask = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuOpcoes = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciador de Tarefas Pessoais");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTableTasks.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTableTasks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tarefa", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTasks.getTableHeader().setReorderingAllowed(false);
        jTableTasks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTasksMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTasks);
        if (jTableTasks.getColumnModel().getColumnCount() > 0) {
            jTableTasks.getColumnModel().getColumn(0).setMinWidth(0);
            jTableTasks.getColumnModel().getColumn(0).setMaxWidth(0);
            jTableTasks.getColumnModel().getColumn(1).setMinWidth(200);
            jTableTasks.getColumnModel().getColumn(2).setMinWidth(600);
        }

        jLayeredPane2.setBorder(new javax.swing.border.LineBorder(javax.swing.UIManager.getDefaults().getColor("Table.selectionBackground"), 3, true));

        jCreateTask.setBackground(new java.awt.Color(200, 240, 200));
        jCreateTask.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jCreateTask.setForeground(new java.awt.Color(100, 150, 100));
        jCreateTask.setText("Nova Tarefa");
        jCreateTask.setToolTipText("Criar Nova Tarefa");
        jCreateTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCreateTaskActionPerformed(evt);
            }
        });

        jUpdateTask.setBackground(new java.awt.Color(200, 220, 240));
        jUpdateTask.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jUpdateTask.setForeground(new java.awt.Color(80, 100, 120));
        jUpdateTask.setText("Editar Tarefa");
        jUpdateTask.setToolTipText("Editar Tarefa");
        jUpdateTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdateTaskActionPerformed(evt);
            }
        });

        jDeleteTask.setBackground(new java.awt.Color(255, 200, 200));
        jDeleteTask.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jDeleteTask.setForeground(new java.awt.Color(255, 100, 100));
        jDeleteTask.setText("Apagar");
        jDeleteTask.setToolTipText("Deletar Tarefa");
        jDeleteTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteTaskActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton1.setText("↻");
        jButton1.setToolTipText("Recarregar Tabela");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLayeredPane2.setLayer(jCreateTask, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jUpdateTask, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jDeleteTask, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDeleteTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jUpdateTask, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(jCreateTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jCreateTask, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jUpdateTask, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jDeleteTask, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLayeredPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLayeredPane2)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLayeredPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        jMenuOpcoes.setText("Opções");

        jMenuItem1.setText("Backup");
        jMenuOpcoes.add(jMenuItem1);

        jMenuSair.setText("Sair");
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });
        jMenuOpcoes.add(jMenuSair);

        jMenuBar1.add(jMenuOpcoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLayeredPane1)
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLayeredPane1)
                .addGap(5, 5, 5))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Método para carregar a tabela
    public void atualizarTabela() {
        try {
            DefaultTableModel model = (DefaultTableModel) jTableTasks.getModel();
            model.setRowCount(0); // Limpa todas as linhas da tabela

            TarefaDAO tarefaDAO = new TarefaDAO();
            ArrayList<Tarefa> tarefas = tarefaDAO.getAllTasks(); // Chama o método para obter todas as tarefas

            for (Tarefa task : tarefas) {
                model.addRow(new Object[]{
                    task.getId(),
                    task.getNome(),
                    task.getDescricao()
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar a tabela\n" + e, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para fechar o sistema
    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuSairActionPerformed

    // Método abrir TelaTarefa
    private void jCreateTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCreateTaskActionPerformed
        TelaTarefa newTela = new TelaTarefa(new Tarefa());
        newTela.setVisible(true);

    }//GEN-LAST:event_jCreateTaskActionPerformed

    // Método Deletar Tarefa
    private void jDeleteTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteTaskActionPerformed
        try {
            // Mensagem confirmação
            String text = "Esta ação irá remover permanentemente a tarefa:\n"
                    + objectTask.getNome()
                    + "\nDeseja continuar?";

            // Verifica se tem uma tarefa selecionada
            if (objectTask.getId() != -1) {

                // Cria uma caixa de confirmação
                int option = JOptionPane.showConfirmDialog(null, text, "Confirmação", JOptionPane.YES_NO_OPTION);

                // Deleta do banco de dados
                if (option == JOptionPane.YES_OPTION) {
                    new TarefaDAO().deleteTarefa(objectTask.getId());
                    //JOptionPane.showMessageDialog(null, "Tarefa deletada com sucesso!", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
                    objectTask.setId(-1);
                }
                objectTask.setId(-1);
            }
        } catch (NullPointerException e) {
            System.out.println("NPE em TelaInicial Delete Tarefa)" + e);

        } catch (Exception e) {
            System.out.println("Exception Delete Tarefa" + e);

        } finally {
            atualizarTabela();
        }
    }//GEN-LAST:event_jDeleteTaskActionPerformed

    // Método pegar ID tarefa Seleciona em jTableTasks
    private void jTableTasksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTasksMouseClicked
        try {
            DefaultTableModel model = (DefaultTableModel) jTableTasks.getModel();
            int selectedRow = jTableTasks.getSelectedRow();

            if (selectedRow >= 0) { // Verifica se alguma linha foi selecionada
                Object idValue = model.getValueAt(selectedRow, 0);
                Object nomeValue = model.getValueAt(selectedRow, 1);
                Object descricaoValue = model.getValueAt(selectedRow, 2);

                this.objectTask = new Tarefa((int) idValue, (String) nomeValue, (String) descricaoValue);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Nenhuma linha selecionada ou índice inválido." + e);
        } catch (Exception e) {
            System.out.println("Erro jTableTasksMouseClicked" + e);
        }
    }//GEN-LAST:event_jTableTasksMouseClicked

    // Método edição tarefa
    private void jUpdateTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateTaskActionPerformed
        try {
            if (objectTask.getId() != -1) {// Abre a tela para edição da tarefa
                TelaTarefa edit = new TelaTarefa(objectTask);
                edit.setVisible(true);
                edit.setEditScreen(objectTask);

                objectTask.setId(-1);
            }
        } catch (Exception e) {
            System.out.println("jUpdateTaskActionPerformed" + e);
        }
    }//GEN-LAST:event_jUpdateTaskActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        atualizarTabela();    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        atualizarTabela();
    }//GEN-LAST:event_formWindowActivated

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jCreateTask;
    private javax.swing.JButton jDeleteTask;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jMenuOpcoes;
    private javax.swing.JMenuItem jMenuSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTasks;
    private javax.swing.JButton jUpdateTask;
    // End of variables declaration//GEN-END:variables
}
