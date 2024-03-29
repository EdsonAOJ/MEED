/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MeedView;

import Controller.ProdutoController;
import Controller.ProdutoTable;
import DAO.ProdutoDAO;
import Model.NotaProd;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author matheus.bmelo
 */
public class Produto extends javax.swing.JFrame {

    /**
     * Creates new form Produto
     */
    private ProdutoController controller;
    private ProdutoTable tableController;

    DefaultTableModel modelo;
    int filas;

    public Produto() {
        initComponents();
        modelo = new DefaultTableModel();
        modelo.addColumn("QntEstoque");
        modelo.addColumn("Nomeproduto");
        modelo.addColumn("PrecoVend");
        this.TableProd.setModel(modelo);

        controller = new ProdutoController();
        tableController = new ProdutoTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelVendas = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Nomeproduto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        PrecoVend = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();
        txtPesquisar = new javax.swing.JTextField();
        jLlabel4 = new javax.swing.JLabel();
        QntEstoque = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableProd = new javax.swing.JTable();
        excluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produtos");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Formulario"));

        jLabel1.setText("Nome Produto");

        Nomeproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeprodutoActionPerformed(evt);
            }
        });

        jLabel3.setText("Preço da Venda");

        btSalvar.setText("salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btPesquisar.setText("Pesquisa: Nome Produto");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        txtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarActionPerformed(evt);
            }
        });

        jLlabel4.setText("Quantidade Estoque");

        QntEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QntEstoqueActionPerformed(evt);
            }
        });

        TableProd.setModel(new ProdutoTable());
        TableProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableProdMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableProd);

        excluir.setText("excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLlabel4)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Nomeproduto, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(QntEstoque)
                            .addComponent(PrecoVend))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btPesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(excluir)))
                        .addGap(120, 120, 120)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLlabel4)
                    .addComponent(QntEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvar)
                    .addComponent(btEditar)
                    .addComponent(excluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nomeproduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(PrecoVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisar)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addContainerGap())
        );

        PainelVendas.addTab("NovoProduto", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        // TODO add your handling code here:
        String[] info = new String[3];
        info[0] = QntEstoque.getText();
        info[1] = Nomeproduto.getText();
        info[2] = PrecoVend.getText();

        for (int i = 0; i < TableProd.getColumnCount(); i++) {
            modelo.setValueAt(info[i], filas, i);
        }

    }//GEN-LAST:event_btEditarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        String[] info = new String[3];
        info[0] = QntEstoque.getText();
        info[1] = Nomeproduto.getText();
        info[2] = PrecoVend.getText();
        modelo.addRow(info);
        QntEstoque.setText("");
        Nomeproduto.setText("");
        PrecoVend.setText("");
        

        /*  Primeiro modelo para preencher a tabela, mas achamos um método mais eficiente
        
        String nomeProd;
        double precoVend;
        int quantEstoq;

        quantEstoq = Integer.parseInt(QntEstoque.getText());
        nomeProd = (Nomeproduto.getText());// pegando a informacao do campo de nota String e transformando em inteiro
        precoVend = Double.parseDouble(PrecoVend.getText());

        ProdutoController.salvar(nomeProd, precoVend, quantEstoq);
        refreshTable();

         */
    }//GEN-LAST:event_btSalvarActionPerformed

    private void NomeprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeprodutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeprodutoActionPerformed

    private void QntEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QntEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QntEstoqueActionPerformed

    private void TableProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableProdMouseClicked
        // TODO add your handling code here:
        int selecao = TableProd.getSelectedRow();
        QntEstoque.setText(TableProd.getValueAt(selecao, 0).toString());
        Nomeproduto.setText(TableProd.getValueAt(selecao, 1).toString());
        PrecoVend.setText(TableProd.getValueAt(selecao, 2).toString());
        filas = selecao;

    }//GEN-LAST:event_TableProdMouseClicked

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        // TODO add your handling code here:
        int fila = TableProd.getSelectedRow();
        if (fila >= 0) {
            modelo.removeRow(fila);

        } else {
            JOptionPane.showMessageDialog(null, "Selecionar Fila");
        }

    }//GEN-LAST:event_excluirActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        // TODO add your handling code here:
        String buscar = txtPesquisar.getText();
        ProdutoDAO.Buscar(buscar);

        txtPesquisar.setText("");


    }//GEN-LAST:event_btPesquisarActionPerformed
    public void CarregaDados(NotaProd pesquisa) {
        this.QntEstoque.setText(Double.toString(pesquisa.getQuantEstoq()));
        this.Nomeproduto.setText(pesquisa.getNomeProduto());
        this.PrecoVend.setText(Double.toString(pesquisa.getPrecoVend()));
    }
    private void txtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarActionPerformed
    public void refreshTable() {
        TableProd.invalidate();
        TableProd.repaint();
        PainelVendas.invalidate();
        PainelVendas.repaint();
    }

    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Produto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Nomeproduto;
    private javax.swing.JTabbedPane PainelVendas;
    private javax.swing.JTextField PrecoVend;
    private javax.swing.JTextField QntEstoque;
    private javax.swing.JTable TableProd;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton excluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLlabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
