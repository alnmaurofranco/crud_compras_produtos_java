/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;
import dao.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.*;
/**
 *
 * @author Alan
 */
public class ConsultarProduto extends javax.swing.JFrame {
    DefaultTableModel dtm = new DefaultTableModel(
            new Object[][]{},
            new Object[]{"Código", "Nome", "E-mail", "Endereco", "Data"});
    /**
     * Creates new form ConsultarCliente
     */
    public ConsultarProduto() {
        initComponents();
        setLocationRelativeTo( null );
        preencherTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtableProduto = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        label2 = new javax.swing.JLabel();
        txtEstoque = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        label3 = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jtableProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Estoque", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtableProduto.getTableHeader().setReorderingAllowed(false);
        jtableProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtableProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtableProduto);

        jButton1.setText("VOLTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnAlterar.setText("ALTERAR");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnInserir.setText("INSERIR");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label1.setText("Descrição");

        txtDescricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        label2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label2.setText("Estoque");

        txtEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        label3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label3.setText("Preço");

        btnLimpar.setText("LIMPAR");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label2)
                            .addComponent(label1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(txtEstoque))
                        .addGap(26, 26, 26)
                        .addComponent(label3)
                        .addGap(18, 18, 18)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label1)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label2)
                            .addComponent(txtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CRUD obj = new CRUD();
        obj.setVisible(true);
        ConsultarProduto.this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
            if ("".equals(txtDescricao.getText()) || "".equals(txtEstoque.getText()) || "".equals(txtValor.getText())){
            JOptionPane.showMessageDialog(null, "Você não pode deixar em branco os campos", "AVISO!", JOptionPane.WARNING_MESSAGE);
        }else {
            Produto p = new Produto();
            ProdutoDAO dao = new ProdutoDAO();

            int index = jtableProduto.getSelectedRow();
            p = dao.getListar().get(index);

            p.setDescricao(txtDescricao.getText());
            p.setEstoque(Float.parseFloat(txtEstoque.getText()));
            p.setValor(Float.parseFloat(txtValor.getText()));
            dao.altera(p);

            limparTexto();
            preencherTabela();
         }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Produto p = new Produto();
        ProdutoDAO dao = new ProdutoDAO();
        
        int index = jtableProduto.getSelectedRow();
        p = dao.getListar().get(index);
        
        dao.excluir(p);
        
        limparTexto();
        preencherTabela();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        ProdutoDAO dao = new ProdutoDAO();
        Produto as = new Produto();
        as.setDescricao(txtDescricao.getText());
        as.setEstoque(Float.parseFloat(txtEstoque.getText()));
        as.setValor(Float.parseFloat(txtValor.getText()));
        dao.adiciona(as);
        
        JOptionPane.showMessageDialog(null, "Você acabou de inserir um produto", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
        limparTexto();
        preencherTabela();
    }//GEN-LAST:event_btnInserirActionPerformed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparTexto();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void jtableProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtableProdutoMouseClicked
       Produto p = new Produto();
       ProdutoDAO dao = new ProdutoDAO();
       
       int index = jtableProduto.getSelectedRow();
       
       p = dao.getListar().get(index);
       txtDescricao.setText(p.getDescricao());
       txtEstoque.setText(String.valueOf(p.getEstoque()));
       txtValor.setText(String.valueOf(p.getValor()));
    }//GEN-LAST:event_jtableProdutoMouseClicked

    private void preencherTabela() {
        DefaultTableModel modelo = (DefaultTableModel) jtableProduto.getModel();
        modelo.setNumRows(0);
        try {
            ProdutoDAO dao = new ProdutoDAO();
            
            for (Produto p: dao.getListar())
            {
                modelo.addRow(new Object[]{
                    p.getCodigo(),
                    p.getDescricao(),
                    p.getEstoque(),
                    p.getValor()
                });
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Erro! " + e.getMessage());
        }
    }
    
    public void alterar() {
        
    }
    
    public void excluir() {
        
    }

    public void limparTexto() {
        txtDescricao.setText("");
        txtEstoque.setText("");
        txtValor.setText("");
    }
    
    /* 
    public void txtDesativado() {
        txtDescricao.setEnabled(false);
        txtEstoque.setEnabled(false);
        txtValor.setEnabled(false);
    }
    
    public void btnDesativado() {
        btnLimpar.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }
    
    public void txtAtivado() {
        txtDescricao.setEnabled(true);
        txtEstoque.setEnabled(true);
        txtValor.setEnabled(true);
    }
    
    public void btnAtivado() {
        btnLimpar.setEnabled(true);
        btnAlterar.setEnabled(true);
        btnExcluir.setEnabled(true);
    }
    */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtableProduto;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtEstoque;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
    private List<Cliente> clientes;
    private List<Contato> contatos;
}
