package br.com.freitas_store.view;

import br.com.freitas_store.ctr.RoupasCTR;
import br.com.freitas_store.ctr.UsuarioCTR;
import br.com.freitas_store.ctr.VendaCTR;
import br.com.freitas_store.dto.RoupasDTO;
import br.com.freitas_store.dto.UsuarioDTO;
import br.com.freitas_store.dto.VendaDTO;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VendaVIEW extends javax.swing.JInternalFrame {

    VendaCTR vendaCTR = new VendaCTR();
    VendaDTO vendaDTO = new VendaDTO();
    RoupasCTR roupasCTR = new RoupasCTR();
    RoupasDTO roupasDTO = new RoupasDTO();
    UsuarioDTO usuarioDTO = new UsuarioDTO();
    UsuarioCTR usuarioCTR = new UsuarioCTR();

    ResultSet rs = null;
    int gravar_alterar;

    DefaultTableModel modelo_jtl_consultar_usuario;
    DefaultTableModel modelo_jtl_consultar_roupas;
    DefaultTableModel modelo_jtl_consultar_roupas_selecionado;

    public VendaVIEW() {
        initComponents();
        libera_campos(false);
        libera_botoes(true, false, false);

        modelo_jtl_consultar_usuario = (DefaultTableModel) jtl_consultar_usuario.getModel();
        modelo_jtl_consultar_roupas = (DefaultTableModel) jtl_consultar_roupas.getModel();
        modelo_jtl_consultar_roupas_selecionado = (DefaultTableModel) jtl_consultar_roupas_selecionado.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        total_venda = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAdiciona = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        pesquisar_usuario = new javax.swing.JTextField();
        pesquisar_roupas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtl_consultar_usuario = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtl_consultar_roupas = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtl_consultar_roupas_selecionado = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setTitle("Venda");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/dolar.png"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setText("CLIENTE:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 90, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setText("DESCRIÇÃO:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 90, 30));

        total_venda.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        total_venda.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        total_venda.setText("0.00");
        getContentPane().add(total_venda, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 100, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setText("TOTAL VENDA:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 100, 30));

        btnAdiciona.setBackground(new java.awt.Color(255, 255, 204));
        btnAdiciona.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnAdiciona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/add.png"))); // NOI18N
        btnAdiciona.setText("ADICIONA");
        btnAdiciona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdiciona, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 130, 30));

        btnRemove.setBackground(new java.awt.Color(255, 255, 204));
        btnRemove.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/remove.png"))); // NOI18N
        btnRemove.setText("REMOVE");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, 130, 30));

        btnNovo.setBackground(new java.awt.Color(255, 255, 204));
        btnNovo.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/add.png"))); // NOI18N
        btnNovo.setText("NOVO");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 120, 30));

        btnSalvar.setBackground(new java.awt.Color(255, 255, 204));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/salvar.png"))); // NOI18N
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 120, 30));

        btnLimpar.setBackground(new java.awt.Color(255, 255, 204));
        btnLimpar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/limpar.png"))); // NOI18N
        btnLimpar.setText("LIMPAR");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 120, 30));

        pesquisar_usuario.setBackground(new java.awt.Color(255, 255, 204));
        pesquisar_usuario.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        pesquisar_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pesquisar_usuarioKeyReleased(evt);
            }
        });
        getContentPane().add(pesquisar_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 180, 30));

        pesquisar_roupas.setBackground(new java.awt.Color(255, 255, 204));
        pesquisar_roupas.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        pesquisar_roupas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pesquisar_roupasKeyReleased(evt);
            }
        });
        getContentPane().add(pesquisar_roupas, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 180, 30));

        jtl_consultar_usuario.setBackground(new java.awt.Color(255, 255, 204));
        jtl_consultar_usuario.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jtl_consultar_usuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtl_consultar_usuario);
        if (jtl_consultar_usuario.getColumnModel().getColumnCount() > 0) {
            jtl_consultar_usuario.getColumnModel().getColumn(0).setResizable(false);
            jtl_consultar_usuario.getColumnModel().getColumn(1).setResizable(false);
            jtl_consultar_usuario.getColumnModel().getColumn(1).setPreferredWidth(500);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 270, 130));

        jtl_consultar_roupas.setBackground(new java.awt.Color(255, 255, 204));
        jtl_consultar_roupas.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jtl_consultar_roupas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DESCRIÇÃO", "VALOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtl_consultar_roupas);
        if (jtl_consultar_roupas.getColumnModel().getColumnCount() > 0) {
            jtl_consultar_roupas.getColumnModel().getColumn(0).setResizable(false);
            jtl_consultar_roupas.getColumnModel().getColumn(1).setResizable(false);
            jtl_consultar_roupas.getColumnModel().getColumn(1).setPreferredWidth(300);
            jtl_consultar_roupas.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 270, 130));

        jtl_consultar_roupas_selecionado.setBackground(new java.awt.Color(255, 255, 204));
        jtl_consultar_roupas_selecionado.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jtl_consultar_roupas_selecionado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "VALOR", "QTD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtl_consultar_roupas_selecionado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtl_consultar_roupas_selecionadoKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(jtl_consultar_roupas_selecionado);
        if (jtl_consultar_roupas_selecionado.getColumnModel().getColumnCount() > 0) {
            jtl_consultar_roupas_selecionado.getColumnModel().getColumn(0).setResizable(false);
            jtl_consultar_roupas_selecionado.getColumnModel().getColumn(0).setPreferredWidth(50);
            jtl_consultar_roupas_selecionado.getColumnModel().getColumn(1).setResizable(false);
            jtl_consultar_roupas_selecionado.getColumnModel().getColumn(1).setPreferredWidth(200);
            jtl_consultar_roupas_selecionado.getColumnModel().getColumn(2).setResizable(false);
            jtl_consultar_roupas_selecionado.getColumnModel().getColumn(3).setResizable(false);
            jtl_consultar_roupas_selecionado.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 270, 170));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/tela_venda.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisar_usuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisar_usuarioKeyReleased
        if (!pesquisar_usuario.getText().equalsIgnoreCase(""))
            preenche_tabela_usuario(pesquisar_usuario.getText());
    }//GEN-LAST:event_pesquisar_usuarioKeyReleased

    private void pesquisar_roupasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisar_roupasKeyReleased
        if (!pesquisar_roupas.getText().equalsIgnoreCase(""))
            preenche_tabela_roupas(pesquisar_roupas.getText());
    }//GEN-LAST:event_pesquisar_roupasKeyReleased

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        libera_campos(true);
        libera_botoes(false, true, true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (verifica_preenchimento()) {
            gravar();
            limpa_campos();
            libera_campos(false);
            libera_botoes(true, false, false);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpa_campos();
        libera_campos(false);
        modelo_jtl_consultar_usuario.setNumRows(0);
        modelo_jtl_consultar_roupas.setNumRows(0);
        libera_botoes(true, false, false);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnAdicionaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionaActionPerformed
        adicionar_roupas_selecionada(
                Integer.parseInt(String.valueOf(jtl_consultar_roupas.getValueAt(
                        jtl_consultar_roupas.getSelectedRow(), 0))),
                String.valueOf(jtl_consultar_roupas.getValueAt(jtl_consultar_roupas.getSelectedRow(), 1)),
                Double.parseDouble(String.valueOf(jtl_consultar_roupas.getValueAt(
                        jtl_consultar_roupas.getSelectedRow(), 2)))
        );
    }//GEN-LAST:event_btnAdicionaActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        remover_roupas_selecionada(jtl_consultar_roupas_selecionado.getSelectedRow());
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void jtl_consultar_roupas_selecionadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtl_consultar_roupas_selecionadoKeyReleased
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            calcula_total_venda();
        }
    }//GEN-LAST:event_jtl_consultar_roupas_selecionadoKeyReleased

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    private void gravar() {
        vendaDTO.setData_venda(new Date());
        vendaDTO.setValor_venda(Double.parseDouble(total_venda.getText()));
        usuarioDTO.setId_usuario(Integer.parseInt(String.valueOf(
                jtl_consultar_usuario.getValueAt(jtl_consultar_usuario.getSelectedRow(), 0))));

        JOptionPane.showMessageDialog(null,
                vendaCTR.inserir_venda(vendaDTO, usuarioDTO, jtl_consultar_roupas_selecionado)
        );
    }

    private void preenche_tabela_usuario(String nome_usuario) {
        try {
            modelo_jtl_consultar_usuario.setNumRows(0);

            usuarioDTO.setNome_usuario(nome_usuario);
            rs = usuarioCTR.consultar_usuario(usuarioDTO, 1);

            while (rs.next()) {
                modelo_jtl_consultar_usuario.addRow(new Object[]{
                    rs.getString("id_usuario"),
                    rs.getString("nome_usuario")
                });
            }
        } catch (SQLException e) {
            System.out.println("Erro SQL: " + e.getMessage());
        }
    }

    private void preenche_tabela_roupas(String descricao_roupas) {
        try {
            modelo_jtl_consultar_roupas.setNumRows(0);
            roupasDTO.setDescricao_roupas(descricao_roupas);
            rs = roupasCTR.consultar_roupas(roupasDTO, 1);

            while (rs.next()) {
                modelo_jtl_consultar_roupas.addRow(new Object[]{
                    rs.getString("id_roupas"),
                    rs.getString("descricao_roupas"),
                    rs.getDouble("preco_venda_roupas")
                });
            }
        } catch (SQLException e) {
            System.out.println("Erro SQL: " + e.getMessage());
        }
    }

    private void adicionar_roupas_selecionada(int id_roupas, String descricao_roupas, double preco_venda_roupas) {
        try {
            modelo_jtl_consultar_roupas_selecionado.addRow(new Object[]{
                id_roupas,
                descricao_roupas,
                preco_venda_roupas
            });
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private void remover_roupas_selecionada(int linha_selecionada) {
        try {
            if (linha_selecionada >= 0) {
                modelo_jtl_consultar_roupas_selecionado.removeRow(linha_selecionada);
                calcula_total_venda();
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private void calcula_total_venda() {
        try {
            double total = 0;
            for (int cont = 0; cont < jtl_consultar_roupas_selecionado.getRowCount(); cont++) {
                total += (Double.parseDouble(String.valueOf(
                        jtl_consultar_roupas_selecionado.getValueAt(cont, 2)))
                        * Integer.parseInt(String.valueOf(
                                jtl_consultar_roupas_selecionado.getValueAt(cont, 3))));
            }
            total_venda.setText(String.valueOf(total));
        } catch (NumberFormatException e) {
            System.out.println("Erro :" + e.getMessage());
        }
    }

    private void libera_campos(boolean a) {
        pesquisar_usuario.setEnabled(a);
        jtl_consultar_usuario.setEnabled(a);
        pesquisar_roupas.setEnabled(a);
        jtl_consultar_roupas.setEnabled(a);
        btnAdiciona.setEnabled(a);
        btnRemove.setEnabled(a);
        jtl_consultar_roupas_selecionado.setEnabled(a);
        total_venda.setText("0.00");
    }

    private void limpa_campos() {
        pesquisar_usuario.setText("");
        modelo_jtl_consultar_usuario.setNumRows(0);
        pesquisar_roupas.setText("");
        modelo_jtl_consultar_roupas.setNumRows(0);
        modelo_jtl_consultar_roupas_selecionado.setNumRows(0);
    }

    private void libera_botoes(boolean a, boolean b, boolean c) {
        btnNovo.setEnabled(a);
        btnSalvar.setEnabled(b);
        btnLimpar.setEnabled(c);
    }

    private boolean verifica_preenchimento() {
        if (jtl_consultar_usuario.getSelectedRowCount() <= 0) {
            JOptionPane.showMessageDialog(null, "Deve ser selecionado um Usuario");
            jtl_consultar_usuario.requestFocus();
            return false;
        } else {
            if (jtl_consultar_roupas_selecionado.getRowCount() <= 0) {
                JOptionPane.showMessageDialog(null, "É necessário adicionar pelo menos um roupas no pedido");
                jtl_consultar_roupas_selecionado.requestFocus();
                return false;
            } else {
                int verifica = 0;
                for (int cont = 0; cont < jtl_consultar_roupas_selecionado.getRowCount(); cont++) {
                    if (String.valueOf(jtl_consultar_roupas_selecionado.getValueAt(
                            cont, 3)).equalsIgnoreCase("null")) {
                        verifica++;
                    }
                }
                if (verifica > 0) {
                    JOptionPane.showMessageDialog(null,
                            "A quantidade de cada roupas vendido deve ser informado");
                    jtl_consultar_roupas_selecionado.requestFocus();
                    return false;
                } else {
                    return true;
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdiciona;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jtl_consultar_roupas;
    private javax.swing.JTable jtl_consultar_roupas_selecionado;
    private javax.swing.JTable jtl_consultar_usuario;
    private javax.swing.JTextField pesquisar_roupas;
    private javax.swing.JTextField pesquisar_usuario;
    private javax.swing.JLabel total_venda;
    // End of variables declaration//GEN-END:variables
}
