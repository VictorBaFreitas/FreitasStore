package br.com.freitas_store.view;

import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import br.com.freitas_store.dto.UsuarioDTO;

public class PrincipalVIEW extends javax.swing.JFrame {

    public PrincipalVIEW(UsuarioDTO usuarioDTO) {
        initComponents();
        setLocationRelativeTo(null);
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/br/com/freitas_store/view/imagens/store_internal.png")).getImage());

        if (usuarioDTO.getServico_usuario() == 1) {
            itemMenuUsuario.setVisible(false);
        }
        if (usuarioDTO.getServico_usuario() == 2) {
            menuCadastro.setVisible(false);
            itemMenuVenda.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon imageicon = new ImageIcon(getClass().getResource("imagens/tela_principal.jpg"));
        Image image = imageicon.getImage();
        desktopPane = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics graphics){
                graphics.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        menuBar = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        itemMenuUsuario = new javax.swing.JMenuItem();
        itemMenuFornecedor = new javax.swing.JMenuItem();
        itemMenuRoupas = new javax.swing.JMenuItem();
        menuVendaVestimenta = new javax.swing.JMenu();
        itemMenuVenda = new javax.swing.JMenuItem();
        itemMenuVestuario = new javax.swing.JMenuItem();
        menuDeslogar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Freitas Store");

        menuBar.setToolTipText("");

        menuCadastro.setMnemonic('f');
        menuCadastro.setText("Cadastro");

        itemMenuUsuario.setMnemonic('o');
        itemMenuUsuario.setText("Usuario");
        itemMenuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuUsuarioActionPerformed(evt);
            }
        });
        menuCadastro.add(itemMenuUsuario);

        itemMenuFornecedor.setMnemonic('s');
        itemMenuFornecedor.setText("Fornecedor");
        itemMenuFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuFornecedorActionPerformed(evt);
            }
        });
        menuCadastro.add(itemMenuFornecedor);

        itemMenuRoupas.setMnemonic('a');
        itemMenuRoupas.setText("Roupas");
        itemMenuRoupas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuRoupasActionPerformed(evt);
            }
        });
        menuCadastro.add(itemMenuRoupas);

        menuBar.add(menuCadastro);

        menuVendaVestimenta.setMnemonic('e');
        menuVendaVestimenta.setText("Venda / Vestuário");

        itemMenuVenda.setMnemonic('p');
        itemMenuVenda.setText("Venda");
        itemMenuVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuVendaActionPerformed(evt);
            }
        });
        menuVendaVestimenta.add(itemMenuVenda);

        itemMenuVestuario.setMnemonic('d');
        itemMenuVestuario.setText("Vestuário");
        itemMenuVestuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuVestuarioActionPerformed(evt);
            }
        });
        menuVendaVestimenta.add(itemMenuVestuario);

        menuBar.add(menuVendaVestimenta);

        menuDeslogar.setMnemonic('h');
        menuDeslogar.setText("Deslogar");
        menuDeslogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuDeslogarMouseClicked(evt);
            }
        });
        menuBar.add(menuDeslogar);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemMenuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuUsuarioActionPerformed
        abreUsuarioVIEW();
    }//GEN-LAST:event_itemMenuUsuarioActionPerformed

    private void menuDeslogarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuDeslogarMouseClicked
        this.dispose();
        new LoginVIEW().setVisible(true);
    }//GEN-LAST:event_menuDeslogarMouseClicked

    private void itemMenuFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuFornecedorActionPerformed
        abreFornecedorVIEW();
    }//GEN-LAST:event_itemMenuFornecedorActionPerformed

    private void itemMenuRoupasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuRoupasActionPerformed
        abreRoupasVIEW();
    }//GEN-LAST:event_itemMenuRoupasActionPerformed

    private void itemMenuVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuVendaActionPerformed
        abreVendaVIEW();
    }//GEN-LAST:event_itemMenuVendaActionPerformed

    private void itemMenuVestuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuVestuarioActionPerformed
        abreVestuarioVIEW();
    }//GEN-LAST:event_itemMenuVestuarioActionPerformed

    private void abreUsuarioVIEW() {
        UsuarioVIEW usuarioVIEW = new UsuarioVIEW();
        this.desktopPane.add(usuarioVIEW);
        usuarioVIEW.setVisible(true);
        usuarioVIEW.setPosicao();
    }

    private void abreFornecedorVIEW() {
        FornecedorVIEW fornecedorVIEW = new FornecedorVIEW();
        this.desktopPane.add(fornecedorVIEW);
        fornecedorVIEW.setVisible(true);
        fornecedorVIEW.setPosicao();
    }

    private void abreRoupasVIEW() {
        RoupasVIEW roupasVIEW = new RoupasVIEW();
        this.desktopPane.add(roupasVIEW);
        roupasVIEW.setVisible(true);
        roupasVIEW.setPosicao();
    }

    private void abreVendaVIEW() {
        VendaVIEW vendaVIEW = new VendaVIEW();
        this.desktopPane.add(vendaVIEW);
        vendaVIEW.setVisible(true);
        vendaVIEW.setPosicao();
    }

    private void abreVestuarioVIEW() {
        VestuarioVIEW vestuarioVIEW = new VestuarioVIEW();
        this.desktopPane.add(vestuarioVIEW);
        vestuarioVIEW.setVisible(true);
        vestuarioVIEW.setPosicao();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem itemMenuFornecedor;
    private javax.swing.JMenuItem itemMenuRoupas;
    private javax.swing.JMenuItem itemMenuUsuario;
    private javax.swing.JMenuItem itemMenuVenda;
    private javax.swing.JMenuItem itemMenuVestuario;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuDeslogar;
    private javax.swing.JMenu menuVendaVestimenta;
    // End of variables declaration//GEN-END:variables

}
