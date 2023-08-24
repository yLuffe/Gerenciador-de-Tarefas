package View;

import Database.ConexaoSQLite;
import Model.Tarefa;
import Model.TarefaDAO;
import View.util.LimitChars;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class TelaTarefa extends javax.swing.JFrame {

    public TelaTarefa() {
        initComponents();

        // Limitando Caracteres dos Campos
        jTextNomeTask.setDocument(new LimitChars(48));
        jTextDescTask.setDocument(new LimitChars(2048));

        jTextDescTask.getDocument().addDocumentListener(new DocumentListener() {
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
        int currentCharCount = jTextDescTask.getText().length();
        int remainingChars = 2048 - currentCharCount;
        jNumChar.setText(String.valueOf(remainingChars));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jbuttonSaveTask = new javax.swing.JButton();
        jbuttonCancel = new javax.swing.JButton();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jTextNomeTask = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextDescTask = new javax.swing.JTextArea();
        jNumChar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Criar Tarefa");
        setResizable(false);

        jLayeredPane2.setBorder(new javax.swing.border.LineBorder(javax.swing.UIManager.getDefaults().getColor("Table.selectionBackground"), 3, true));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 100, 100));
        jLabel1.setText("Nova Tarefa");

        jbuttonSaveTask.setBackground(new java.awt.Color(255, 200, 200));
        jbuttonSaveTask.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jbuttonSaveTask.setForeground(new java.awt.Color(255, 100, 100));
        jbuttonSaveTask.setText("✔");
        jbuttonSaveTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonSaveTaskActionPerformed(evt);
            }
        });

        jbuttonCancel.setBackground(new java.awt.Color(200, 240, 200));
        jbuttonCancel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jbuttonCancel.setForeground(new java.awt.Color(100, 150, 100));
        jbuttonCancel.setText("✖");
        jbuttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuttonCancelActionPerformed(evt);
            }
        });

        jLayeredPane2.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbuttonSaveTask, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbuttonCancel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(538, 538, 538)
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
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane3.setBorder(new javax.swing.border.LineBorder(javax.swing.UIManager.getDefaults().getColor("Table.selectionBackground"), 3, true));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Nome:");

        jTextNomeTask.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Descrição:");

        jTextDescTask.setColumns(20);
        jTextDescTask.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextDescTask.setLineWrap(true);
        jTextDescTask.setRows(5);
        jTextDescTask.setWrapStyleWord(true);
        jTextDescTask.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(jTextDescTask);

        jNumChar.setText("2048");

        jLayeredPane3.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jTextNomeTask, javax.swing.JLayeredPane.DEFAULT_LAYER);
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
                        .addComponent(jTextNomeTask)))
                .addGap(10, 10, 10))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(jTextNomeTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            String taskName = jTextNomeTask.getText().trim();
            String taskDesc = jTextDescTask.getText().trim();

            // Verificando se campos não estão vazios
            if (taskName.isEmpty() || taskName == null) {
                throw new Exception("Oops! Nome da tarefa em branco? Defina um nome para sua tarefa!");
            }

            if (taskDesc.isEmpty() || taskName == null) {
                throw new Exception("Eita, parece que alguém esqueceu a descrição. O campo descrição não pode estar vazio! ");
            }

            // Criando a nova tarefa
            Tarefa newTask = new Tarefa(taskName, taskDesc);

            // Inserindo no banco de dados
            boolean insertDB = new TarefaDAO().addTask(newTask);

            if (insertDB == true) {
                JOptionPane.showMessageDialog(null, "Tarefa criada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            } else {
                throw new Exception("Erro ao criar a tarefa, verifique os campos e tente novamente!");
            }
        } catch (NullPointerException e) {
            System.out.println("NPE - New Task");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        } finally {
//            new ConexaoSQLite().desconectar();
        }
    }//GEN-LAST:event_jbuttonSaveTaskActionPerformed

    private void jbuttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonCancelActionPerformed
        try {
            String text = """
                          Deseja mesmo cancelar a tarefa e volta para tela inicial?
                          Todos os dados não salvos serão perdidos para sempre!""";

            int option = JOptionPane.showConfirmDialog(null, text, "Confirmação", JOptionPane.YES_NO_OPTION);

            if (option == JOptionPane.YES_OPTION) {
                this.dispose();
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jbuttonCancelActionPerformed

    
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTarefa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLabel jNumChar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextDescTask;
    private javax.swing.JTextField jTextNomeTask;
    private javax.swing.JButton jbuttonCancel;
    private javax.swing.JButton jbuttonSaveTask;
    // End of variables declaration//GEN-END:variables
}
