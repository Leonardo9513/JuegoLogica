package principal;

import principal.flContaminacion.CotaN1P1;
import principal.flContaminacion.CotaN2P1;
import principal.flContaminacion.CotaN3P1;

public class ContaNiveles extends javax.swing.JDialog {

    
    public ContaNiveles(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAtrasC = new javax.swing.JButton();
        btnivel3 = new javax.swing.JButton();
        btnivel1 = new javax.swing.JButton();
        btnivel2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Doppio One", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Escoge Nivel de Dificultad de Juego ");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/conta.gif"))); // NOI18N

        btnAtrasC.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAtrasC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back32.png"))); // NOI18N
        btnAtrasC.setText("REGRESAR");
        btnAtrasC.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAtrasC.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back32.png"))); // NOI18N
        btnAtrasC.setRolloverEnabled(true);
        btnAtrasC.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back48.png"))); // NOI18N
        btnAtrasC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasCActionPerformed(evt);
            }
        });

        btnivel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnivel3.setForeground(new java.awt.Color(0, 0, 0));
        btnivel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/up32.png"))); // NOI18N
        btnivel3.setText("NIVEL A");
        btnivel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnivel3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/up32.png"))); // NOI18N
        btnivel3.setRolloverEnabled(true);
        btnivel3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/up48.png"))); // NOI18N
        btnivel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnivel3ActionPerformed(evt);
            }
        });

        btnivel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnivel1.setForeground(new java.awt.Color(0, 0, 0));
        btnivel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/up32.png"))); // NOI18N
        btnivel1.setText("NIVEL B");
        btnivel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnivel1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/up32.png"))); // NOI18N
        btnivel1.setRolloverEnabled(true);
        btnivel1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/up48.png"))); // NOI18N
        btnivel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnivel1ActionPerformed(evt);
            }
        });

        btnivel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnivel2.setForeground(new java.awt.Color(0, 0, 0));
        btnivel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/up32.png"))); // NOI18N
        btnivel2.setText("NIVEL M");
        btnivel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnivel2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/up32.png"))); // NOI18N
        btnivel2.setRolloverEnabled(true);
        btnivel2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/up48.png"))); // NOI18N
        btnivel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnivel2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnivel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAtrasC, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnivel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnivel3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnivel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnivel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnivel3)
                        .addGap(18, 18, 18)
                        .addComponent(btnAtrasC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasCActionPerformed
        Categorias cate = new Categorias();
        cate.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasCActionPerformed

    private void btnivel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnivel2ActionPerformed
        this.hide();
        CotaN2P1 dialog = new CotaN2P1(new javax.swing.JFrame(), true);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }//GEN-LAST:event_btnivel2ActionPerformed

    private void btnivel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnivel1ActionPerformed
        this.hide();
        CotaN1P1 dialog = new CotaN1P1(new javax.swing.JFrame(), true);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    
    }//GEN-LAST:event_btnivel1ActionPerformed

    private void btnivel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnivel3ActionPerformed
        this.hide();
        CotaN3P1 dialog = new CotaN3P1(new javax.swing.JFrame(), true);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }//GEN-LAST:event_btnivel3ActionPerformed

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
            java.util.logging.Logger.getLogger(ContaNiveles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContaNiveles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContaNiveles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContaNiveles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ContaNiveles dialog = new ContaNiveles(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtrasC;
    private javax.swing.JButton btnivel1;
    private javax.swing.JButton btnivel2;
    private javax.swing.JButton btnivel3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}