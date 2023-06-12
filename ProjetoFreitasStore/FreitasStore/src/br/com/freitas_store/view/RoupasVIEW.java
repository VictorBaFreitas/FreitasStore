package br.com.freitas_store.view;

import javax.swing.JOptionPane;
import br.com.freitas_store.ctr.RoupasCTR;
import br.com.freitas_store.dto.RoupasDTO;
import br.com.freitas_store.ctr.FornecedorCTR;
import br.com.freitas_store.dto.FornecedorDTO;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

public class RoupasVIEW extends javax.swing.JInternalFrame {

    FornecedorCTR fornecedorCTR = new FornecedorCTR();
    FornecedorDTO fornecedorDTO = new FornecedorDTO();
    RoupasCTR roupasCTR = new RoupasCTR();
    RoupasDTO roupasDTO = new RoupasDTO();

    int gravar_alterar;

    SimpleDateFormat data_format = new SimpleDateFormat("yyyy-MM-dd");
    ResultSet rs = null;
    DefaultTableModel modelo_jtl_consultar_roupas;
    DefaultTableModel modelo_jtl_consultar_fornecedor;

    public RoupasVIEW() {
        initComponents();
        libera_campos(false);
        libera_botoes(true, false, false, false);
        modelo_jtl_consultar_roupas = (DefaultTableModel) jtl_consultar_roupas.getModel();
        modelo_jtl_consultar_fornecedor = (DefaultTableModel) jtl_consultar_fornecedor.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        pesquisa_roupas = new javax.swing.JTextField();
        descricao_roupas = new javax.swing.JTextField();
        pesquisa_fornecedor = new javax.swing.JTextField();
        preco_custo_roupas = new javax.swing.JTextField();
        preco_venda_roupas = new javax.swing.JTextField();
        data_roupas = new javax.swing.JFormattedTextField();
        tamanho_roupas = new javax.swing.JComboBox<>();
        cor_roupas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtl_consultar_roupas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtl_consultar_fornecedor = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setTitle("Roupas");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/roupa.jpg"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNovo.setBackground(new java.awt.Color(255, 255, 204));
        btnNovo.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/add.png"))); // NOI18N
        btnNovo.setText("NOVO");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 120, 30));

        btnSalvar.setBackground(new java.awt.Color(255, 255, 204));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/salvar.png"))); // NOI18N
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 120, 30));

        btnExcluir.setBackground(new java.awt.Color(255, 255, 204));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/excluir.png"))); // NOI18N
        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, 120, 30));

        btnLimpar.setBackground(new java.awt.Color(255, 255, 204));
        btnLimpar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/limpar.png"))); // NOI18N
        btnLimpar.setText("LIMPAR");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, 120, 30));

        pesquisa_roupas.setBackground(new java.awt.Color(255, 255, 204));
        pesquisa_roupas.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        pesquisa_roupas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pesquisa_roupasKeyReleased(evt);
            }
        });
        getContentPane().add(pesquisa_roupas, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 180, 30));

        descricao_roupas.setBackground(new java.awt.Color(255, 255, 204));
        descricao_roupas.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        getContentPane().add(descricao_roupas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 280, 30));

        pesquisa_fornecedor.setBackground(new java.awt.Color(255, 255, 204));
        pesquisa_fornecedor.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        pesquisa_fornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pesquisa_fornecedorKeyReleased(evt);
            }
        });
        getContentPane().add(pesquisa_fornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 280, 30));

        preco_custo_roupas.setBackground(new java.awt.Color(255, 255, 204));
        preco_custo_roupas.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        getContentPane().add(preco_custo_roupas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 100, 30));

        preco_venda_roupas.setBackground(new java.awt.Color(255, 255, 204));
        preco_venda_roupas.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        getContentPane().add(preco_venda_roupas, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 100, 30));

        data_roupas.setBackground(new java.awt.Color(255, 255, 204));
        try {
            data_roupas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        data_roupas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(data_roupas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 100, 30));

        tamanho_roupas.setBackground(new java.awt.Color(255, 255, 204));
        tamanho_roupas.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        tamanho_roupas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "P", "M", "G", "GG", "XG" }));
        getContentPane().add(tamanho_roupas, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 100, 30));

        cor_roupas.setBackground(new java.awt.Color(255, 255, 204));
        cor_roupas.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        cor_roupas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PRETO", "BRANCO", "CINZA CLARO", "CINZA ESCURO", "MARROM", "AZUL CLARO", "AZUL ESCURO" }));
        getContentPane().add(cor_roupas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 280, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setText("DESC:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 70, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setText("DESC:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 70, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setText("TAM:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 70, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setText("COR:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 70, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel6.setText("P.CUSTO:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 70, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel7.setText("P.VENDA:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 70, 30));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel13.setText("DATA:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 70, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel8.setText("FORN:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 70, 30));

        jtl_consultar_roupas.setBackground(new java.awt.Color(255, 255, 204));
        jtl_consultar_roupas.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jtl_consultar_roupas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DESCRIÇÃO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtl_consultar_roupas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtl_consultar_roupasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtl_consultar_roupas);
        if (jtl_consultar_roupas.getColumnModel().getColumnCount() > 0) {
            jtl_consultar_roupas.getColumnModel().getColumn(0).setResizable(false);
            jtl_consultar_roupas.getColumnModel().getColumn(1).setResizable(false);
            jtl_consultar_roupas.getColumnModel().getColumn(1).setPreferredWidth(500);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 250, 270));

        jtl_consultar_fornecedor.setBackground(new java.awt.Color(255, 255, 204));
        jtl_consultar_fornecedor.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jtl_consultar_fornecedor.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jtl_consultar_fornecedor);
        if (jtl_consultar_fornecedor.getColumnModel().getColumnCount() > 0) {
            jtl_consultar_fornecedor.getColumnModel().getColumn(0).setResizable(false);
            jtl_consultar_fornecedor.getColumnModel().getColumn(1).setResizable(false);
            jtl_consultar_fornecedor.getColumnModel().getColumn(1).setPreferredWidth(500);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 350, 110));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 204));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 180, -1, 310));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/tela_roupas.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        libera_campos(true);
        libera_botoes(false, true, true, false);
        gravar_alterar = 1;
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (gravar_alterar == 1) {
            if (gravar()) {
                gravar_alterar = 0;
                limpa_campos();
                libera_botoes(true, false, false, false);
                libera_campos(false);
            }
        } else {
            if (gravar_alterar == 2) {
                if (alterar()) {
                    gravar_alterar = 0;
                    limpa_campos();
                    libera_botoes(true, false, false, false);
                    libera_campos(false);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Erro no sistema! ");
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluir();
        limpa_campos();
        libera_campos(false);
        libera_botoes(true, false, false, false);
        modelo_jtl_consultar_roupas.setNumRows(0);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpa_campos();
        libera_campos(false);
        modelo_jtl_consultar_roupas.setNumRows(0);
        libera_botoes(true, false, false, false);
        gravar_alterar = 0;
    }//GEN-LAST:event_btnLimparActionPerformed

    private void pesquisa_roupasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisa_roupasKeyReleased
        if (!pesquisa_roupas.getText().equalsIgnoreCase(""))
            preenche_tabela_roupas(pesquisa_roupas.getText());
    }//GEN-LAST:event_pesquisa_roupasKeyReleased

    private void jtl_consultar_roupasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtl_consultar_roupasMouseClicked
        preenche_campos_roupas(Integer.parseInt(String.valueOf(
                jtl_consultar_roupas.getValueAt(
                        jtl_consultar_roupas.getSelectedRow(), 0)
        )));
        libera_botoes(false, true, true, true);
    }//GEN-LAST:event_jtl_consultar_roupasMouseClicked

    private void pesquisa_fornecedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisa_fornecedorKeyReleased
        if (!pesquisa_fornecedor.getText().equalsIgnoreCase(""))
            preenche_tabela_fornecedor(pesquisa_fornecedor.getText());
    }//GEN-LAST:event_pesquisa_fornecedorKeyReleased

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    private void libera_botoes(boolean a, boolean b, boolean c, boolean d) {
        btnNovo.setEnabled(a);
        btnSalvar.setEnabled(b);
        btnLimpar.setEnabled(c);
        btnExcluir.setEnabled(d);
    }

    private void excluir() {
        if (JOptionPane.showConfirmDialog(null, "Deseja Realmente excluir o Roupas?", "Aviso",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null,
                    roupasCTR.excluir_roupas(roupasDTO));
        }
    }

    private boolean verifica_preenchimento() {
        if (descricao_roupas.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Informe uma descrição! ");
            descricao_roupas.requestFocus();
        } else if (preco_custo_roupas.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Informe um preço custo! ");
            preco_custo_roupas.requestFocus();
        } else if (preco_venda_roupas.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Informe um preço venda! ");
            preco_venda_roupas.requestFocus();
        } else if (pesquisa_fornecedor.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Informe um nome para o fornecedor! ");
            pesquisa_fornecedor.requestFocus();
        } else {
            return true;
        }
        return false;
    }

    private boolean alterar() {
        try {
            if (verifica_preenchimento()) {
                roupasDTO.setDescricao_roupas(descricao_roupas.getText());
                roupasDTO.setTamanho_roupas(tamanho_roupas.getSelectedIndex());
                roupasDTO.setCor_roupas(cor_roupas.getSelectedIndex());
                roupasDTO.setData_roupas(data_format.parse(data_roupas.getText()));
                roupasDTO.setPreco_custo_roupas(Double.parseDouble(preco_custo_roupas.getText()));
                roupasDTO.setPreco_venda_roupas(Double.parseDouble(preco_venda_roupas.getText()));
                fornecedorDTO.setId_fornecedor(Integer.parseInt(String.valueOf(
                        jtl_consultar_fornecedor.getValueAt(
                                jtl_consultar_fornecedor.getSelectedRow(), 0))));

                JOptionPane.showMessageDialog(null, roupasCTR.alterar_roupas(roupasDTO, fornecedorDTO));
                return true;
            }
            return false;
        } catch (HeadlessException | NumberFormatException | ParseException e) {
            System.out.println("Erro ao alterar! " + e.getMessage());
            return false;
        }
    }

    private void limpa_campos() {
        descricao_roupas.setText("");
        tamanho_roupas.setSelectedIndex(0);
        data_roupas.setText("");
        cor_roupas.setSelectedIndex(0);
        preco_custo_roupas.setText("");
        preco_venda_roupas.setText("");
        pesquisa_fornecedor.setText("");
        modelo_jtl_consultar_fornecedor.setRowCount(0);
    }

    private void libera_campos(boolean a) {
        descricao_roupas.setEnabled(a);
        cor_roupas.setEnabled(a);
        tamanho_roupas.setEnabled(a);
        data_roupas.setEnabled(a);
        preco_venda_roupas.setEnabled(a);
        preco_custo_roupas.setEnabled(a);
        pesquisa_fornecedor.setEnabled(a);
    }

    private boolean gravar() {
        try {
            if (verifica_preenchimento()) {
                roupasDTO.setDescricao_roupas(descricao_roupas.getText());
                roupasDTO.setTamanho_roupas(tamanho_roupas.getSelectedIndex());
                roupasDTO.setCor_roupas(cor_roupas.getSelectedIndex());
                roupasDTO.setData_roupas(data_format.parse(data_roupas.getText()));
                roupasDTO.setPreco_custo_roupas(Double.parseDouble(preco_custo_roupas.getText()));
                roupasDTO.setPreco_venda_roupas(Double.parseDouble(preco_venda_roupas.getText()));
                fornecedorDTO.setId_fornecedor(Integer.parseInt(String.valueOf(
                        jtl_consultar_fornecedor.getValueAt(
                                jtl_consultar_fornecedor.getSelectedRow(), 0))));

                JOptionPane.showMessageDialog(null, roupasCTR.inserir_roupas(roupasDTO, fornecedorDTO));
                return true;
            }
            return false;
        } catch (HeadlessException | NumberFormatException | ParseException e) {
            System.out.println("Erro ao gravar! " + e.getMessage());
            return false;
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
                    rs.getString("descricao_roupas"),});
            }
        } catch (SQLException e) {
            System.out.println("Erro SQL: " + e.getMessage());
        } finally {
            roupasCTR.CloseDB();
        }
    }

    private void preenche_campos_roupas(int id_roupas) {
        try {
            roupasDTO.setId_roupas(id_roupas);
            rs = roupasCTR.consultar_roupas(roupasDTO, 2);
            if (rs.next()) {
                limpa_campos();

                descricao_roupas.setText(rs.getString("descricao_roupas"));
                tamanho_roupas.setSelectedIndex(rs.getInt("tamanho_roupas"));
                cor_roupas.setSelectedIndex(rs.getInt("cor_roupas"));
                data_roupas.setText(rs.getString("data_roupas"));
                preco_custo_roupas.setText(rs.getString("preco_custo_roupas"));
                preco_venda_roupas.setText(rs.getString("preco_venda_roupas"));
                pesquisa_fornecedor.setText(rs.getString("nome_fornecedor"));

                modelo_jtl_consultar_fornecedor.setNumRows(0);
                modelo_jtl_consultar_fornecedor.addRow(new Object[]{rs.getInt("id_fornecedor"), rs.getString("nome_fornecedor")});
                jtl_consultar_fornecedor.setRowSelectionInterval(0, 0);

                gravar_alterar = 2;
                libera_campos(true);
            }
        } catch (SQLException e) {
            System.out.println("Erro SQL: " + e.getMessage());
        } finally {
            roupasCTR.CloseDB();
        }
    }

    private void preenche_tabela_fornecedor(String nome_fornecedor) {
        try {
            modelo_jtl_consultar_fornecedor.setNumRows(0);
            fornecedorDTO.setNome_fornecedor(nome_fornecedor);

            rs = fornecedorCTR.consultar_fornecedor(fornecedorDTO, 1);

            while (rs.next()) {
                modelo_jtl_consultar_fornecedor.addRow(new Object[]{
                    rs.getString("id_fornecedor"),
                    rs.getString("nome_fornecedor"),});
            }
        } catch (SQLException e) {
            System.out.println("Erro SQL: " + e.getMessage());
        } finally {
            roupasCTR.CloseDB();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cor_roupas;
    private javax.swing.JFormattedTextField data_roupas;
    private javax.swing.JTextField descricao_roupas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jtl_consultar_fornecedor;
    private javax.swing.JTable jtl_consultar_roupas;
    private javax.swing.JTextField pesquisa_fornecedor;
    private javax.swing.JTextField pesquisa_roupas;
    private javax.swing.JTextField preco_custo_roupas;
    private javax.swing.JTextField preco_venda_roupas;
    private javax.swing.JComboBox<String> tamanho_roupas;
    // End of variables declaration//GEN-END:variables
}
