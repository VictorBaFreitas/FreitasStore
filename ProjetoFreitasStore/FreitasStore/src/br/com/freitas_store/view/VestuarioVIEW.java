package br.com.freitas_store.view;

import java.awt.Dimension;
import javax.swing.ImageIcon;

public class VestuarioVIEW extends javax.swing.JInternalFrame {

    ImageIcon camisa_preta = new ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/camisa_preta.jpg"));
    ImageIcon camisa_branca = new ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/camisa_branca.jpg"));
    ImageIcon camisa_cinza_claro = new ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/camisa_cinza_claro.jpg"));
    ImageIcon camisa_cinza_escuro = new ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/camisa_cinza_escuro.jpg"));
    ImageIcon camisa_marrom = new ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/camisa_marrom.jpg"));
    ImageIcon camisa_azul_claro = new ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/camisa_azul_claro.jpg"));
    ImageIcon camisa_azul_escuro = new ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/camisa_azul_escuro.jpg"));

    ImageIcon short_preto = new ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/short_preto.jpg"));
    ImageIcon short_branco = new ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/short_branco.jpg"));
    ImageIcon short_cinza_claro = new ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/short_cinza_claro.jpg"));
    ImageIcon short_cinza_escuro = new ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/short_cinza_escuro.jpg"));
    ImageIcon short_marrom = new ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/short_marrom.jpg"));
    ImageIcon short_azul_claro = new ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/short_azul_claro.jpg"));
    ImageIcon short_azul_escuro = new ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/short_azul_escuro.jpg"));

    public VestuarioVIEW() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCamisa = new javax.swing.JButton();
        btnShort = new javax.swing.JButton();
        cor_camisa = new javax.swing.JComboBox<>();
        cor_short = new javax.swing.JComboBox<>();
        camisa = new javax.swing.JLabel();
        bermuda = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setTitle("Vestuário");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/provador.png"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setText("CAMISA:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 70, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setText("SHORTS:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 70, 30));

        btnCamisa.setBackground(new java.awt.Color(255, 255, 204));
        btnCamisa.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnCamisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/seta.png"))); // NOI18N
        btnCamisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCamisaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCamisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 40, 30));

        btnShort.setBackground(new java.awt.Color(255, 255, 204));
        btnShort.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnShort.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/seta.png"))); // NOI18N
        btnShort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShortActionPerformed(evt);
            }
        });
        getContentPane().add(btnShort, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 40, 30));

        cor_camisa.setBackground(new java.awt.Color(255, 255, 204));
        cor_camisa.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        cor_camisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PRETO", "BRANCO", "CINZA CLARO", "CINZA ESCURO", "MARROM", "AZUL CLARO", "AZUL ESCURO" }));
        getContentPane().add(cor_camisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 140, 30));

        cor_short.setBackground(new java.awt.Color(255, 255, 204));
        cor_short.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        cor_short.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PRETO", "BRANCO", "CINZA CLARO", "CINZA ESCURO", "MARROM", "AZUL CLARO", "AZUL ESCURO" }));
        getContentPane().add(cor_short, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 140, 30));
        getContentPane().add(camisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 100, 100));
        getContentPane().add(bermuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 100, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/tela_vestuario.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCamisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCamisaActionPerformed
        int escolha;
        escolha = cor_camisa.getSelectedIndex();

        switch (escolha) {
            case 0:
                camisa.setIcon(camisa_preta);
                break;
            case 1:
                camisa.setIcon(camisa_branca);
                break;
            case 2:
                camisa.setIcon(camisa_cinza_claro);
                break;
            case 3:
                camisa.setIcon(camisa_cinza_escuro);
                break;
            case 4:
                camisa.setIcon(camisa_marrom);
                break;
            case 5:
                camisa.setIcon(camisa_azul_claro);
                break;
            case 6:
                camisa.setIcon(camisa_azul_escuro);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnCamisaActionPerformed

    private void btnShortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShortActionPerformed
        int escolha;
        escolha = cor_short.getSelectedIndex();

        switch (escolha) {
            case 0:
                bermuda.setIcon(short_preto);
                break;
            case 1:
                bermuda.setIcon(short_branco);
                break;
            case 2:
                bermuda.setIcon(short_cinza_claro);
                break;
            case 3:
                bermuda.setIcon(short_cinza_escuro);
                break;
            case 4:
                bermuda.setIcon(short_marrom);
                break;
            case 5:
                bermuda.setIcon(short_azul_claro);
                break;
            case 6:
                bermuda.setIcon(short_azul_escuro);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnShortActionPerformed

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bermuda;
    private javax.swing.JButton btnCamisa;
    private javax.swing.JButton btnShort;
    private javax.swing.JLabel camisa;
    private javax.swing.JComboBox<String> cor_camisa;
    private javax.swing.JComboBox<String> cor_short;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
