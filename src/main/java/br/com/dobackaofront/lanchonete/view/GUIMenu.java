package br.com.dobackaofront.lanchonete.view;
import br.com.dobackaofront.lanchonete.model.Lanche;
import java.awt.Dimension;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class GUIMenu extends javax.swing.JFrame {

    /**
     * Creates new form GUIMenu
     */
    public GUIMenu() {
        initComponents();
    }
    
    private void centralizarInternalFrame(JInternalFrame frame) {
        Dimension desktopSize = jDesktopPane.getSize();  // substitua pelo nome real
        Dimension frameSize = jInternalFrameCadastroLanche.getSize();

        int x = (desktopSize.width - frameSize.width) / 2;
        int y = (desktopSize.height - frameSize.height) / 2;

        frame.setLocation(x, y);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane = new javax.swing.JDesktopPane();
        jInternalFrameCadastroLanche = new javax.swing.JInternalFrame();
        jLabelCadastroLanche = new javax.swing.JLabel();
        jTextFieldCadastroLanche = new javax.swing.JTextField();
        jLabelCadastroLanchePreco = new javax.swing.JLabel();
        jTextFieldCadastroLanchePreco = new javax.swing.JTextField();
        jButtonCadastroLacheSalvar = new javax.swing.JButton();
        jButtonCadastroLancheCancelar = new javax.swing.JButton();
        jMenuBarPrincipal = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCadastroLanche = new javax.swing.JMenuItem();
        jMenuEdicao = new javax.swing.JMenu();
        jMenuItemEdicaoLanche = new javax.swing.JMenuItem();
        jMenuPesquisar = new javax.swing.JMenu();
        jMenuItemPesquisarLanche = new javax.swing.JMenuItem();
        jMenuVendas = new javax.swing.JMenu();
        jMenuItemVendasCarrinho = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lanchonete Do Back ao Front");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });

        jDesktopPane.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jDesktopPaneComponentResized(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jDesktopPaneComponentShown(evt);
            }
        });
        jDesktopPane.setLayout(new java.awt.GridBagLayout());

        jInternalFrameCadastroLanche.setTitle("Cadastro de Lanches");
        jInternalFrameCadastroLanche.setVisible(true);
        jInternalFrameCadastroLanche.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jInternalFrameCadastroLancheComponentAdded(evt);
            }
        });

        jLabelCadastroLanche.setText("Nome do Lanche:");

        jTextFieldCadastroLanche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCadastroLancheActionPerformed(evt);
            }
        });

        jLabelCadastroLanchePreco.setText("Preço:");

        jTextFieldCadastroLanchePreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCadastroLanchePrecoActionPerformed(evt);
            }
        });

        jButtonCadastroLacheSalvar.setText("Salvar");
        jButtonCadastroLacheSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroLacheSalvarActionPerformed(evt);
            }
        });

        jButtonCadastroLancheCancelar.setText("Cancelar");
        jButtonCadastroLancheCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroLancheCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrameCadastroLancheLayout = new javax.swing.GroupLayout(jInternalFrameCadastroLanche.getContentPane());
        jInternalFrameCadastroLanche.getContentPane().setLayout(jInternalFrameCadastroLancheLayout);
        jInternalFrameCadastroLancheLayout.setHorizontalGroup(
            jInternalFrameCadastroLancheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameCadastroLancheLayout.createSequentialGroup()
                .addGroup(jInternalFrameCadastroLancheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameCadastroLancheLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabelCadastroLanchePreco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldCadastroLanchePreco, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrameCadastroLancheLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonCadastroLacheSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCadastroLancheCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrameCadastroLancheLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelCadastroLanche)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldCadastroLanche, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jInternalFrameCadastroLancheLayout.setVerticalGroup(
            jInternalFrameCadastroLancheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameCadastroLancheLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jInternalFrameCadastroLancheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadastroLanche)
                    .addComponent(jTextFieldCadastroLanche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jInternalFrameCadastroLancheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCadastroLanchePreco)
                    .addComponent(jTextFieldCadastroLanchePreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addGroup(jInternalFrameCadastroLancheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastroLancheCancelar)
                    .addComponent(jButtonCadastroLacheSalvar))
                .addContainerGap())
        );

        jDesktopPane.add(jInternalFrameCadastroLanche, new java.awt.GridBagConstraints());

        jMenuCadastro.setText("Cadastro");

        jMenuItemCadastroLanche.setText("Lanche");
        jMenuItemCadastroLanche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroLancheActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadastroLanche);

        jMenuBarPrincipal.add(jMenuCadastro);

        jMenuEdicao.setText("Edição");

        jMenuItemEdicaoLanche.setText("Lanche");
        jMenuEdicao.add(jMenuItemEdicaoLanche);

        jMenuBarPrincipal.add(jMenuEdicao);

        jMenuPesquisar.setText("Pesquisar");

        jMenuItemPesquisarLanche.setText("Lanche");
        jMenuPesquisar.add(jMenuItemPesquisarLanche);

        jMenuBarPrincipal.add(jMenuPesquisar);

        jMenuVendas.setText("Vendas");

        jMenuItemVendasCarrinho.setText("Carrinho");
        jMenuVendas.add(jMenuItemVendasCarrinho);

        jMenuBarPrincipal.add(jMenuVendas);

        setJMenuBar(jMenuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowStateChanged

    private void jDesktopPaneComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jDesktopPaneComponentResized
    }//GEN-LAST:event_jDesktopPaneComponentResized

    private void jDesktopPaneComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jDesktopPaneComponentShown

    }//GEN-LAST:event_jDesktopPaneComponentShown
    
    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        centralizarInternalFrame(jInternalFrameCadastroLanche); 
    }//GEN-LAST:event_formComponentResized

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
    }//GEN-LAST:event_formComponentShown

    private void jMenuItemCadastroLancheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroLancheActionPerformed
        jInternalFrameCadastroLanche.setVisible(true);
    }//GEN-LAST:event_jMenuItemCadastroLancheActionPerformed

    private void jInternalFrameCadastroLancheComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jInternalFrameCadastroLancheComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jInternalFrameCadastroLancheComponentAdded

    private void jButtonCadastroLacheSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroLacheSalvarActionPerformed
        String nome = jTextFieldCadastroLanche.getText();
        
        if (nome.equals("")){
            JOptionPane.showMessageDialog(rootPane, "O campo nome do lanche está vazio", "Alerta!!!", HEIGHT);
        }else{
           String preco = jTextFieldCadastroLanchePreco.getText();
            
            if (preco.equals("")){
                JOptionPane.showMessageDialog(rootPane, "O campo preço do lanche está vazio", "Alerta!!!", HEIGHT);
            } else{
                try{
                    double precoConvertido = Double.parseDouble(preco);
                    Lanche lanche = new Lanche(nome, precoConvertido);
                    lanche.apresentarLanche();
                    
                    jTextFieldCadastroLanche.setText("");
                    jTextFieldCadastroLanchePreco.setText("");
                    
                    JOptionPane.showMessageDialog(rootPane, "O lanche "+nome+" foi cadastrado com sucesso.");
                    
                } catch(Exception e){
                    JOptionPane.showMessageDialog(rootPane, "O campo preço do lanche deverá ser somente números com separação por ponto", "Alerta!!!", HEIGHT);
                }
            }
            
        }
        
    }//GEN-LAST:event_jButtonCadastroLacheSalvarActionPerformed

    private void jTextFieldCadastroLanchePrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCadastroLanchePrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCadastroLanchePrecoActionPerformed

    private void jTextFieldCadastroLancheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCadastroLancheActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCadastroLancheActionPerformed

    private void jButtonCadastroLancheCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroLancheCancelarActionPerformed
        jTextFieldCadastroLanche.setText("");
        jTextFieldCadastroLanchePreco.setText("");
        jInternalFrameCadastroLanche.setVisible(false);
    }//GEN-LAST:event_jButtonCadastroLancheCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        GUIMenu janelaPrincipal = new GUIMenu();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                janelaPrincipal.setVisible(true);
                janelaPrincipal.jInternalFrameCadastroLanche.setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastroLacheSalvar;
    private javax.swing.JButton jButtonCadastroLancheCancelar;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JInternalFrame jInternalFrameCadastroLanche;
    private javax.swing.JLabel jLabelCadastroLanche;
    private javax.swing.JLabel jLabelCadastroLanchePreco;
    private javax.swing.JMenuBar jMenuBarPrincipal;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuEdicao;
    private javax.swing.JMenuItem jMenuItemCadastroLanche;
    private javax.swing.JMenuItem jMenuItemEdicaoLanche;
    private javax.swing.JMenuItem jMenuItemPesquisarLanche;
    private javax.swing.JMenuItem jMenuItemVendasCarrinho;
    private javax.swing.JMenu jMenuPesquisar;
    private javax.swing.JMenu jMenuVendas;
    private javax.swing.JTextField jTextFieldCadastroLanche;
    private javax.swing.JTextField jTextFieldCadastroLanchePreco;
    // End of variables declaration//GEN-END:variables
}
