package br.com.freitas_store.view;

import br.com.freitas_store.dto.UsuarioDTO;
import br.com.freitas_store.ctr.UsuarioCTR;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UsuarioVIEW extends javax.swing.JInternalFrame {

    SimpleDateFormat data_format = new SimpleDateFormat("yyyy-MM-dd");
    UsuarioCTR usuarioCTR = new UsuarioCTR();
    UsuarioDTO usuarioDTO = new UsuarioDTO();

    int gravar_alterar;

    ResultSet rs = null;
    DefaultTableModel modelo_jtl_consultar_usuario;

    public UsuarioVIEW() {
        initComponents();
        libera_campos(false);
        libera_botoes(true, false, false, false);
        modelo_jtl_consultar_usuario = (DefaultTableModel) jtl_consultar_usuario.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nome_usuario = new javax.swing.JTextField();
        login_usuario = new javax.swing.JTextField();
        cpf_usuario = new javax.swing.JTextField();
        telefone_usuario = new javax.swing.JTextField();
        cep_usuario = new javax.swing.JTextField();
        numero_usuario = new javax.swing.JTextField();
        cidade_usuario = new javax.swing.JTextField();
        rua_usuario = new javax.swing.JTextField();
        pesquisa_usuario = new javax.swing.JTextField();
        bairro_usuario = new javax.swing.JTextField();
        data_usuario = new javax.swing.JFormattedTextField();
        senha_usuario = new javax.swing.JPasswordField();
        servico_usuario = new javax.swing.JComboBox<>();
        estado_usuario = new javax.swing.JComboBox<>();
        alterar_senha = new javax.swing.JCheckBox();
        btnBuscarCep = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
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
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtl_consultar_usuario = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setTitle("Usuário");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/user.png"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nome_usuario.setBackground(new java.awt.Color(255, 255, 204));
        nome_usuario.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        getContentPane().add(nome_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 280, 30));

        login_usuario.setBackground(new java.awt.Color(255, 255, 204));
        login_usuario.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        getContentPane().add(login_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 100, 30));

        cpf_usuario.setBackground(new java.awt.Color(255, 255, 204));
        cpf_usuario.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        getContentPane().add(cpf_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 100, 30));

        telefone_usuario.setBackground(new java.awt.Color(255, 255, 204));
        telefone_usuario.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        getContentPane().add(telefone_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 100, 30));

        cep_usuario.setBackground(new java.awt.Color(255, 255, 204));
        cep_usuario.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        getContentPane().add(cep_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 100, 30));

        numero_usuario.setBackground(new java.awt.Color(255, 255, 204));
        numero_usuario.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        getContentPane().add(numero_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 100, 30));

        cidade_usuario.setBackground(new java.awt.Color(255, 255, 204));
        cidade_usuario.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        getContentPane().add(cidade_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 280, 30));

        rua_usuario.setBackground(new java.awt.Color(255, 255, 204));
        rua_usuario.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        getContentPane().add(rua_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 280, 30));

        pesquisa_usuario.setBackground(new java.awt.Color(255, 255, 204));
        pesquisa_usuario.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        pesquisa_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pesquisa_usuarioKeyReleased(evt);
            }
        });
        getContentPane().add(pesquisa_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 180, 30));

        bairro_usuario.setBackground(new java.awt.Color(255, 255, 204));
        bairro_usuario.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        getContentPane().add(bairro_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 280, 30));

        data_usuario.setBackground(new java.awt.Color(255, 255, 204));
        try {
            data_usuario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        data_usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(data_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 100, 30));

        senha_usuario.setBackground(new java.awt.Color(255, 255, 204));
        senha_usuario.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        getContentPane().add(senha_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 100, 30));

        servico_usuario.setBackground(new java.awt.Color(255, 255, 204));
        servico_usuario.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        servico_usuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADM", "COMUM", "CLIENTE" }));
        servico_usuario.setBorder(null);
        servico_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(servico_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 100, 30));

        estado_usuario.setBackground(new java.awt.Color(255, 255, 204));
        estado_usuario.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        estado_usuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " AC", " AL", " AP", " AM", " BA", " CE", " DF", " ES", " GO", " MA", " MT", " MS", " MG", " PA", " PB", " PR", " PE", " PI", " RR", " RO", " RJ", " RN", " RS", " SC", " SP", " SE", " TO" }));
        estado_usuario.setBorder(null);
        getContentPane().add(estado_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 100, 30));

        alterar_senha.setBackground(new java.awt.Color(255, 255, 204));
        alterar_senha.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        alterar_senha.setText("ALTERAR SENHA");
        alterar_senha.setBorder(null);
        alterar_senha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alterar_senha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alterar_senhaMouseClicked(evt);
            }
        });
        getContentPane().add(alterar_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 280, 30));

        btnBuscarCep.setBackground(new java.awt.Color(255, 255, 204));
        btnBuscarCep.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnBuscarCep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/pesquisar.jpg"))); // NOI18N
        btnBuscarCep.setText("BUSCAR CEP");
        btnBuscarCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCepActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 170, 30));

        btnNovo.setBackground(new java.awt.Color(255, 255, 204));
        btnNovo.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/add.png"))); // NOI18N
        btnNovo.setText("NOVO");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 120, 30));

        btnLimpar.setBackground(new java.awt.Color(255, 255, 204));
        btnLimpar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/limpar.png"))); // NOI18N
        btnLimpar.setText("LIMPAR");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 540, 120, 30));

        btnSalvar.setBackground(new java.awt.Color(255, 255, 204));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/salvar.png"))); // NOI18N
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 540, 120, 30));

        btnExcluir.setBackground(new java.awt.Color(255, 255, 204));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/excluir.png"))); // NOI18N
        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 540, 120, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setText("LOGIN:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 70, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setText("SENHA:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 70, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setText("SERVIÇO:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 70, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setText("CPF:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 70, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel6.setText("CEP:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 70, 30));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel7.setText("ESTADO:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 70, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel8.setText("CIDADE:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 70, 30));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel9.setText("RUA:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 70, 30));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel10.setText("BAIRRO:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 70, 30));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel11.setText("TELEFONE:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 70, 30));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel12.setText("NOME:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 70, 30));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel13.setText("DATA:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 70, 30));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel14.setText("NUMERO:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 70, 30));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel15.setText("NOME:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 70, 30));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 204));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, -1, 390));

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
        jtl_consultar_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtl_consultar_usuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtl_consultar_usuario);
        if (jtl_consultar_usuario.getColumnModel().getColumnCount() > 0) {
            jtl_consultar_usuario.getColumnModel().getColumn(0).setResizable(false);
            jtl_consultar_usuario.getColumnModel().getColumn(1).setResizable(false);
            jtl_consultar_usuario.getColumnModel().getColumn(1).setPreferredWidth(500);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 250, 350));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/tela_usuario.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        libera_campos(true);
        alterar_senha.setEnabled(false);
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

    private void btnBuscarCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCepActionPerformed
        if (cep_usuario.getText().equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(null, "Insira um CEP! ");
        else
            consultar_cep();
    }//GEN-LAST:event_btnBuscarCepActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluir();
        limpa_campos();
        libera_campos(false);
        libera_botoes(true, false, false, false);
        modelo_jtl_consultar_usuario.setNumRows(0);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpa_campos();
        libera_campos(false);
        modelo_jtl_consultar_usuario.setNumRows(0);
        libera_botoes(true, false, false, false);
        gravar_alterar = 0;
    }//GEN-LAST:event_btnLimparActionPerformed

    private void alterar_senhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alterar_senhaMouseClicked
        if (alterar_senha.isSelected()) {
            senha_usuario.setEnabled(true);
        } else {
            senha_usuario.setEnabled(false);
            senha_usuario.setText(null);
        }
    }//GEN-LAST:event_alterar_senhaMouseClicked

    private void pesquisa_usuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesquisa_usuarioKeyReleased
        if (!pesquisa_usuario.getText().equalsIgnoreCase(""))
            preenche_tabela(pesquisa_usuario.getText());
    }//GEN-LAST:event_pesquisa_usuarioKeyReleased

    private void jtl_consultar_usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtl_consultar_usuarioMouseClicked
        preenche_campos(Integer.parseInt(String.valueOf(
                jtl_consultar_usuario.getValueAt(
                        jtl_consultar_usuario.getSelectedRow(), 0)
        )));
        libera_botoes(false, true, true, true);
    }//GEN-LAST:event_jtl_consultar_usuarioMouseClicked

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
            URL url = new URL("https://viacep.com.br/ws/" + cep_usuario.getText() + "/json/");
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

            estado_usuario.setSelectedItem(estado);
            cidade_usuario.setText(cidade);
            rua_usuario.setText(logradouro);
            bairro_usuario.setText(bairro);

        } catch (IOException | RuntimeException e) {
            System.out.println("Erro ao consultar CEP " + e.getMessage());
        }
    }

    private boolean gravar() {
        try {
            if (verifica_preenchimento()) {
                usuarioDTO.setNome_usuario(nome_usuario.getText());
                usuarioDTO.setLogin_usuario(login_usuario.getText());
                usuarioDTO.setSenha_usuario(String.valueOf(senha_usuario.getPassword()));
                usuarioDTO.setServico_usuario(servico_usuario.getSelectedIndex());
                usuarioDTO.setCpf_usuario(cpf_usuario.getText());
                usuarioDTO.setTelefone_usuario(telefone_usuario.getText());
                usuarioDTO.setData_usuario(data_format.parse(data_usuario.getText()));
                usuarioDTO.setCep_usuario(cep_usuario.getText());
                usuarioDTO.setEstado_usuario(estado_usuario.getSelectedIndex());
                usuarioDTO.setCidade_usuario(cidade_usuario.getText());
                usuarioDTO.setRua_usuario(rua_usuario.getText());
                usuarioDTO.setBairro_usuario(bairro_usuario.getText());
                usuarioDTO.setNumero_usuario(Integer.parseInt(numero_usuario.getText()));

                JOptionPane.showMessageDialog(null, usuarioCTR.inserir_usuario(usuarioDTO));
                return true;
            }
            return false;
        } catch (HeadlessException | NumberFormatException | ParseException e) {
            System.out.println("Erro ao gravar! " + e.getMessage());
            return false;
        }
    }

    private boolean verifica_preenchimento() {
        if (nome_usuario.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Informe um nome! ");
            nome_usuario.requestFocus();
        } else if (login_usuario.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Informe um login! ");
            login_usuario.requestFocus();
        } else if (senha_usuario.getPassword().length == 0) {
            JOptionPane.showMessageDialog(null, "Informe uma senha! ");
            senha_usuario.requestFocus();
        } else if (cpf_usuario.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Informe um cpf! ");
            cpf_usuario.requestFocus();
        } else if (telefone_usuario.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Informe um telefone! ");
            telefone_usuario.requestFocus();
        } else if (cep_usuario.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Informe um cep! ");
            cep_usuario.requestFocus();
        } else if (numero_usuario.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Informe um numero! ");
            numero_usuario.requestFocus();
        } else if (cidade_usuario.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Informe uma cidade! ");
            cidade_usuario.requestFocus();
        } else if (rua_usuario.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Informe uma rua! ");
            rua_usuario.requestFocus();
        } else if (bairro_usuario.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Informe um bairro! ");
            bairro_usuario.requestFocus();
        } else {
            return true;
        }
        return false;
    }

    private boolean verifica_preenchimento_alternativo() {
        if (nome_usuario.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Informe um nome! ");
            nome_usuario.requestFocus();
        } else if (login_usuario.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Informe um login! ");
            login_usuario.requestFocus();
        } else if (cpf_usuario.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Informe um cpf! ");
            cpf_usuario.requestFocus();
        } else if (telefone_usuario.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Informe um telefone! ");
            telefone_usuario.requestFocus();
        } else if (cep_usuario.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Informe um cep! ");
            cep_usuario.requestFocus();
        } else if (numero_usuario.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Informe um numero! ");
            numero_usuario.requestFocus();
        } else if (cidade_usuario.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Informe uma cidade! ");
            cidade_usuario.requestFocus();
        } else if (rua_usuario.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Informe uma rua! ");
            rua_usuario.requestFocus();
        } else if (bairro_usuario.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Informe um bairro! ");
            bairro_usuario.requestFocus();
        } else {
            return true;
        }
        return false;
    }

    private void libera_campos(boolean a) {
        nome_usuario.setEnabled(a);
        login_usuario.setEnabled(a);
        senha_usuario.setEnabled(a);
        servico_usuario.setEnabled(a);
        cpf_usuario.setEnabled(a);
        telefone_usuario.setEnabled(a);
        data_usuario.setEnabled(a);
        cep_usuario.setEnabled(a);
        btnBuscarCep.setEnabled(a);
        estado_usuario.setEnabled(a);
        cidade_usuario.setEnabled(a);
        rua_usuario.setEnabled(a);
        bairro_usuario.setEnabled(a);
        numero_usuario.setEnabled(a);
        alterar_senha.setEnabled(a);
    }

    private void libera_botoes(boolean a, boolean b, boolean c, boolean d) {
        btnNovo.setEnabled(a);
        btnSalvar.setEnabled(b);
        btnLimpar.setEnabled(c);
        btnExcluir.setEnabled(d);
    }

    private void limpa_campos() {
        nome_usuario.setText("");
        login_usuario.setText("");
        senha_usuario.setText("");
        alterar_senha.setSelected(false);
        servico_usuario.setSelectedIndex(0);
        cpf_usuario.setText("");
        telefone_usuario.setText("");
        data_usuario.setText("");
        cep_usuario.setText("");
        estado_usuario.setSelectedIndex(0);
        cidade_usuario.setText("");
        rua_usuario.setText("");
        bairro_usuario.setText("");
        numero_usuario.setText("");
    }

    private boolean alterar() {
        try {
            if (verifica_preenchimento_alternativo()) {
                usuarioDTO.setNome_usuario(nome_usuario.getText());
                usuarioDTO.setLogin_usuario(login_usuario.getText());
                usuarioDTO.setServico_usuario(servico_usuario.getSelectedIndex());
                usuarioDTO.setCpf_usuario(cpf_usuario.getText());
                usuarioDTO.setTelefone_usuario(telefone_usuario.getText());
                usuarioDTO.setData_usuario(data_format.parse(data_usuario.getText()));
                usuarioDTO.setCep_usuario(cep_usuario.getText());
                usuarioDTO.setEstado_usuario(estado_usuario.getSelectedIndex());
                usuarioDTO.setCidade_usuario(cidade_usuario.getText());
                usuarioDTO.setRua_usuario(rua_usuario.getText());
                usuarioDTO.setBairro_usuario(bairro_usuario.getText());
                usuarioDTO.setNumero_usuario(Integer.parseInt(numero_usuario.getText()));

                if ((alterar_senha.isSelected()) && (senha_usuario.getPassword().length != 0)) {
                    usuarioDTO.setSenha_usuario(String.valueOf(senha_usuario.getPassword()));
                } else {
                    usuarioDTO.setSenha_usuario(null);
                }

                JOptionPane.showMessageDialog(null, usuarioCTR.alterar_usuario(usuarioDTO));
                return true;
            }
            return false;
        } catch (HeadlessException | NumberFormatException | ParseException e) {
            System.out.println("Erro ao gravar! " + e.getMessage());
            return false;
        }
    }

    private void excluir() {
        if (JOptionPane.showConfirmDialog(null, "Deseja Realmente excluir o Usuário?", "Aviso",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null,
                    usuarioCTR.excluir_usuario(usuarioDTO));
        }
    }

    private void preenche_tabela(String nome_usuario) {
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
        } finally {
            usuarioCTR.CloseDB();
        }
    }

    private void preenche_campos(int id_usuario) {
        try {
            usuarioDTO.setId_usuario(id_usuario);
            rs = usuarioCTR.consultar_usuario(usuarioDTO, 2);
            if (rs.next()) {
                limpa_campos();

                nome_usuario.setText(rs.getString("nome_usuario"));
                login_usuario.setText(rs.getString("login_usuario"));
                servico_usuario.setSelectedIndex(rs.getInt("tipo_usuario"));
                data_usuario.setText(rs.getString("data_usuario"));
                cpf_usuario.setText(rs.getString("cpf_usuario"));
                telefone_usuario.setText(rs.getString("telefone_usuario"));
                cep_usuario.setText(rs.getString("cep_usuario"));
                numero_usuario.setText(rs.getString("numero_usuario"));
                cidade_usuario.setText(rs.getString("cidade_usuario"));
                rua_usuario.setText(rs.getString("rua_usuario"));
                bairro_usuario.setText(rs.getString("bairro_usuario"));
                estado_usuario.setSelectedIndex(rs.getInt("estado_usuario"));

                gravar_alterar = 2;
                libera_campos(true);
                senha_usuario.setEnabled(false);
                alterar_senha.setSelected(false);
            }
        } catch (SQLException e) {
            System.out.println("Erro SQL: " + e.getMessage());
        } finally {
            usuarioCTR.CloseDB();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox alterar_senha;
    private javax.swing.JTextField bairro_usuario;
    private javax.swing.JButton btnBuscarCep;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField cep_usuario;
    private javax.swing.JTextField cidade_usuario;
    private javax.swing.JTextField cpf_usuario;
    private javax.swing.JFormattedTextField data_usuario;
    private javax.swing.JComboBox<String> estado_usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JTable jtl_consultar_usuario;
    private javax.swing.JTextField login_usuario;
    private javax.swing.JTextField nome_usuario;
    private javax.swing.JTextField numero_usuario;
    private javax.swing.JTextField pesquisa_usuario;
    private javax.swing.JTextField rua_usuario;
    private javax.swing.JPasswordField senha_usuario;
    private javax.swing.JComboBox<String> servico_usuario;
    private javax.swing.JTextField telefone_usuario;
    // End of variables declaration//GEN-END:variables
}
