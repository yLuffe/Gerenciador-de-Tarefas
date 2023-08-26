package View;

import Model.Tarefa;
import View.util.LimitChars;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import Controller.Controller;

public class TelaTarefa extends javax.swing.JFrame {

    // Método que recebe os valores da tabela e joga nos campos nome e descrição
    public void setEditScreen(Tarefa tarefa) {
        jTextNome.setText(tarefa.getNome());
        jTextDesc.setText(tarefa.getDescricao());
        jTitulo.setText("Editar Tarefa");
        setTitle("Editar Tarefa");
    }

    Tarefa task = null;

    Controller controller;
    public TelaTarefa(Tarefa tarefa, Controller controllerTask ) {
        this.task = tarefa;
        this.controller = controllerTask;
        initComponents();

        // Limitando Caracteres dos Campos
        jTextNome.setDocument(new LimitChars(48));
        jTextDesc.setDocument(new LimitChars(2048));

        jTextDesc.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateCharCount();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateCharCount();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateCharCount();
            }
        });

        updateCharCount();
    }

    private void updateCharCount() {
        int currentCharCount = jTextDesc.getText().length();
        int remainingChars = 2048 - currentCharCount;
        jNumChar.setText(String.valueOf(remainingChars));

        if (remainingChars <= 100) {
            jNumChar.setForeground(Color.RED);
        } else {
            jNumChar.setForeground(Color.WHITE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane2 = new javax.swing.JLayeredPane();
        jTitulo = new javax.swing.JLabel();
        jbuttonSaveTask = new javax.swing.JButton();
        jbuttonCancel = new javax.swing.JButton();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextDesc = new javax.swing.JTextArea();
        jNumChar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Criar Tarefa");
        setResizable(false);

        jLayeredPane2.setBorder(new javax.swing.border.LineBorder(javax.swing.UIManager.getDefaults().getColor("Table.selectionBackground"), 3, true));

        jTitulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jTitulo.setForeground(new java.awt.Color(255, 100, 100));
        jTitulo.setText("Nova Tarefa");

        jbuttonSaveTask.setBackground(new java.awt.Color(200, 240, 200));
        jbuttonSaveTask.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jbuttonSaveTask.setForeground(new java.awt.Color(100, 150, 100));
        jbuttonSaveTask.setText("✔");
        jbuttonSaveTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonSaveTaskActionPerformed(evt);
            }
        });

        jbuttonCancel.setBackground(new java.awt.Color(255, 200, 200));
        jbuttonCancel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jbuttonCancel.setForeground(new java.awt.Color(255, 100, 100));
        jbuttonCancel.setText("✖");
        jbuttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonCancelActionPerformed(evt);
            }
        });

        jLayeredPane2.setLayer(jTitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbuttonSaveTask, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbuttonCancel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 538, Short.MAX_VALUE)
                .addComponent(jbuttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jbuttonSaveTask, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jbuttonSaveTask, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbuttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTitulo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane3.setBorder(new javax.swing.border.LineBorder(javax.swing.UIManager.getDefaults().getColor("Table.selectionBackground"), 3, true));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Nome:");

        jTextNome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Descrição:");

        jTextDesc.setColumns(20);
        jTextDesc.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextDesc.setLineWrap(true);
        jTextDesc.setRows(5);
        jTextDesc.setWrapStyleWord(true);
        jTextDesc.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(jTextDesc);

        jNumChar.setText("2048");

        jLayeredPane3.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jTextNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jNumChar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jNumChar))
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextNome)))
                .addGap(10, 10, 10))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jNumChar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane2)
                    .addComponent(jLayeredPane3))
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbuttonSaveTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonSaveTaskActionPerformed

        // Bloco Try-Catch para validação de entrada
        try {

            this.task.setNome(jTextNome.getText().trim());
            this.task.setDescricao(jTextDesc.getText().trim());

            // Verificando se campos não estão vazios
            this.task.validate();

            // Criando a nova tarefa
            if (this.task.getId() > 0) { // Comando se for editar tarefa      

                boolean insertDB = this.controller.editarTarefa(this.task);

                if (insertDB == true) {
                    JOptionPane.showMessageDialog(null, "Tarefa atualizada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                } else {
                    throw new Exception("Erro ao editar a tarefa, verifique os campos e tente novamente!");
                }
            } else { // Comando se for adicionar tarefa

                // Inserindo no banco de dados
                boolean insertDB = this.controller.criarTarefa(this.task);

                if (insertDB == true) {
                    JOptionPane.showMessageDialog(null, "Tarefa criada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                } else {
                    throw new Exception("Erro ao criar a tarefa, verifique os campos e tente novamente!");
                }
            }
        } catch (NullPointerException e) {
            System.out.println("NPE - New or Edit Task" + e);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jbuttonSaveTaskActionPerformed

    private void jbuttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonCancelActionPerformed
        try {
            String text = """
                          Deseja mesmo cancelar e voltar para tela inicial?
                          Todos os dados não salvos serão perdidos para sempre!""";

            int option = JOptionPane.showConfirmDialog(null, text, "Confirmação", JOptionPane.YES_NO_OPTION);

            if (option == JOptionPane.YES_OPTION) {
                this.dispose();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jbuttonCancelActionPerformed

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTarefa(new Tarefa(), null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLabel jNumChar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextDesc;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JLabel jTitulo;
    private javax.swing.JButton jbuttonCancel;
    private javax.swing.JButton jbuttonSaveTask;
    // End of variables declaration//GEN-END:variables
}
