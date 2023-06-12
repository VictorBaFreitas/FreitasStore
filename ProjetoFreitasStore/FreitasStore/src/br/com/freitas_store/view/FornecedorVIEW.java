package br.com.freitas_store.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JOptionPane;
import br.com.freitas_store.ctr.FornecedorCTR;
import br.com.freitas_store.dto.FornecedorDTO;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

public class FornecedorVIEW extends javax.swing.JInternalFrame {

    SimpleDateFormat data_format = new SimpleDateFormat("yyyy-MM-dd");
    FornecedorCTR fornecedorCTR = new FornecedorCTR();
    FornecedorDTO fornecedorDTO = new FornecedorDTO();

    int gravar_alterar;

    ResultSet rs = null;
    DefaultTableModel modelo_jtl_consultar_fornecedor;

    public FornecedorVIEW() {
        initComponents();
        libera_campos(false);
        libera_botoes(true, false, false, false);
        modelo_jtl_consultar_fornecedor = (DefaultTableModel) jtl_consultar_fornecedor.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cep_fornecedor = new javax.swing.JTextField();
        numero_fornecedor = new javax.swing.JTextField();
        cidade_fornecedor = new javax.swing.JTextField();
        rua_fornecedor = new javax.swing.JTextField();
        bairro_fornecedor = new javax.swing.JTextField();
        pesquisa_fornecedor = new javax.swing.JTextField();
        telefone_fornecedor = new javax.swing.JTextField();
        nome_fornecedor = new javax.swing.JTextField();
        descricao_fornecedor = new javax.swing.JTextField();
        cnpj_fornecedor = new javax.swing.JTextField();
        estado_fornecedor = new javax.swing.JComboBox<>();
        data_fornecedor = new javax.swing.JFormattedTextField();
        btnBuscarCep = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtl_consultar_fornecedor = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setTitle("Fornecedor");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/fornecedor.png"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setText("NOME:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 70, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setText("DESC:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 70, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setText("CEP:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 70, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setText("ESTADO:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 70, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel6.setText("CIDADE:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 70, 30));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel7.setText("RUA:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 70, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel8.setText("BAIRRO:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 70, 30));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel9.setText("NUMERO:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 70, 30));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel10.setText("NOME:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 70, 30));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel11.setText("TELEFONE:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 70, 30));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel12.setText("DATA:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 70, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel13.setText("CNPJ:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 70, 30));

        cep_fornecedor.setBackground(new java.awt.Color(255, 255, 204));
        cep_fornecedor.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        getContentPane().add(cep_fornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 100, 30));

        numero_fornecedor.setBackground(new java.awt.Color(255, 255, 204));
        numero_fornecedor.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        getContentPane().add(numero_fornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 100, 30));

        cidade_fornecedor.setBackground(new java.awt.Color(255, 255, 204));
        cidade_fornecedor.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        getContentPane().add(cidade_fornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 280, 30));

        rua_fornecedor.setBackground(new java.awt.Color(255, 255, 204));
        rua_fornecedor.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        getContentPane().add(rua_fornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 280, 30));

        bairro_fornecedor.setBackground(new java.awt.Color(255, 255, 204));
        bairro_fornecedor.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        getContentPane().add(bairro_fornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 280, 30));

        pesquisa_fornecedor.setBackground(new java.awt.Color(255, 255, 204));
        pesquisa_fornecedor.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        pesquisa_fornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pesquisa_fornecedorKeyReleased(evt);
            }
        });
        getContentPane().add(pesquisa_fornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 180, 30));

        telefone_fornecedor.setBackground(new java.awt.Color(255, 255, 204));
        telefone_fornecedor.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        getContentPane().add(telefone_fornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 100, 30));

        nome_fornecedor.setBackground(new java.awt.Color(255, 255, 204));
        nome_fornecedor.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        getContentPane().add(nome_fornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 100, 30));

        descricao_fornecedor.setBackground(new java.awt.Color(255, 255, 204));
        descricao_fornecedor.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        getContentPane().add(descricao_fornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 280, 30));

        cnpj_fornecedor.setBackground(new java.awt.Color(255, 255, 204));
        cnpj_fornecedor.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        getContentPane().add(cnpj_fornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 100, 30));

        estado_fornecedor.setBackground(new java.awt.Color(255, 255, 204));
        estado_fornecedor.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        estado_fornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " AC", " AL", " AP", " AM", " BA", " CE", " DF", " ES", " GO", " MA", " MT", " MS", " MG", " PA", " PB", " PR", " PE", " PI", " RR", " RO", " RJ", " RN", " RS", " SC", " SP", " SE", " TO" }));
        estado_fornecedor.setBorder(null);
        getContentPane().add(estado_fornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 100, 30));

        data_fornecedor.setBackground(new java.awt.Color(255, 255, 204));
        try {
            data_fornecedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        data_fornecedor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(data_fornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 100, 30));

        btnBuscarCep.setBackground(new java.awt.Color(255, 255, 204));
        btnBuscarCep.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnBuscarCep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/pesquisar.jpg"))); // NOI18N
        btnBuscarCep.setText("BUSCAR CEP");
        btnBuscarCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCepActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 170, 30));

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
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, 120, 30));

        btnLimpar.setBackground(new java.awt.Color(255, 255, 204));
        btnLimpar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/limpar.png"))); // NOI18N
        btnLimpar.setText("LIMPAR");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 500, 120, 30));

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
        jtl_consultar_fornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtl_consultar_fornecedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtl_consultar_fornecedor);
        if (jtl_consultar_fornecedor.getColumnModel().getColumnCount() > 0) {
            jtl_consultar_fornecedor.getColumnModel().getColumn(0).setResizable(false);
            jtl_consultar_fornecedor.getColumnModel().getColumn(1).setResizable(false);
            jtl_consultar_fornecedor.getColumnModel().getColumn(1).setPreferredWidth(500);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 250, 270));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 204));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, -1, 310));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/tela_fornecedor.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCepActionPerformed
        if (cep_fornecedor.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(null, "Insira um CEP! ");
        else
            consultar_cep();
    }//GEN-LAST:event_btnBuscarCepActionPerformed

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
        modelo_jtl_consultar_fornecedor.setNumRows(0);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpa_campos();
        libera_campos(false);
        modelo_jtl_consultar_fornecedor.setNumRows(0);
        libera_botoes(true, false, false, false);
        gravar_alterar = 0;
    }//GEN-LAST:event_btnLimparActionPerformed

    private void jtl_consultar_fornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtl_consultar_fornecedorMouseClicked
        preenche_campos(Integer.parseInt(String.valueOf(
                jtl_consultar_fornecedor.getValueAt(
                        jtl_consultar_fornecedor.getSelectedRow(), 0)
        )));
        libera_botoes(false, true, true, true);
    }//GEN-LAST:event_jtl_consultar_fornecedorMouseClicked

    private void pesquisa_fornecedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisa_fornecedorKeyReleased
        if (!pesquisa_fornecedor.getText().equalsIgnoreCase(""))
            preenche_tabela(pesquisa_fornecedor.getText());
    }//GEN-LAST:event_pesquisa_fornecedorKeyReleased

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    public void consultar_cep() {
        String retorno = "";
        String aux = "";
        String logradouro = "";
        String bairro = "";
        String cidade = "";
        String estado = "";
        String vetor[] = new String[6];
        String campo[] = new String[2];

        try {
            URL url = new URL("https://viacep.com.br/ws/" + cep_fornecedor.getText() + "/json/");
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

            if (conexao.getResponseCode() != 200) {
                throw new RuntimeException("HTTP error code: " + conexao.getResponseCode());
            }

            BufferedReader resposta = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
            while ((aux = resposta.readLine()) != null) {
                retorno += aux;
            }

            retorno = retorno.replaceAll("\"", "");
            retorno = retorno.replaceAll("\\{", "");
            retorno = retorno.replaceAll("\\}", "");

            vetor = retorno.split(",");

            for (int i = 0; i < vetor.length; i++) {
                campo = vetor[i].split(":");
                if (campo[0].equals("  logradouro")) {
                    logradouro = campo[1];
                } else {
                    if (campo[0].equals("  bairro")) {
                        bairro = campo[1];
                    } else {
                        if (campo[0].equals("  localidade")) {
                            cidade = campo[1];
                        } else {
                            if (campo[0].equals("  uf")) {
                                estado = campo[1];
                            }
                        }
                    }
                }
            }

            estado_fornecedor.setSelectedItem(estado);
            cidade_fornecedor.setText(cidade);
            rua_fornecedor.setText(logradouro);
            bairro_fornecedor.setText(bairro);

        } catch (IOException | RuntimeException e) {
            System.out.println("Erro ao consultar CEP " + e.getMessage());
        }
    }

    private void libera_botoes(boolean a, boolean b, boolean c, boolean d) {
        btnNovo.setEnabled(a);
        btnSalvar.setEnabled(b);
        btnLimpar.setEnabled(c);
        btnExcluir.setEnabled(d);
    }

    private void excluir() {
        if (JOptionPane.showConfirmDialog(null, "Deseja Realmente excluir o Fornecedor?", "Aviso",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null,
                    fornecedorCTR.excluir_fornecedor(fornecedorDTO));
        }
    }

    private boolean verifica_preenchimento() {
        if (nome_fornecedor.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Informe um nome! ");
            nome_fornecedor.requestFocus();
        } else if (descricao_fornecedor.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Informe uma descrição! ");
            descricao_fornecedor.requestFocus();
        } else if (cnpj_fornecedor.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Informe um cnpj! ");
            cnpj_fornecedor.requestFocus();
        } else if (telefone_fornecedor.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Informe um telefone! ");
            telefone_fornecedor.requestFocus();
        } else if (cep_fornecedor.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Informe um cep! ");
            cep_fornecedor.requestFocus();
        } else if (numero_fornecedor.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Informe um numero! ");
            numero_fornecedor.requestFocus();
        } else if (cidade_fornecedor.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Informe uma cidade! ");
            cidade_fornecedor.requestFocus();
        } else if (rua_fornecedor.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Informe uma rua! ");
            rua_fornecedor.requestFocus();
        } else if (bairro_fornecedor.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Informe um bairro! ");
            bairro_fornecedor.requestFocus();
        } else {
            return true;
        }
        return false;
    }

    private boolean alterar() {
        try {
            if (verifica_preenchimento()) {
                fornecedorDTO.setNome_fornecedor(nome_fornecedor.getText());
                fornecedorDTO.setDescricao_fornecedor(descricao_fornecedor.getText());
                fornecedorDTO.setCnpj_fornecedor(cnpj_fornecedor.getText());
                fornecedorDTO.setTelefone_fornecedor(telefone_fornecedor.getText());
                fornecedorDTO.setData_fornecedor(data_format.parse(data_fornecedor.getText()));
                fornecedorDTO.setCep_fornecedor(cep_fornecedor.getText());
                fornecedorDTO.setEstado_fornecedor(estado_fornecedor.getSelectedIndex());
                fornecedorDTO.setCidade_fornecedor(cidade_fornecedor.getText());
                fornecedorDTO.setRua_fornecedor(rua_fornecedor.getText());
                fornecedorDTO.setBairro_fornecedor(bairro_fornecedor.getText());
                fornecedorDTO.setNumero_fornecedor(Integer.parseInt(numero_fornecedor.getText()));

                JOptionPane.showMessageDialog(null, fornecedorCTR.alterar_fornecedor(fornecedorDTO));
                return true;
            }
            return false;
        } catch (HeadlessException | NumberFormatException | ParseException e) {
            System.out.println("Erro ao alterar! " + e.getMessage());
            return false;
        }
    }

    private void limpa_campos() {
        nome_fornecedor.setText("");
        descricao_fornecedor.setText("");
        cnpj_fornecedor.setText("");
        telefone_fornecedor.setText("");
        data_fornecedor.setText("");
        cep_fornecedor.setText("");
        estado_fornecedor.setSelectedIndex(0);
        cidade_fornecedor.setText("");
        rua_fornecedor.setText("");
        bairro_fornecedor.setText("");
        numero_fornecedor.setText("");
    }

    private void libera_campos(boolean a) {
        nome_fornecedor.setEnabled(a);
        descricao_fornecedor.setEnabled(a);
        cnpj_fornecedor.setEnabled(a);
        telefone_fornecedor.setEnabled(a);
        data_fornecedor.setEnabled(a);
        cep_fornecedor.setEnabled(a);
        btnBuscarCep.setEnabled(a);
        estado_fornecedor.setEnabled(a);
        cidade_fornecedor.setEnabled(a);
        rua_fornecedor.setEnabled(a);
        bairro_fornecedor.setEnabled(a);
        numero_fornecedor.setEnabled(a);
    }

    private boolean gravar() {
        try {
            if (verifica_preenchimento()) {
                fornecedorDTO.setNome_fornecedor(nome_fornecedor.getText());
                fornecedorDTO.setDescricao_fornecedor(descricao_fornecedor.getText());
                fornecedorDTO.setCnpj_fornecedor(cnpj_fornecedor.getText());
                fornecedorDTO.setTelefone_fornecedor(telefone_fornecedor.getText());
                fornecedorDTO.setData_fornecedor(data_format.parse(data_fornecedor.getText()));
                fornecedorDTO.setCep_fornecedor(cep_fornecedor.getText());
                fornecedorDTO.setEstado_fornecedor(estado_fornecedor.getSelectedIndex());
                fornecedorDTO.setCidade_fornecedor(cidade_fornecedor.getText());
                fornecedorDTO.setRua_fornecedor(rua_fornecedor.getText());
                fornecedorDTO.setBairro_fornecedor(bairro_fornecedor.getText());
                fornecedorDTO.setNumero_fornecedor(Integer.parseInt(numero_fornecedor.getText()));

                JOptionPane.showMessageDialog(null, fornecedorCTR.inserir_fornecedor(fornecedorDTO));
                return true;
            }
            return false;
        } catch (HeadlessException | NumberFormatException | ParseException e) {
            System.out.println("Erro ao gravar! " + e.getMessage());
            return false;
        }
    }

    private void preenche_tabela(String nome_fornecedor) {
        try {
            modelo_jtl_consultar_fornecedor.setNumRows(0);
            fornecedorDTO.setNome_fornecedor(nome_fornecedor);
            rs = fornecedorCTR.consultar_fornecedor(fornecedorDTO, 1);
            while (rs.next()) {
                modelo_jtl_consultar_fornecedor.addRow(new Object[]{
                    rs.getString("id_fornecedor"),
                    rs.getString("nome_fornecedor")
                });
            }
        } catch (SQLException e) {
            System.out.println("Erro SQL: " + e.getMessage());
        } finally {
            fornecedorCTR.CloseDB();
        }
    }

    private void preenche_campos(int id_fornecedor) {
        try {
            fornecedorDTO.setId_fornecedor(id_fornecedor);
            rs = fornecedorCTR.consultar_fornecedor(fornecedorDTO, 2);
            if (rs.next()) {
                limpa_campos();

                nome_fornecedor.setText(rs.getString("nome_fornecedor"));
                descricao_fornecedor.setText(rs.getString("descricao_fornecedor"));
                data_fornecedor.setText(rs.getString("data_fornecedor"));
                cnpj_fornecedor.setText(rs.getString("cnpj_fornecedor"));
                telefone_fornecedor.setText(rs.getString("telefone_fornecedor"));
                cep_fornecedor.setText(rs.getString("cep_fornecedor"));
                numero_fornecedor.setText(rs.getString("numero_fornecedor"));
                cidade_fornecedor.setText(rs.getString("cidade_fornecedor"));
                rua_fornecedor.setText(rs.getString("rua_fornecedor"));
                bairro_fornecedor.setText(rs.getString("bairro_fornecedor"));
                estado_fornecedor.setSelectedIndex(rs.getInt("estado_fornecedor"));

                gravar_alterar = 2;
                libera_campos(true);
            }
        } catch (SQLException e) {
            System.out.println("Erro SQL: " + e.getMessage());
        } finally {
            fornecedorCTR.CloseDB();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairro_fornecedor;
    private javax.swing.JButton btnBuscarCep;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField cep_fornecedor;
    private javax.swing.JTextField cidade_fornecedor;
    private javax.swing.JTextField cnpj_fornecedor;
    private javax.swing.JFormattedTextField data_fornecedor;
    private javax.swing.JTextField descricao_fornecedor;
    private javax.swing.JComboBox<String> estado_fornecedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jtl_consultar_fornecedor;
    private javax.swing.JTextField nome_fornecedor;
    private javax.swing.JTextField numero_fornecedor;
    private javax.swing.JTextField pesquisa_fornecedor;
    private javax.swing.JTextField rua_fornecedor;
    private javax.swing.JTextField telefone_fornecedor;
    // End of variables declaration//GEN-END:variables
}
