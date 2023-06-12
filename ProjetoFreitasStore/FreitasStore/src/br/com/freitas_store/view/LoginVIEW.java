package br.com.freitas_store.view;

import javax.swing.JOptionPane;
import br.com.freitas_store.ctr.UsuarioCTR;
import br.com.freitas_store.dto.UsuarioDTO;

public class LoginVIEW extends javax.swing.JFrame {

    UsuarioDTO usuarioDTO = new UsuarioDTO();
    UsuarioCTR usuarioCTR = new UsuarioCTR();

    public LoginVIEW() {
        initComponents();
        setLocationRelativeTo(null);
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/login.png")).getImage());
        login_usuario.setText("victor");
        senha_usuario.setText("1234");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        login_usuario = new javax.swing.JTextField();
        senha_usuario = new javax.swing.JPasswordField();
        btnLimpar = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setText("LOGIN:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 110, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setText("SENHA:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 110, 30));

        login_usuario.setBackground(new java.awt.Color(255, 255, 204));
        login_usuario.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        getContentPane().add(login_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 110, 30));

        senha_usuario.setBackground(new java.awt.Color(255, 255, 204));
        senha_usuario.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        getContentPane().add(senha_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 110, 30));

        btnLimpar.setBackground(new java.awt.Color(255, 255, 204));
        btnLimpar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/limpar.png"))); // NOI18N
        btnLimpar.setText("LIMPAR");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 110, 30));

        btnLogin.setBackground(new java.awt.Color(255, 255, 204));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/confirmar.png"))); // NOI18N
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 110, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/tela_login.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if (verifica_preenchimento())
            logar();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        login_usuario.setText("");
        senha_usuario.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

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
            java.util.logging.Logger.getLogger(LoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginVIEW().setVisible(true);
            }
        });
    }

    public void logar() {
        usuarioDTO.setLogin_usuario(login_usuario.getText());
        usuarioDTO.setSenha_usuario(String.valueOf(senha_usuario.getPassword()));
        usuarioDTO.setServico_usuario(usuarioCTR.logar_usuario(usuarioDTO));
        if ((usuarioDTO.getServico_usuario() == 0) || (usuarioDTO.getServico_usuario() == 1) || (usuarioDTO.getServico_usuario() == 2)) {
            this.dispose();
            new PrincipalVIEW(usuarioDTO).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Login ou senha incorretos! ");
        }
    }

    private boolean verifica_preenchimento() {
        if (login_usuario.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Informe seu login! ");
            login_usuario.requestFocus();
            return false;
        } else if (senha_usuario.getPassword().length == 0) {
            JOptionPane.showMessageDialog(null, "Informe sua senha! ");
            senha_usuario.requestFocus();
            return false;
        } else {
            return true;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField login_usuario;
    private javax.swing.JPasswordField senha_usuario;
    // End of variables declaration//GEN-END:variables
}
