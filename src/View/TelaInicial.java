package View;

import Model.Tarefa;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Controller.Controller;
import javax.swing.*;
import java.awt.*;
import View.util.Colors;

public final class TelaInicial extends javax.swing.JFrame {

    // Objeto de tarefa para manipular dados e verificações
    private Tarefa objectTask = new Tarefa(-1, null, null);

    Controller controller;

    private JPanel lastSelectedPanel = null;

    public TelaInicial() {
        initComponents();
        this.controller = new Controller(this);
    }
    //jTextName.setBorder(new RoundedBorder(10));

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTasks = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jNewTaskPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jEditPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDeletePanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jComboFilter = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jTextName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciador de Tarefas Pessoais");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

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
            jTableTasks.getColumnModel().getColumn(1).setMinWidth(450);
            jTableTasks.getColumnModel().getColumn(2).setMinWidth(350);
        }

        jPanel1.setBackground(new java.awt.Color(46, 32, 76));

        jNewTaskPanel.setBackground(new java.awt.Color(65, 48, 102));
        jNewTaskPanel.setToolTipText("Criar Tarefa");
        jNewTaskPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jNewTaskPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jNewTaskPanelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jNewTaskPanelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jNewTaskPanelMouseReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setText("Nova Tarefa");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/PlusIcon.png"))); // NOI18N

        javax.swing.GroupLayout jNewTaskPanelLayout = new javax.swing.GroupLayout(jNewTaskPanel);
        jNewTaskPanel.setLayout(jNewTaskPanelLayout);
        jNewTaskPanelLayout.setHorizontalGroup(
            jNewTaskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jNewTaskPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addGap(60, 60, 60))
        );
        jNewTaskPanelLayout.setVerticalGroup(
            jNewTaskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jNewTaskPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jNewTaskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jEditPanel.setBackground(new java.awt.Color(65, 48, 102));
        jEditPanel.setToolTipText("Editar Tarefa");
        jEditPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jEditPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jEditPanelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jEditPanelMouseReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setText("Editar Tarefa");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/EditIcon.png"))); // NOI18N

        javax.swing.GroupLayout jEditPanelLayout = new javax.swing.GroupLayout(jEditPanel);
        jEditPanel.setLayout(jEditPanelLayout);
        jEditPanelLayout.setHorizontalGroup(
            jEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEditPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addGap(60, 60, 60))
        );
        jEditPanelLayout.setVerticalGroup(
            jEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEditPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jEditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("JetBrains Mono Medium", 1, 24)); // NOI18N
        jLabel2.setText("Gerenciador de");

        jLabel3.setFont(new java.awt.Font("JetBrains Mono Medium", 1, 24)); // NOI18N
        jLabel3.setText("Tarefas");

        jDeletePanel.setBackground(new java.awt.Color(65, 48, 102));
        jDeletePanel.setToolTipText("Deletar Tarefa");
        jDeletePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jDeletePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jDeletePanelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jDeletePanelMouseReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("Deletar");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/TrashIcon.png"))); // NOI18N

        javax.swing.GroupLayout jDeletePanelLayout = new javax.swing.GroupLayout(jDeletePanel);
        jDeletePanel.setLayout(jDeletePanelLayout);
        jDeletePanelLayout.setHorizontalGroup(
            jDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDeletePanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addGap(60, 60, 60))
        );
        jDeletePanelLayout.setVerticalGroup(
            jDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDeletePanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jDeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEditPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30))
            .addComponent(jDeletePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jNewTaskPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel2)
                .addGap(0, 0, 0)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jNewTaskPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jEditPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jDeletePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(298, 298, 298))
        );

        jPanel2.setBackground(new java.awt.Color(65, 48, 102));

        jComboFilter.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jComboFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primeira Criada", "Nome Crescente", "Nome Decrescente" }));
        jComboFilter.setToolTipText("Selecione um Filtro");
        jComboFilter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboFilterActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("Nome:");

        jTextName.setBackground(new java.awt.Color(40, 42, 54));
        jTextName.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextName.setToolTipText("Busca por Nome");
        jTextName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNameActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(40, 42, 54));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("🔎");
        jButton1.setToolTipText("Buscar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel10)
                .addGap(10, 10, 10)
                .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel10)
                    .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Método para carregar a tabela
    public void atualizarTabela(ArrayList<Tarefa> tarefas) {
        try {
            DefaultTableModel model = (DefaultTableModel) jTableTasks.getModel();
            model.setRowCount(0); // Limpa todas as linhas da tabela

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

    // Método pegar ID tarefa Seleciona em jTableTasks
    private void jTableTasksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTasksMouseClicked
        try {
            DefaultTableModel model = (DefaultTableModel) jTableTasks.getModel();
            int selectedRow = jTableTasks.getSelectedRow();

            if (selectedRow >= 0) { // Verifica se alguma linha foi selecionada
                this.objectTask = new Tarefa(
                        (int) model.getValueAt(selectedRow, 0),
                        (String) model.getValueAt(selectedRow, 1),
                        (String) model.getValueAt(selectedRow, 2)
                );
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Nenhuma linha selecionada ou índice inválido." + e);
        } catch (Exception e) {
            System.out.println("Erro jTableTasksMouseClicked" + e);
        }
    }//GEN-LAST:event_jTableTasksMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //atualizarTabela();
    }//GEN-LAST:event_formWindowActivated

    private void jComboFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboFilterActionPerformed
        atualizarTabela(controller.listarTarefas(jComboFilter.getSelectedItem().toString())); 
        System.out.println(jComboFilter.getSelectedItem().toString());
    }//GEN-LAST:event_jComboFilterActionPerformed

    private void jNewTaskPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNewTaskPanelMousePressed
        changeColor(jNewTaskPanel, Colors.PURPLE_SEL);

    }//GEN-LAST:event_jNewTaskPanelMousePressed

    private void jNewTaskPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNewTaskPanelMouseReleased
        changeColor(jNewTaskPanel, Colors.PURPLE_BG);
        new TelaTarefa(new Tarefa(), this.controller).setVisible(true);
    }//GEN-LAST:event_jNewTaskPanelMouseReleased

    private void jEditPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEditPanelMousePressed
        changeColor(jEditPanel, Colors.PURPLE_SEL);
    }//GEN-LAST:event_jEditPanelMousePressed

    private void jEditPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEditPanelMouseReleased
        changeColor(jEditPanel, Colors.PURPLE_BG);
        try {
            if (this.objectTask.getId() != -1) {// Abre a tela para edição da tarefa
                TelaTarefa edit = new TelaTarefa(this.objectTask, this.controller);
                edit.setVisible(true);
                edit.setEditScreen(this.objectTask);

                //minusId();
            }
        } catch (Exception e) {
            System.out.println("jUpdateTaskActionPerformed" + e);
        } finally {

        }
    }//GEN-LAST:event_jEditPanelMouseReleased

    private void jDeletePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDeletePanelMousePressed
        changeColor(jDeletePanel, Colors.PURPLE_SEL);
    }//GEN-LAST:event_jDeletePanelMousePressed

    private void jDeletePanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDeletePanelMouseReleased
        changeColor(jDeletePanel, Colors.PURPLE_BG);
        try {
            // Mensagem confirmação
            String text = "Esta ação irá remover permanentemente a tarefa:\n"
                    + this.objectTask.getNome()
                    + "\nDeseja continuar?";

            // Verifica se tem uma tarefa selecionada
            if (this.objectTask.getId() != -1) {

                // Cria uma caixa de confirmação
                int option = JOptionPane.showConfirmDialog(null, text, "Confirmação", JOptionPane.YES_NO_OPTION);

                // Deleta do banco de dados
                if (option == JOptionPane.YES_OPTION) {
                    controller.deletarTarefa(this.objectTask.getId());
                }
            }
        } catch (NullPointerException e) {
            System.out.println("NPE em TelaInicial Delete Tarefa)" + e);

        } catch (Exception e) {
            System.out.println("Exception Delete Tarefa" + e);

        } finally {
            controller.minusId(objectTask);
        }
    }//GEN-LAST:event_jDeletePanelMouseReleased

    private void jNewTaskPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jNewTaskPanelMouseClicked

    }//GEN-LAST:event_jNewTaskPanelMouseClicked

    private void jTextNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNameActionPerformed

    public void changeColor(JPanel panel, Color color) {
        panel.setBackground(color);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboFilter;
    private javax.swing.JPanel jDeletePanel;
    private javax.swing.JPanel jEditPanel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jNewTaskPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableTasks;
    private javax.swing.JTextField jTextName;
    // End of variables declaration//GEN-END:variables
}
